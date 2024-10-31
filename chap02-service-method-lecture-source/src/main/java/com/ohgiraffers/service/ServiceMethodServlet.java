package com.ohgiraffers.service;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/request-service")
public class ServiceMethodServlet extends HttpServlet {
    // 서비스 메소드 오버라이드
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 위에자료형 ServletRequest 와 밑에 HttpServletRequest 일치하지 않아서 강제 형변환을 시켜준다.
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse) res;

        String httpMethod = request.getMethod();
        // request 에 있는 getMethod 를 변수에 담아준다.
        System.out.println("httpMethod = " + httpMethod);
        // GET이 httpMethod 와 일치하면?
        if(("GET").equals(httpMethod)) {
            // http 방식이 GET 이면
            doGet(request, response);
        } else if(("POST".equals(httpMethod))) {
            doPost(request, response);
        }
    /* comment.
        http 메소드는 get, post, head, options, put, delete
        등등이 있지만 가장 많이 사용되는 것은 get 과 post 이다. */
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출됨...");
    }
    // 위에 ServletRequest 는 둘다 사용 가능하지만 doGet 과 doPost 는 각각 사용하겠다는 메소드이다.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출됨...");
    }
}