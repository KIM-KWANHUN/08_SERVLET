package com.ohgiraffers.redirect.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/otherservlet")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("GET 요청 정상 수락...");
        // 데이터 관련 비즈니스 수행 구역
        // 데이터 관련 비즈니스 수행 구역 예시
        Logic logic = new Logic();
        logic.registData();

        resp.sendRedirect("redirect?name=kim&age=20");
    }

    }

