<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 15.11.18
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            color: ${color};
            background-color: ${backgroundColor};
        }
    </style>
</head>
<body>
<h1>Witaj w widoku</h1>
</body>
</html>
<%--1. W widoku  `home.jsp` dodaj tag `style`. Tag powinien zawierać selector `body`, --%>
<%--który ustawia dwie właściwości `color` i `backgroundColor`.--%>
<%--2. Wartościami tych parametrów powinny być wartości `color` i `backgroundColor`, przekazane z kontrolera.--%>
<%--4. W akcji sprawdzaj aktualną godzinę i jeśli jest między 8:00 a 20:00 podmieniał tekst `color` i `backgroundColor`--%>
<%--odpowiednio na `black` i `white`.--%>
<%--5. Gdy godzina wypada między 20:00 a 8:00, podmień wartości właściwości odwrotnie.--%>
<%--6. Uruchom stronę i zobacz efekt. Tekst powinien być czarny, a strona biała.--%>
<%--7. Zmodyfikuj program tak, aby nie brał pod uwagę aktualnej godziny, tylko na sztywno wpisz godzinę 1:00 w nocy.--%>
<%--8. Wyświetl stronę i zobacz efekt. Tekst powinien być biały, a strona czarna.--%>
