package com.cydeo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56,
                amount2 = 374.26;

        System.out.println(amount1-amount2); // must be 0.30 but returns 0.30000000000001137

        /**there are two ways of creating bigDecimal*/
        BigDecimal b1 = new BigDecimal("374.56"); // new BigDecimal(value as a string)
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56); // or classname and then static method
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;


        System.out.println(b1.subtract(b2)); //0.30
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));




    }
}
