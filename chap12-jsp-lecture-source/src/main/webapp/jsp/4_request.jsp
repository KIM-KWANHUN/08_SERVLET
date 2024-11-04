<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request</title>
</head>
<body>
    <h1>메뉴판</h1>
    <form action="/menu/order" method="post">
        <select name="menuName" id="menu">
            <option value="햄버거">햄버거</option>
            <option value="파스타">파스타</option>
            <option value="피자">피자</option>
            <option value="리조또">리조또</option>
        </select>
        <input type="number" min="0" max="50" step="1" name="amount">
        <button type="submit">주문하기</button>
    </form>
</body>
</html>
