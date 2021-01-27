<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">
		<title>Novo Exame</title>
		<link rel="icon" href="images/medical.png">
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Open+Sans&display=swap"rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	
	<body>
	
		<div class="esq">
			<form action="read" method="POST">
				<button class="botao1">EXAMES</button>
			</form>
		</div>
	
		<div class="dir">
			<div id="titulo">
				<label class="titulo">Marcar Exame</label><br>
				
				<s:set var="crtRetorno" value="retorno"/>
				<s:if test="%{#crtRetorno=='Sucesso'}">
				  <label>Exame cadastrado com sucesso</label>
				</s:if>
				<s:elseif test="%{#crtRetorno=='Falha'}">
				  <label>Paciente já cadastrado</label>
				</s:elseif>
			</div>
	
			<form action="create" name="frmExames" method="POST" class="form">
				<fieldset class="grupo">
	
					<input type="text" id="nome" name="nm_pac" placeholder="Nome do Paciente" required>
					<input type="text" id="exame" name="nm_ex" placeholder="Nome do Exame" required>
					<input type="date" id="data" name="dt_ex" placeholder="DD/MM/AAAA" required>
					<textarea id="obs" maxlength="255" name="obs_ex" placeholder="Observação / Resultado"></textarea>
	
				</fieldset>
				
				<input type="button" value="MARCAR" onclick="createValidar()" class="botao1">
			</form>
		</div>
	
		<script src="scripts/authenticator.js"></script>
	
	</body>
</html>