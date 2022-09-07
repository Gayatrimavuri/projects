<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="a" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<a:Master title="Fetch">
<jsp:attribute name="head">
<script>
function Fetchdata()
{
	var eno=document.getElementsByName("empno")[0].value;
	window.location.href="GetDetails/"+eno;
	}

</script>

</jsp:attribute>
<jsp:attribute name="content">
<form action="GetDetails" method="post">
	<table>
			<tr>
				<td>Empno</td>
				<td><input type="text" name="empno" value="${E.getEmpno()}" onblur="Fetchdata();"></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="ename" value="${E.getEname()}"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="text" name="gender" value="${E.getGender()}"></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><input type="text" name="dob" value="${E.getDob()}"></td>
			</tr>
			<tr>
				<td>Basic</td>
				<td><input type="text" name="basic" value="${E.getBasic()}"></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>

</form>

</jsp:attribute>
</a:Master>