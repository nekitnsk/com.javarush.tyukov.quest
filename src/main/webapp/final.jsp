<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<jsp:include page="header.jsp"/>

    <main class="px-3">
        <h1>Поздравляем!</h1>
        <p class="lead">Наш менеджер подобрал лучшую вакансию и скоро с вами свяжутся!</p>
        <p class="lead">
            <a href="${pageContext.request.contextPath}/test?answer=restart" class="btn btn-lg btn-light fw-bold border-white bg-white">Хочу ещё тест</a>
        </p>
    </main>

<jsp:include page="footer.jsp"/>