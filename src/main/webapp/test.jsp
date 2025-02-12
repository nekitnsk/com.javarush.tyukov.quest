<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<jsp:include page="header.jsp"/>

    <main class="px-3">
        <h1>${requestScope.question.question}</h1>

        <form action="${pageContext.request.contextPath}/test" method="post" name="test">
            <button type="submit" name="answer" value="${requestScope.answer1.getNextStep()}">${requestScope.answer1.getAnswer()}</button>
            <button type="submit" name="answer" value="${requestScope.answer2.getNextStep()}">${requestScope.answer2.getAnswer()}</button>
        </form>

        <br>
        <form action="${pageContext.request.contextPath}/test" method="post" name="restart">
            <button type="submit" name="answer" value="restart">Начать тест заново</button>
        </form>

    </main>

    <jsp:include page="footer.jsp"/>