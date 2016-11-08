<%--
  Created by IntelliJ IDEA.
  User: Igaryok
  Date: 23.07.2016
  Time: 1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/style/style.css"/>
    <title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>
    <div class = "header"><tiles:insertAttribute name="header"></tiles:insertAttribute></div>
    <div class = "menu"><tiles:insertAttribute name="menu"></tiles:insertAttribute></div>
    <div class = "body"><tiles:insertAttribute name="body"></tiles:insertAttribute></div>
    <div class = "footer"><tiles:insertAttribute name="footer"></tiles:insertAttribute></div>
</body>
</html>
