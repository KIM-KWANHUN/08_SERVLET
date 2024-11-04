<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response</title>
</head>
<body>
    <%
/* comment.
      JSP 파일도 Servlet 이다.
      따라서 request 와 response 가 존재한다.
      - view 역활을 담당하는 Servlet 이라고 생각하면 좋다.*/

    String menuName = (String) request.getAttribute("menuName");
        int amount = (int) request.getAttribute("amount");
        int totalPrice = (int) request.getAttribute("totalPrice");
    %>
    <table border="1">
      <th>메뉴 이름</th>
      <th>주문 수량</th>
      <th>최종가격</th>
      <tr>
        <td><%=menuName%></td>
        <td><%=amount%></td>
        <td><%=totalPrice%></td>
      </tr>
    </table>
    <%--
        comment.
            이렇게 JSP 를 사용하게 되면 서블릿 클래스에서
            VIEW 를 만드는 것 보다 훨씬 간편하게 만들 수 있다.
            따라서 여기서 알 수 있는 것은
            JSP 는 VIEW 에 적합한 SERVLET, CLASS SERVLET 은 비즈니스
            로직에 적합한 서블릿 이라는 결론에 도달할 수 있다.
            그래서 spring-mvc model2 구조에서는
            서블릿을 controller 계층, jsp 를 view 계층
            으로 구현을 하게 된다.
     --%>
</body>
</html>
