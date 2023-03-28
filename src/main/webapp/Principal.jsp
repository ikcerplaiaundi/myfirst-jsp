<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>



	<h1>formulario</h1>
	
		
		<c:forEach items="${usuarios}" var="usuario">
			<form action="Principal" method="post">
				<label for="id">id</label>
				<input type="text"  
				name="id" id="${usuario.getId()}" 
				value="${usuario.getId()}">
			
			
				<label for="name">El name es(${usuario.getNombre()}) </label> 
			
				
				<input type="submit" name="delete${usuario.getId()}" value="delete"/>
				<a href="ModUsuario?id=${usuario.getId()}">mod este</a>
				
				
			</form>
			<br>
			
		</c:forEach>
		
		<a href="InserUsuario">insertar nuevo</a>
	
	
	
	


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous">
		
	</script>
</body>
</html>