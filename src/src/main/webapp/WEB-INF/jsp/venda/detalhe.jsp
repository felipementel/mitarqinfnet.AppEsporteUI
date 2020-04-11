<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>venda detalhe</title>
</head>
<body>

	<form action="/venda/vender" method="post">

		<div>
			<label for="idCliente">Cliente:</label> <select class="form-control"
				name="cliente">
				<c:forEach var="cliente" items="${clientes}">
					<option value="${cliente.id}">${cliente.nome}</option>
				</c:forEach>
			</select>
		</div>

		<div>
			<label>Produtos:</label>
			<c:forEach var="skate" items="${skates}">
				<div class="container">
					<input type="checkbox" name="itensvenda" value="${skate.id}">
					${skate}
				</div>
			</c:forEach>
			<c:forEach var="bicicleta" items="${bicicletas}">
				<div class="container">
					<input type="checkbox" name="itensvenda" value="${bicicleta.id}">
					${bicicleta}
				</div>
			</c:forEach>
			<c:forEach var="bodyboard" items="${bodyboards}">
				<div class="container">
					<input type="checkbox" name="itensvenda" value="${bodyboard.id}">
					${bodyboard}
				</div>
			</c:forEach>
		</div>

		<input type="submit" value="Cadastrar">
	</form>

	<br>
	<a href="/home">voltar</a>
</body>
</html>