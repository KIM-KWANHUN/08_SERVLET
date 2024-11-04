package com.ohgiraffers.jsp.service;

public class MenuPriceCalculator {

    public int calcTotalPrice(String menuName, int amount) {

        int totalPrice = 0;

        switch (menuName) {
            case "햄버거" :
                totalPrice = 9000 * amount;
                break;
            case "파스타" :
                totalPrice = 11000 * amount;
                break;
            case "피자" :
                totalPrice = 25000 * amount;
                break;
            case "리조또" :
                totalPrice = 10000 * amount;
                break;
        }

        return totalPrice;
    }
}
