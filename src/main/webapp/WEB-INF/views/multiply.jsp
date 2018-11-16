<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 15.11.18
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>
<table>
    <thead>
    <td>| x |</td>
    <c:forEach var="a" begin="1" end="${size}">
        <td>| ${a} |</td>
    </c:forEach>
    </thead>
    <tbody>
    <c:forEach var="i" begin="1" end="${size}">
        <tr>
            <td>| ${i} |</td>
            <c:forEach var="j" begin="1" end="${size}">
                <td>| ${i*j} |</td>
            </c:forEach>
        </tr>
    </c:forEach>
    <%--<%= size %> times table ... <br>--%>
    <%--<table border=1>--%>
    <%--<% for (int k=1; k<=6; k++) {--%>
    <%--int result = k * number; %>--%>
    <%--<tr><td><%= k %></td><td><%= result %></td></tr>--%>
    <%--<% } %>--%>
    <%--</table><hr>--%>
    </tbody>
</table>
</body>
</html>
