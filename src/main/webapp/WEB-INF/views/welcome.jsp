<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/15 0015
  Time: 下午 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <style type="text/css" >
        select#selectWhereYouWannaGo ,select#selectTheSpecial {
        width                    : 185pt;
        height                   : 40pt;
        line-height              : 40pt;
        padding-right            : 20pt;
        text-indent              : 4pt;
        text-align               : left;
        vertical-align           : middle;
        box-shadow               : inset 0 0 3px #606060;
        border                   : 1px solid #acacac;
        -moz-border-radius       : 6px;
        -webkit-border-radius    : 6px;
        border-radius            : 6px;
        -webkit-appearance       : none;
        -moz-appearance          : none;
        appearance               : none;
        font-family              : Arial,  Calibri, Tahoma, Verdana;
        font-size                : 18pt;
        font-weight              : 500;
        color                    : #333333;
        cursor                   : pointer;
        outline                  : none;
    }

    div#citySelection, div#specialSelection{ position: relative; display: inline-block;}

    div#citySelection::after, div#specialSelection::after
    {
        content                 : "\25bc";
        position                : absolute;
        top                     : 0;
        right                   : 0;
        bottom                  : 0;
        width                   : 20pt;
        line-height             : 40pt;
        vertical-align          : middle;
        text-align              : center;
        background              : #333333;
        color                   : #fefefe;
        -moz-border-radius       : 0 6px 6px 0;
        -webkit-border-radius    : 0 6px 6px 0;
        border-radius           : 0 6px 6px 0;
        pointer-events          : none;
    }
    </style>

</head>
<body>
<h1>Hello World!</h1>
<div id="citySelection">
    <select id="selectWhereYouWannaGo" title="cityForChoosing">
        <option>Mingguang</option>
        <option>Lanzhou</option>
        <option>Nanjing</option>
        <option>Shanghai</option>
        <option>Beijing</option>
        <option>Xi'an</option>
        <option>Suzhou</option>
        <option>Shenzhen</option>
    </select>
</div>
<div id="specialSelection">
    <select id="selectTheSpecial" title="specialForChoosing">
        <option>SmallCity</option>
        <option>StretchedNoodles</option>
        <option>1912</option>
        <option>Modern</option>
        <option>ModernAndAncient</option>
        <option>TangDynasty</option>
        <option>WaterAndBride</option>
        <option>Parvenu</option>
    </select>
</div>
<br/>
<h1>${name}</h1>
<h1>${age}</h1>
<h1>${sex}</h1>

<h2>${hello_1}</h2>
<h2>${hello_2}</h2>


<div>
    <c:forEach items="${map}" var="m">
        ${m.key}------->${m.value}
    </c:forEach>
</div>


</body>
</html>
