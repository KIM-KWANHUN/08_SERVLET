package com.ohgiraffers.jsp.controller;

import com.ohgiraffers.jsp.service.CalculatorService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("calculator")
public class CalculatorController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num1 = Integer.parseInt(req.getParameter("number1"));
        int num2 = Integer.parseInt(req.getParameter("number2"));
        int total = req.getParameter();

        String operator = new CalculatorService().calculTotal(num1, num2);

        req.setAttribute("number1", num1);
        req.setAttribute("number2", num2);
        req.setAttribute("operator", operator);

        RequestDispatcher rd = req.getRequestDispatcher("7_calculatingResponse.jsp");
        rd.forward(req, resp);

    }
}
