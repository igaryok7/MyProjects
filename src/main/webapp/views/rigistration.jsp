<%--
  Created by IntelliJ IDEA.
  User: igaryok
  Date: 21.08.2016
  Time: 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/registration" method="post">
    <h1>Sign up</h1>
    <label for="LastName">Ім'я:</label>
    <input id="LastName" type="text" name="LastName">
    <label for="FirstName">Призвище:</label>
    <input id="FirstName" type="text" name="FirstName">
    <label for="age">Вік:</label>
    <input id="age" type="text" name="age">
    <label for="email">Email:</label>
    <input id="email" type="email" name="email">
    <label for="password">Пароль:</label>
    <input id="password" type="password" name="password">
</form>
