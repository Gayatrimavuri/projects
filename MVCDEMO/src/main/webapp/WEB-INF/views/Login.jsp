<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="a"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %> 
<a:Login title="Login Page">
<jsp:attribute name="head"></jsp:attribute>
<jsp:attribute name="content">
<j:out value="${msg}"></j:out>
<form:form action="getLogin" modelAttribute="login">
	<table>
		<tr><td>Username</td><td><form:input path="username"/></td><td>
		<form:errors path="username"></form:errors>
		</td></tr>
		<tr><td>Password</td><td><form:password path="password"/></td>
		<td>
		<form:errors path="password"></form:errors>
		</td>
		</tr>
		<tr><td><input type="submit"></td></tr>		
	</table>
</form:form>
</jsp:attribute>
</a:Login>
