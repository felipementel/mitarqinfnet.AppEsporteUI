<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

	Lista de bicicletas
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<p class="bg-warning">
				<c:forEach var="bicicleta" items="${bicicletas}">
					<h4>
					${bicicleta} <br>
						<a href="/bicicleta/excluir/${bicicleta.id}">Excluir</a>
					</h4>
				</c:forEach>
			</p>
		</div>
		<div class="col-sm-4"></div>
	</div>
	<p class="bg-success">
		<a href="/bicicleta/cadastro">Cadastro de bicicletas</a>
	</p>

		<br><a href="/home">voltar</a>
</body>
</html>