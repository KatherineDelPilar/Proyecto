<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>JET PERU</title>
	
    <%@ include file="/WEB-INF/views/template/head.jsp" %>
</head>
<body>

    
<div class="site_wrapper">

    <%@ include file="/WEB-INF/views/template/menu.jsp" %>

<div class="clearfix"></div>
 
<div class="page_title">

	<div class="container">
		<div class="title"><h1>Consultar estado de remesa</h1></div>
        <div class="pagenation"><a href="index.html">Home</a> <i>/</i> Consultar estado de remesa</div>
	</div>
</div><!-- end page title --> 





<!-- Contant
======================================= -->

<div class="container">

	

	<div class="content_fullwidth">
	
	<div class="one_full">
	
		
			<div class="notice">
                <div class="message-box-wrap">
					La información mostrada no puede ser actualizada
                </div>
			</div>

			<div class="error">
                <div class="message-box-wrap">
					El número de transacción no es válido.
                </div>
			
            </div>	
    
    </div><!-- end styled boxes -->
        	
    <div class="one_half">
        

   

    <br />
    <h3>Consultar Estado de Remesa</h3>

    <form action="" method="post">
    
        <fieldset>
        
                
        <label for="name" class="blocklabel">Número de Transacción</label>
        <p class=""><input name="yourname" class="input_bg" type="text" id="numero" value='' /></p> 

        <br><br><br><br>
        <div class="clearfix"></div>
		<p>
        <input name="Send" type="button" value="Buscar" class="comment_submit" id="btnMostarTabla" /></p>
                
        </fieldset>
        
       </form> 
    
    </div>
	
	<div class="clearfix divider_line8"></div>
    
	
	<div id="tablaBusqueda" style="display:none" class="one_full">
    
			<div class="table-style ">
                <table class="table-list">
                    <tr>
                        <th>Código</th>
                        <th>N° de Operación</th>
                        <th>Estado</th>
                        <th>Ubicación</th>
                    </tr>
                    <tr>
                        <td>01</td>
                        <td>012-123456</td>
                        <td>Aprobado</td>
                        <td>Cartagena<</td>
                    </tr>
                </table>
			</div>
    
    </div><!-- end tables -->
               

</div>

</div><!-- end content area -->


</div>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>

</body>
</html>