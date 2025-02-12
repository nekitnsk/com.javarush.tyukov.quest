<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<footer class="mt-auto text-white-50">
    <p>IP: ${sessionScope.get("ipAddress")} HostName: ${sessionScope.get("hostName")}</p>

</footer>
</div>
<script src="/resources/js/bootstrap.bundle.min.js"></script>

</body>
</html>
