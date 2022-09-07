<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mp" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<mp:Master title="Home Page">
	<jsp:attribute name="head">
	</jsp:attribute>
	<jsp:attribute name="content">
		<form action="test">
		<a:out value="${sessionScope.username }"></a:out>
			<input type="submit">
		</form>

	</jsp:attribute>




</mp:Master>

