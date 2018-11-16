<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 15.11.18
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>paramMultiply</title>
</head>
<body>
<table>
    <thead>
    <td>| x |</td>
    <c:forEach var="a" begin="1" end="${col}">
        <td>| ${a} |</td>
    </c:forEach>
    </thead>
    <tbody>
    <c:forEach var="i" begin="1" end="${row}">
        <tr>
            <td>| ${i} |</td>
            <c:forEach var="j" begin="1" end="${col}">
                <td>| ${i*j} |</td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
