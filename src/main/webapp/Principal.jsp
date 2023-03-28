<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	
		<%
		ArrayList <Usuario> usuarios = (ArrayList <Usuario>) request.getAttribute("usuarios");
		for (Usuario usuario : usuarios) {
		%>
			<form action="Mandardata" method="post">
				<label for="id">id</label>
				<input type="text"  
				name="id" id="<%out.print(usuario.getId());%>" 
				value="<%out.print(usuario.getId());%>">
			
			
				<label for="name">El name es(<%out.print(" " + usuario.getNombre());%>) </label> 
			
				
				<input type="submit" name="delete<%out.print(usuario.getId());%>" value="delete"/>
				
				
				
			</form><br>
			
			
		<%
		}
		%>
		<a href="InserUsuario">insertar nuevo</a>
	
	
	
	


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous">
		
	</script>
</body>
</html>