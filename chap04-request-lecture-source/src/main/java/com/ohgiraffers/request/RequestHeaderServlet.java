package com.ohgiraffers.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")
public class RequestHeaderServlet extends HttpServlet {
    // a태그 링크는 무조건 GET 방식을 사용한다.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerName = req.getHeaderNames();
//        hasMoreElements 안에 요소를 다 출력할 때 까지 반복
        while (headerName.hasMoreElements()){
            System.out.println(headerName.nextElement());
        }
    }
}