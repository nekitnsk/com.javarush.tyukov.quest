<%--
  Created by IntelliJ IDEA.
  User: Nekitnsk
  Date: 11.02.2025
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
    <title>Test JSP</title>
</head>
<body>
<h1><%="Test"%></h1>
<h1>${requestScope.test}</h1>
</body>
</html>
