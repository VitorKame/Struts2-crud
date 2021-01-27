<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">
		<title>Editar Exame</title>
		<link rel="icon" href="images/medical.png">
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
		
	<body>
	
		<div class="esq">
			<form action="read" method="POST">
				<button class="botao1">Exames</button>
			</form>
		</div>
	
		<div class="dir">
			<div id="titulo">
				<label class="titulo">Editar Exame</label><br>
			</div>
	
			<form action="update" name="frmExames" method="POST" class="form">
				<fieldset>
					<input type="text" id="id" name="id_ex" value="<c:out value="${id_ex}"/>" readonly="readonly">
					<input type="text" id="nome" name="nm_pac" value="<c:out value="${exame.nm_pac}"/>">
					<input type="text" id="exame" name="nm_ex" value="<c:out value="${exame.nm_ex}"/>">
					<input type="date" id="data" name="dt_ex" value="<c:out value="${exame.dt_ex}"/>">
					<textarea id="obs" maxlength="255" name="obs_ex">${exame.obs_ex}</textarea>
				</fieldset>
	
				<input type="button" value="ATUALIZAR" onclick="updateValidar()"
					class="botao1">
	
			</form>
		</div>
	
		<script src="scripts/authenticator.js"></script>
	</body>
</html>