<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="filmGet" method="get">
    电影片名:<input type="text" name="name"><br>
    上映年份:<input type="number" name="year"><br>
    <input type="submit">
</form>
</body>
</html>
