<%--
  Created by IntelliJ IDEA.
  User: Igaryok
  Date: 14.07.2016
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>AllProducts here!!!</h2>

            <c:forEach items="${products}" var="products">
                <a href = "/products=${products.id}">
                    <div style="width: 150px; height: 150px; float: left">
                        <p>${products.brand}</p>
                    </div>
                </a>
            </c:forEach>

<a href="/productNew">New Product</a>
</body>
</html>
