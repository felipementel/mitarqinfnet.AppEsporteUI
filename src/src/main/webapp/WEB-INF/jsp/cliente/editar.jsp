<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Loja de venda</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="/clientecadastro" method="post">
		<span>Nome:<input type="text" name="Nome" maxlength="200"><br></span>
		<span>DDD:<input type="text" name="DDD" max="2"></span><br>
		<span>Telefone:<input type="text" name="Telefone" maxlength="9"></span><br>
		<span>Email:<input type="text" name="email" maxlength="300"></span><br>
		<br>
		<span> <input type="submit" value="Cadastrar"></span><br>
	</form>
		<br><a href="/home">voltar</a>
</body>
</html>