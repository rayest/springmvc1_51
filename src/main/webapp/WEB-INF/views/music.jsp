<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加联系人</title>
</head>
<body>
<%-- springmvc提供的表单 --%>
<form:form action="musicGet" method="get" modelAttribute="music">
    乐曲曲名：<form:input path="name"/><br>
    发行年份：<form:input path="year"/><br>
    <input type="submit">
</form:form>
</body>
</html>