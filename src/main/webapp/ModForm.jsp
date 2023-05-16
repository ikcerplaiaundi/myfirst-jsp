<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="modelo.DTO.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<form action="ModUsuario" method="post">
		<label for="nombre">id</label> 
		<input type="text" name="id" id="" value="${ usuario.getId() }"><br> 
		
		<label for="nombre">newnombre</label>
		<input type="text" name="nombre" id="" value="${ usuario.getNombre() }"><br>

		<label for="dni">newdni</label> 
		<input type="text" name="dni" id="" value="${ usuario.getDni() }"><br> 
		
		<label for="codigo">newcodigo</label>
		<input type="text" name="codigo" id="" value="${ usuario.getCodigo() }"><br> 
		
		<label for="birthdate">birthdate</label>
		<input type="text" name="birthdate" id="" value="${ usuario.getStringBirthDate() }"><br> 
		
		<input type="submit" name="Mod" value="Mod" />
	</form>

	<a href="Principal">volver</a>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous">
		
	</script>
</body>
</html>