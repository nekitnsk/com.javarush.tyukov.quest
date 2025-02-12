<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<jsp:include page="header.jsp"/>

    <main class="px-3">
        <h1>Тест вашей профориентации</h1>

        <form action="/test" method="post">
            <input type="submit" name="answer" value="One">
            <input type="submit" name="answer" value="Two">
        </form>

    </main>

    <jsp:include page="footer.jsp"/>