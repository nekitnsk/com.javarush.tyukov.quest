<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<footer class="mt-auto text-white-50">
    <p>IP: ${sessionScope.get("ipAddress")} Счётчик: ${sessionScope.get("counterTest")}</p>

</footer>
</div>
</body>
</html>
