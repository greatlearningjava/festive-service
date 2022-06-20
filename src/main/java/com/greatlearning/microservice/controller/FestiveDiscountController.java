package com.greatlearning.microservice.controller;

import com.greatlearning.microservice.service.FestiveSeriveImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class FestiveDiscountController {

    private  FestiveSeriveImpl festiveSerive;

    public FestiveDiscountController(FestiveSeriveImpl festiveSerive){
        this.festiveSerive = festiveSerive;
    }

    @PostMapping("/applyDiscount")
    public ResponseEntity<Long> applyDiscount(@RequestParam String orderId,
                                              @RequestParam Long amount,
                                              @RequestParam String code){
        try {
            Long amountAfterDiscount = festiveSerive.applyDiscount(orderId, amount, code);
            return new ResponseEntity<>(amountAfterDiscount, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
