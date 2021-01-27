/**
 * 
 */

function createValidar() {

	let nome = frmExames.nm_pac.value

	let exame = frmExames.nm_ex.value

	let data = frmExames.dt_ex.value

	let obs = frmExames.obs_ex.value

	var dataAtual = new Date().toLocaleDateString()

	dataAtual = formatarData(dataAtual);


	if (nome === "") {
		alert('O nome do paciente é obrigatório')
		frmExames.nm_pac.focus()
		return false
	} else if (exame === "") {
		alert('O nome do exame é obrigatório')
		frmExames.nm_ex.focus()
		return false
	} else if (data === "") {
		alert('A data do exame é obrigatório')
		frmExames.dt_ex.focus()
		return false
	} else if (data <= dataAtual) {
		alert('É necessario que a data seja maior que a atual')
		frmExames.dt_ex.focus()
		return false
	} else {
		document.forms["frmExames"].submit()
	}

}

function updateValidar() {

	let id = frmExames.id_ex.value

	let nome = frmExames.nm_pac.value

	let data = frmExames.dt_ex.value

	let obs = frmExames.obs_ex.value

	var dataAtual = new Date().toLocaleDateString()

	dataAtual = formatarData(dataAtual);


	if (nome === "") {
		alert('O nome do paciente é obrigatório')
		frmExames.nm_pac.focus()
		return false
	} else if (exame === "") {
		alert('O nome do exame é obrigatório')
		frmExames.nm_ex.focus()
		return false
	} else if (data === "") {
		alert('A data do exame é obrigatório')
		frmExames.dt_ex.focus()
		return false
	} else if (data <= dataAtual) {
		alert('É necessario que a data seja maior que a atual')
		frmExames.dt_ex.focus()
		return false
	} else {
		var r = confirm("Confirmar atualização")

		if (r == true) {
			document.forms["frmExames"].submit()
		} else {
			return false
		}
	}

}

function formatarData(dataAtual) {
	var dia = dataAtual.split("/")[0];
	var mes = dataAtual.split("/")[1];
	var ano = dataAtual.split("/")[2];

	return ano + '-' + ("0" + mes).slice(-2) + '-' + ("0" + dia).slice(-2);
}