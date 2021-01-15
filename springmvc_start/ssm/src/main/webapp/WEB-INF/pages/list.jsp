<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/14
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a1>显示所有的账户信息</a1>
<c:forEach items="${allAccount}" var="account">
    ${account}
</c:forEach>
</body>
</html>
