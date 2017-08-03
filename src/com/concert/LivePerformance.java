package com.concert;

import org.springframework.stereotype.Component;

@Component
public class LivePerformance implements Performance {
    @Override
    public void performance() {
        System.out.println("Live performance!");
    }
}
