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
	<h1>insertar usuario</h1>
	<br>
	<br>
	<form action="InserUsuario" class="border border-1 rounded-3 border border-secondary" method="post">
	
		<label for="nombre">newnombre</label> 
			<input type="text" name="nombre" id="" value="nombre"><br> 
			
		<label for="dni">newdni</label> 
			<input type="text" name="dni" id=""value="dni"><br> 
			
		<label for="codigo">newcodigo</label> 
			<input type="text" name="codigo" id="" value="codigo"> <br> 
		
		<label for="Birthdate">newcodigo</label> 
			<input type="text" name="Birthdate" id="" value="2000-01-01"> <br> 
			
		<label for="id_rol">id_rol</label> 
			<input type="text" name="id_rol" id=""value="1"><br> 
			
		<input type="submit" name="inset"value="inset" />
	</form>
	<br>
	<a href="principal">volver</a>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
		crossorigin="anonymous">
		
	</script>
</body>
</html>