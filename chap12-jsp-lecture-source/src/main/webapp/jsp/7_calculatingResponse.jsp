<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculationResponse</title>
</head>
<body>
    <%
    int num1 = (int) request.getAttribute("number1");
    int num2 = (int) request.getAttribute("number2");
    String operator = (String) request.getAttribute("operator");
    int total = (int) request.getAttribute("total");
    %>
    <h1>계산결과!!</h1>
    <table border="5px">
        <th>숫자 1</th>
        <th>연산기호</th>
        <th>숫자 2</th>
        <th>최종결과</th>
        <tr>
            <td><%=num1%></td>
            <td><%=operator%></td>
            <td><%=num2%></td>
            <td><%=total%></td>
        </tr>
    </table>
</body>
</html>
