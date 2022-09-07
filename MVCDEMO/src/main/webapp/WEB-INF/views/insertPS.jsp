<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mp" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<mp:Master title="">
	<jsp:attribute name="head"></jsp:attribute>
	<jsp:attribute name="content">
	<form action="getEmpPS">
		<table>
			<tr>
				<td>Empno</td>
				<td><input type="text" name="empno"></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td>Basic</td>
				<td><input type="text" name="basic"></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="Insert"></td>
			</tr>
		</table>
	<a:out value="${msg}"></a:out>
	
	</form>
	</jsp:attribute>
</mp:Master>