<%--
  Created by IntelliJ IDEA.
  User: Igaryok
  Date: 28.07.2016
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/createModel">
    <input type="text" name="model">
    <input type="text" name="memory">
    <input type="text" name="price">
    <c:forEach items="${products}" var="p">
        <input name="products" type="radio" value="${p.id}">${p.brand}
    </c:forEach>
    <button value="post">Send!</button>
</form>
</body>
</html>

