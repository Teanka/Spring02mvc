<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 15.11.18
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form method="POST" action="">//"/first/form" bo jesli nie poda się adresu to się wyświetli z tego z którego wysyłamy
    <div class="form-group">
        <h4>Formularz</h4>
        <input type="text" id="startDate" name="paramName" required>
    </div>
    <button type="submit" class="btn btn-primary">Utwórz formularz</button>
</form>
</body>
</html>
