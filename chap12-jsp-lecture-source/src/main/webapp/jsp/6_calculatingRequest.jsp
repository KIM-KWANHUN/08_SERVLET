<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculatingRequest</title>
</head>
<body>
  <%
  %>
  <form action="calculator" method="post">
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
    <button type="submit">결과</button>
  </form>
</body>
</html>
