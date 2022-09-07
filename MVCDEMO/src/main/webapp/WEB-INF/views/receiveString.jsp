<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a:out value="${msg}"></a:out>
<a:set var="a" value="${10}"></a:set>
<a:out value="${a}"></a:out>
<a:set var="marks" value="${65}"></a:set>
<a:if test="${marks>80}">
	<a:out value="${'Pass'}"></a:out>
</a:if>

<a:choose>
   <a:when test="${marks>=90}">
		<a:out value="${'Excellent'}"></a:out>
   </a:when>
   <a:when test="${marks>=80}">
 		<a:out value="${'Very good'}"></a:out>
   </a:when>
	<a:when test="${marks>=70}">
 		<a:out value="${'Must improve'}"></a:out>
   </a:when>
   <a:otherwise>
		<a:out value="${'Sorry'}"></a:out>
   </a:otherwise>
</a:choose>
<a:forEach var="a" begin="1" end="10" step="1">
		<a:out value="${a}"></a:out>
</a:forEach>




</body>
</html>