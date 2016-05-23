<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<div>
    <c:forEach items="${map}" var="m">
        ${m.key}------->${m.value}
    </c:forEach>
</div>
</body>
</html>
