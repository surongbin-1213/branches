<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 苏荣斌
  Date: 2020/11/27
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>营业网点查询</title>
</head>
<body>
<table cellspacing="1" cellpadding="1" border="1">
    <tr>
        <td>网点名称</td>
        <td>所在城区</td>
        <td>网点地址</td>
        <td>联系电话</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${branches}" var="i">
    <tr>
        <td>${i.businessNo}</td>
        <td>${i.cityArea}</td>
        <td>${i.name}</td>
        <td>${i.telephone}</td>
        <td><a href="/index.html?id=${i.id}">查询</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
