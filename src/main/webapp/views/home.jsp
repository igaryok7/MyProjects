<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Igaryok
  Date: 13.07.2016
  Time: 0:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Hello!</h1>
    <a href = "/allProducts">All Products</a>
    <a href="/createModel">Create Models</a>
    <a href="/allModels">All Models</a>

<%--<sec:authorize access="isAnonymous"><a href="/loginpage">Login:</a></sec:authorize>--%>
</body>
</html>
