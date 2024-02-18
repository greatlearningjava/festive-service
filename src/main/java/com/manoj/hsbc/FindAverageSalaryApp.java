package com.manoj.hsbc;

import java.util.*;
import java.util.stream.Collectors;

public class FindAverageSalaryApp {
    public void findAverageSalary(List<Employee> employees){

//        HashMap<String, List<Employee>> map = new HashMap<>();
//
//        for (Employee emp: employees) {
//            //System.out.println(emp);
//            List<Employee> listExist = map.get(emp.getOfficeLocation());
//            if(listExist == null){
//                ArrayList<Employee> newList = new ArrayList<>();
//                newList.add(emp);
//                map.put(emp.getOfficeLocation(), newList);
//            }else{
//                listExist.add(emp);
//                map.put(emp.getOfficeLocation(), listExist);
//            }
//
//        }
//
//        System.out.println(employees.stream().filter(employee -> employee.getOfficeLocation().equals("Pune")).count());
//        System.out.println(employees.stream().filter(employee -> employee.getOfficeLocation().equals("Pune")).max(Comparator.comparing(Employee::getSalary)).get());
//
//        System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)).get());
//        System.out.println(employees.stream().map(Employee::getDepartment).distinct().count());
//        System.out.println(employees.parallelStream().map(Employee::getDepartment).distinct().count());
//       // System.out.println(employees.stream().forEach(employee -> employee.getOfficeLocation()).max(Comparator.comparing(Employee::getSalary)).get());
//
//        System.out.println(employees.parallelStream().allMatch(e -> e.getOfficeLocation().startsWith("P")));
//        System.out.println(employees.parallelStream().anyMatch(e -> e.getOfficeLocation().startsWith("P")));
//        System.out.println(employees.stream().map(Employee::getSalary).reduce(0.00 , (sum,emp1) -> sum + emp1));
//
//        Map<String, Map<String, List<Employee>>> groupMap = employees.stream().collect(Collectors.groupingBy(Employee::getOfficeLocation, Collectors.groupingBy(Employee::getDesignation)));
//        groupMap.entrySet().stream().forEach(entry -> {
//            String city = entry.getKey();
//            System.out.println("city:" + city);
//            Map<String, List<Employee>> value = entry.getValue();
//            value.entrySet().stream().forEach(listEntry -> {
//                System.out.println(listEntry.getKey() + "," + listEntry.getValue().stream().collect(Collectors.averagingDouble(Employee::getSalary)));
//            });
//        });

        Map<String, Map<String, Double>> avgSalByLocAndDesignation = employees.parallelStream()
                .collect(Collectors.groupingBy(Employee::getOfficeLocation, Collectors.groupingBy(Employee::getDesignation, Collectors.averagingDouble(Employee::getSalary))));

        Map<String, Map<String, Double>> avg
        = employees.parallelStream().collect(Collectors.groupingBy(Employee::getOfficeLocation, Collectors.groupingBy(Employee::getDesignation, Collectors.averagingDouble(Employee::getSalary))));

        avg.forEach((loc, desigMap) -> {
            System.out.println(loc);
            desigMap.forEach((desig , avgSal) -> {
                System.out.println(desig + ", avg sal=" + avgSal);
            });
        });

        avgSalByLocAndDesignation.forEach((office, designantionMap) -> {
            System.out.println(office);
            designantionMap.forEach((designantion, averageSalary) -> {
                System.out.println(designantion + ", Average Salary=" + averageSalary );
            });
        });

//        Map<String, Double> map2 = employees.stream().collect(Collectors.groupingBy(Employee::getOfficeLocation, Collectors.averagingDouble(Employee::getSalary)));
//
//        map2.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "," + entry.getValue()));
//
//        employees.stream().collect(Collectors.groupingBy(employee -> employee.getOfficeLocation()));
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        System.out.println(numbers.stream().reduce(0, (a,b) -> a+b).intValue());

//        map.entrySet().stream().forEach();

    }
}
