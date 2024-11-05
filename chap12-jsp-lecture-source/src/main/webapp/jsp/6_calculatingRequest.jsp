<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculatingRequest</title>
</head>
<body>
  <%
  %>
  <h1>초간단 계산기</h1>
  <form action="/calculator" method="post">
    <label>숫자1 : </label>
    <input type="text" name="number1">
    <br>
    <label>숫자2 : </label>
    <input type="text" name="number2">
    <br>
    <select name="operator">
      <option value="+">+</option>
      <option value="-">-</option>
      <option value="*">*</option>
      <option value="/">/</option>
      <option value="%">%</option>
    </select>
    <button type="submit" name="total">결과</button>
  </form>
</body>
</html>
