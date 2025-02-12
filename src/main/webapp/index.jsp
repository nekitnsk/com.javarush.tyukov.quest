<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<jsp:include page="header.jsp"/>

    <main class="px-3">
        <h1>Тест вашей профориентации</h1>
        <p class="lead">Этот тест поможет вам понять чем вы хотите заниматься и к чему больше всего вас тянет. А также определиться с реально возможными доходами, исходя из вашего опыта и образования.</p>
        <p class="lead">
            <a href="${pageContext.request.contextPath}/test" class="btn btn-lg btn-light fw-bold border-white bg-white">Давайте уже начнем</a>
        </p>
    </main>

<jsp:include page="footer.jsp"/>