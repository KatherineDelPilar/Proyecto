$(document).ready(function($) {
	
	var urlHome = $('#urlHome').val();

	$('#btnMostarTabla').click(function(e){
		e.preventDefault();
		
		numero = $('#numero').val();
		
		if(numero != ""){
			$('#tablaBusqueda').show();
			
			$.ajax({
				type: 'POST',
				url: urlHome + "remesa/consultar-remesa",
				dataType: 'json',
				data: {"numeroTransaccion" : numero},
				success: function(result){
					
				}
			});
			
		}else{
			alert('Debes ingresar un número');
		}
		
	})


	

});




