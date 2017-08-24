<%--
  Created by IntelliJ IDEA.
  User: Маша
  Date: 14.03.2017
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ввод</title>
</head>
<body>
<form action="http://192.168.0.104:8080/addservlet">
    <h1>Добавить студента</h1>
    Name   <input type="text" name="name"> <br>
    Grupa  <input type="text" name="grupa"><br>
    Ocenka <input type="text" name="ocenka"><br>
    <input type="submit" value="Добавить Студента">
    <br>
    <br>

</form>
<form action="http://192.168.0.104:8080/delservlet">
    <h1>Удалить студента</h1>
    Введите индекс пользователя <input type="text" name="id"><br>
    <input type="submit" value="Удалить студента"><br>
    <br>
    <br>

</form>

<form action="http://192.168.0.104:8080/showservlet">
    <h1>Показать список студентов</h1>
    <input type="submit" value="Показать"><br>
    <br>
    <br>

</form>

</body>
</html>
