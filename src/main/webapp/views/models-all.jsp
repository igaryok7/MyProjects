<%--
  Created by IntelliJ IDEA.
  User: Igaryok
  Date: 28.07.2016
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${models}" var="m">
    <div>
        <p>id: ${m.id}</p>
        <p>model: ${m.model}</p>
        <p>memory: ${m.memory}</p>
        <p>price: ${m.price}</p>
        <p>products: ${m.products}</p>
    </div>
</c:forEach>
