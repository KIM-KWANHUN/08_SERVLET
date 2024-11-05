package com.ohgiraffers.jsp.controller;

import com.ohgiraffers.jsp.service.GugudanService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int dan = Integer.parseInt(req.getParameter("dan"));

        int total = new GugudanService().gugudan(dan);

        req.setAttribute("dan", dan);
        req.setAttribute("total", total);

        RequestDispatcher rd = req.getRequestDispatcher("jsp/09_gugudanResponse.jsp");
        rd.forward(req,resp);


    }
}
