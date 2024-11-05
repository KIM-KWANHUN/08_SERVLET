<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>gugudanRequest</title>
  <style>
     input{
      height: 30px;
      width: 200px;
    }
  </style>
</head>
<body>
<h1>초간단 구구단</h1>
<h3><label>단수를 입력하시오..</label></h3>
<form action="/gugudan" method="post">
  <input type="number" name="dan" min="2" max="9" placeholder="2부터 9까지의 수만 가능해!!" required>
  <button type="submit" name="total">입력완료~</button>
</form>
</body>
</html>
