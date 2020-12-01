<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 苏荣斌
  Date: 2020/11/27
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${branches_id}" var="i">
网点名称:<input type="text" value="${i.name}" ><br>
营业执照号:<input type="text" value="${i.businessNo}"><br>
联系电话:<input type="text" value="${i.telephone}"><br>
网点简介:<input type="text" value="${i.summary}" ><br>
<input type="submit" value="返回">
</c:forEach>

</body>
</html>