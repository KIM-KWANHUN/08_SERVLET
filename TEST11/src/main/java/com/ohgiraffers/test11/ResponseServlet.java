package com.ohgiraffers.test11;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = (String) req.getAttribute("id");

        StringBuilder sb = new StringBuilder();
        sb.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("</h3>")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print(sb.toString());

        out.flush();
        out.close();
    }
}
