<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
    <title>Привет кириллица</title>
</head>
<body>
<h1><%="Test"%></h1>
<h1>Привет кириллица! </h1>
<h1>${requestScope.test}</h1>
</body>
</html>
