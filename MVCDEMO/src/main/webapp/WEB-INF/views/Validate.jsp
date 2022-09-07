<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="a" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<a:Master title="Validation">
<jsp:attribute name="head">
<style>
.er{color:red;}
</style>

</jsp:attribute>
<jsp:attribute name="content">
<f:form action="getValidateEmp" modelAttribute="emp">
	<table>
		<tr>
			<td>Empno</td>
			<td><f:input path="empno"></f:input></td>
			<td><f:errors path="empno" cssClass="er"></f:errors></td>
		</tr>

<tr>
			<td>EmpName</td>
			<td><f:input path="ename"></f:input></td>
			<td><f:errors path="ename" cssClass="er"></f:errors></td>
		</tr>
	<tr>
			<td>Gender</td>
			<td><f:input path="gender"></f:input></td>
			<td><f:errors path="gender" cssClass="er"></f:errors></td>
		</tr>
		<tr>
			<td>Date of birth</td>
			<td><f:input type="date" path="dob"></f:input></td>
			<td><f:errors path="dob" cssClass="er"></f:errors></td>
		</tr>
		<tr>
			<td>Basic</td>
			<td><f:input path="basic"></f:input></td>
			<td><f:errors path="basic" cssClass="er"></f:errors></td>
		</tr>
		<tr>
			<td>Pancard</td>
			<td><f:input path="pancard"></f:input></td>
			<td><f:errors path="pancard" cssClass="er"></f:errors></td>
		</tr>
		
	<tr><td><input type="submit"></td></tr>
	</table>
	</f:form>
</jsp:attribute>
</a:Master>