package com.ruoyi;

import java.math.BigDecimal;

public class demo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("123.00");
        BigDecimal b = new BigDecimal("233.00");
        BigDecimal c = a.add(b);
        System.out.println(c);
    }
}
