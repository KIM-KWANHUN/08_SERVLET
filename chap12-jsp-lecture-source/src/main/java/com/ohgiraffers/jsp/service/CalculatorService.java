package com.ohgiraffers.jsp.service;

public class CalculatorService {

    public int calculTotal(int num1, int num2, String operator) {

        int total = 0;
        switch (operator) {
            case "+" :
                total = num1 + num2;
                break;
            case "-" :
                total = num1 - num2;
                break;
            case "*" :
                total = num1 * num2;
                break;
            case "/" :
                total = num1 / num2;
                break;
            case "%" :
                total = num1 % num2;
                break;

        }
        return total;
    }
}
