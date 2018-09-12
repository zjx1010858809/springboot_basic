<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8>
<title></title>
</head>
<body>
<table>
<tr><td>ID</td><td>名称</td><td>类型</td></tr>
<c:forEach items="${list}" var="r">
<tr>
<td>${r.id}</td>
<td>${r.name}</td>
<td>${r.parentid}</td>
</tr>
</c:forEach>
</table>

</body>
</html>