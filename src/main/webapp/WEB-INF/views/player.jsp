<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<div>
    <c:forEach items="${map}" var="m">
        <h2>${m.key} : ${m.value}</h2>
    </c:forEach>
</div>
</body>
</html>
