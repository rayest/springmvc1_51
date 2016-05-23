<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加联系人</title>
</head>
<body>
<%--纯html表单
<form action="result" method="get">
    姓名:<input type="text" name="name"><br>
    年龄:<input type="number" name="age"><br>
    <input type="submit">
</form>
--%>

<%-- springmvc提供的表单 --%>
<form:form action="result" method="post" modelAttribute="user">
    名字：<form:input path="name"/><br>
    年龄：<form:input path="age"/><br>
    <input type="submit">
</form:form>
</body>
</html>