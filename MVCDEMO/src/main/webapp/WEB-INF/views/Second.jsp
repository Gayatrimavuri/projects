<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp" %>
<mp:Master title="Second Page">
	<jsp:attribute name="head">
	<style>
	h1
	{
	color: red;
	}
	
	</style>
	
	</jsp:attribute>
	<jsp:attribute name="content">
	<h1>Hello</h1>
	
	</jsp:attribute>

</mp:Master>