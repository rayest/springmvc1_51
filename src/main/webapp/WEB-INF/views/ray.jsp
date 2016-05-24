<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/24 0024
  Time: 下午 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>About Ray</title>
</head>
<body>
<form:form action="RayGet" method="get" modelAttribute="ray">
    姓名：<form:input path="name"/><br>
    性别：<form:input path="sex"/><br>
    家乡：<form:input path="hometown"/><br>
    年龄：<form:input path="age"/><br>
    爱好：<form:input path="interest"/><br><br>
    想去的地方：<form:input path="placeWantToGo"/><br>
    想去见的人：<form:input path="PeopleWantToSee"/><br>
    想吃的食物：<form:input path="FoodLoveToEat"/><br>
    想读的书刊：<form:input path="bookWantToRead"/><br>
    想看的电影：<form:input path="MovieWantToWatch"/><br>
    想听的音乐：<form:input path="MusicWantToListen"/><br>
    <input type="submit">
</form:form>
</body>
</html>
