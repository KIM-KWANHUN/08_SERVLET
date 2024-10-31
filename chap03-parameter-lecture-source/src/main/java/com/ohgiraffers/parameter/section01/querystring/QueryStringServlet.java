package com.ohgiraffers.parameter.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/querystring")
public class QueryStringServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet() 호출됨...");
        // HttpServletRequest req 에 우리가 입력한 값이 담겨져 있음
        /* comment.
        *   HttpServletRequest 객체는 통해 우리가 화면에서
        *   요청한 값을 getParameter() 메소드로 꺼내올 수 있다.
        *   인자로 input 태그에 지정한 name 속성의 값을
        *   getParameter() 메소드에 전달해주면 된다. */
        // 우리가 입력한 값 꺼내오기 내부인자는 string 타입으로 받고있음
        // 변수에 담아주기
        // 화면에서 받아오는 값은 다 string 타입으로 온다 pasing 을 이용해라
        String name = req.getParameter("name");
        System.out.println("우리가 view 에서 입력한 이름 : " + name);
        // 파싱 작업
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("나이 : " + age);

        Date birthday = Date.valueOf(req.getParameter("brith"));
        System.out.println("생일 : " + birthday);

        String gender = req.getParameter("gender");
        System.out.println("성별 : " + gender);

        String national = req.getParameter("national");
        System.out.println("국적 : " + national);
        // 취미는 여러개를 선택할 수 있으니 배열로 getParameterValues 이용해 받아야한다.
        String[] hobbies = req.getParameterValues("hobbies");
        System.out.println("취미 : ");
        for(String hobby : hobbies) {
            System.out.println(hobby);
        }


    }
}
