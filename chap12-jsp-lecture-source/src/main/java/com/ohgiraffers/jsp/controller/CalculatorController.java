package com.ohgiraffers.jsp.controller;

import com.ohgiraffers.jsp.service.CalculatorService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int num1 = Integer.parseInt(req.getParameter("number1"));
        int num2 = Integer.parseInt(req.getParameter("number2"));
        String operator = req.getParameter("operator");

        int total = new CalculatorService().calculTotal(num1, num2, operator);

        req.setAttribute("number1", num1);
        req.setAttribute("number2", num2);
        req.setAttribute("operator", operator);
        req.setAttribute("total", total);

        RequestDispatcher rd = req.getRequestDispatcher("jsp/7_calculatingResponse.jsp");
        rd.forward(req, resp);

    }
}
