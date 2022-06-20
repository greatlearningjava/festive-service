package com.greatlearning.microservice.service;

import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

@Service
public class FestiveSeriveImpl {

    public Long applyDiscount(String orderId, Long amount, String code ){
        if("festiva".equals(code)) {
            return amount * 1 /2;
        }
        return amount;
    }

}
