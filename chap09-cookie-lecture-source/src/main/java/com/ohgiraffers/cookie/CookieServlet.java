package com.ohgiraffers.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        // cookie 사용 전 redirect 구문
//        resp.sendRedirect("redirect"); 값 공유 불가능!

        // cookie 사용
        /* comment. 쿠키 사용 방법
         *   1. 쿠키 생성
         *   2. 만든 쿠키의 만료 시간을 설정한다
         *   3. 응답 헤더에 쿠키를 담는다
         *   4. 응답을 보낸다
         * */

        // 1. 쿠키 생성
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        // 2. 만료 시간 설정
        firstNameCookie.setMaxAge(60*60*24); // 초 단위 설정(하루) 하루라는 뜻
        lastNameCookie.setMaxAge(60*60*24); // 초 단위 설정(하루)

        // 3. 응답 헤더에 쿠키 담기
        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        // 4. 응답 보내기 (redirect 시키기)
        resp.sendRedirect("redirect");
    }
}