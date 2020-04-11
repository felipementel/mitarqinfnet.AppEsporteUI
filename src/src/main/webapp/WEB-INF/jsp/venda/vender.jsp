<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Loja de venda - Area de vendas</title>
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
	<form action="/venda/vender" method="post">

		<select name="cliente.id">
			<c:forEach var="cliente" items="${clientes}">
				<option value="${cliente.id}">${cliente.nome}</option>
			</c:forEach>
		</select> <br> <br>
		<c:forEach var="bicicleta" items="${bicicletas}">
			${bicicleta}
			<input type="checkbox"
				value="${bicicleta.id}" name="itensvenda">
		</c:forEach>
		<br> <br>
		<c:forEach var="skate" items="${skates}">
			${skate.preco} <input type="checkbox" name="itensvenda"
				value="${skate.id}" >
		</c:forEach>
		<br> <br>
		<c:forEach var="bodyboard" items="${bodyboards}">
			${bodyboard}<input type="checkbox" name="itensvenda"
				value="${bodyboard.id}">
		</c:forEach>
		<br> <br>
		<br>
		<input type="submit" value="Comprar" class="btn btn-primary"><br>
	</form>
		<a href="/home">voltar</a>
</body>
</html>