package com.ohgiraffers.lifecycle.annotation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet(value = "/annotation-lifecycle") /* @WebServlet 벨류에 우리가 만든 annotation-lifecycle 링크를 넣어준다. */
public class LifeCycleTestServlet extends HttpServlet {
    // 주석 <!--  -->     /*  */
    private int initCount = 1;
    private int serviceCount = 1;
    private int destoryCount = 1;

    public LifeCycleTestServlet() {
        System.out.println("기본생성자 호출됨...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("annotation 방식 init() 호출 : " + initCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("annotation 방식 service() 호출 : " + serviceCount++);
    }

    @Override
    public void destroy() {
        System.out.println("annotation 방식 destroy() 호출 : " + destoryCount++);
    }
}
