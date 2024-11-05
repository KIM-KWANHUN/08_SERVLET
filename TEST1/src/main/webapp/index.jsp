<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
<form action="test" method="post">
    <label>이름 : </label><input type="text" name="name">
    <br>
    <label>나이 : </label><input type="number" name="age">
    <br>
    <label>생일 : </label><input type="date" name="birth">
    <br>
    <label>성별 : </label>
    <input type="radio" name="gender" id="male" value="M">
    <label for="male">남성</label>
    <input type="radio" name="gender" id="female" value="F">
    <label for="female">여성</label>
    <button type="submit">제출</button>
</form>
</body>
</html>