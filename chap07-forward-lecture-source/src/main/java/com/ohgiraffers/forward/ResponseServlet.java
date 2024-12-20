package com.ohgiraffers.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    // 전달받은 기능을 화면에 뿌려주는 메소드
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = (String) req.getAttribute("id"); // setAttribute 로 받은값 꺼내기

        System.out.println("Request 서블릿에서 전달 받은 ID : " + userId);

        StringBuilder response = new StringBuilder();
        response.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("</h3>")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html;charset=UTF-8"); // 사용할 UTF-8
        PrintWriter out = resp.getWriter();
    // 화면에 뛰울 화면을 프린터라이터로 쓴다.
        out.print(response.toString());

        out.flush();
        out.close();
    }
}