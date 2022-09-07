<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
   <link rel="Stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Menubar.css">
</head>
<body>
	<div
		style="position: absolute; left: 0px; top: 0px; width: 100%; height: 10%">
		<img
			src="${pageContext.request.contextPath}/resources/images/Login.png"
			style="width: 100%; height: 100%">
	</div>

	
	
	<div style="position:absolute;left:0px;top:12%;width:100%;height:10%">
		<ul>
			<li><a class="active" href="homepage">Home</a></li>
			<li><a href="#contact">Contact</a></li>
			<li style="float: right"><a href="login">Login</a></li>
		</ul>
	</div>






	<jsp:invoke fragment="head"></jsp:invoke>
	
	<div style="position:absolute;left:50px;top:35%;width:100%;height:100%">
	
		<jsp:invoke fragment="content"></jsp:invoke>
	</div>


</body>
</html>




