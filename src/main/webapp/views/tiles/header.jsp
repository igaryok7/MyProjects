<%--
  Created by IntelliJ IDEA.
  User: Igaryok
  Date: 23.07.2016
  Time: 1:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<h3>Header</h3>
<p>Привіт!<sec:authentication property="name"/></p>

<sec:authorize access="isAnonymous()"><a href="/loginpage">Login</a></sec:authorize>
<sec:authorize access="isAuthenticated()"><a href="/logout">Logout</a></sec:authorize>
