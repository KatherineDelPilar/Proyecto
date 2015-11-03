$(document).ready(function($) {

	

	$('#btnMostarTabla').click(function(e){
		e.preventDefault();
		
		numero = $('#numero').val();
		
		if(numero != ""){
			$('#tablaBusqueda').show();
		}else{
			alert('Debes ingresar un número');
		}
		
	})


	

});




