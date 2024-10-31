package com.ohgiraffers.parameter.section02.formdata;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/formdata")
public class FormDataServlet extends HttpServlet {
    @Override
    // post 방식으로 할때 url에 아무정보도 남지 않게된다. get 방식으로 쓰면 민감한 정보들이 url에 남게된다.
    // 비밀번호나 이런 중요한 방식을 처리할때는 get 방식을 쓰면 안되고 post 방식을 써야한다.
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("name = " + name);

    }
}
