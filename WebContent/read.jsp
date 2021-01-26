<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport"
	content="width=device-width, initial-scale=1">
<title>Exames</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

	<div class="top">
		<a href="newExame">Novo Exame</a>
	</div>

	<div class="page">

		<div>
			<label class="titulo">Exames</label>
		</div>

		<div class="tabela">
			<table id="tabela">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome do paciente</th>
						<th>Nome do Exame</th>
						<th>Data do Exame</th>
						<th>Descrição</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="lista" items="${listaExames}">

						<tr>
							<td><c:out value="${lista.id_ex}" /></td>
							<td><c:out value="${lista.nm_pac}" /></td>
							<td><c:out value="${lista.nm_ex}" /></td>
							<td><c:out value="${lista.dt_ex}" /></td>
							<td><c:out value="${lista.obs_ex}" /></td>
							<td class="acoes"><a class="botao2"
								href="update?id_ex=<c:out value='${lista.id_ex}'/>">Editar</a> <a
								class="botao2"
								href="delete?id_ex=<c:out value='${lista.id_ex}'/>">Deletar</a>
							</td>
						</tr>

					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
	<script src="scripts/authenticator.js"></script>
</body>
</html>