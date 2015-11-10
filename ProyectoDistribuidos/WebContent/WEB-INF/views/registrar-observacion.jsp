<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>JET PERU</title>
	<%@ include file="/WEB-INF/views/template/head.jsp"%>
</head>
<body>
	<div class="site_wrapper">

		<%@ include file="/WEB-INF/views/template/menu.jsp"%>

		<div class="clearfix"></div>

		<div class="page_title">

			<div class="container">
				<div class="title">
					<h1>Registrar Observación</h1>
				</div>
				<div class="pagenation">
					<a href="index.html">Home</a> <i>/</i> Registrar Observación
				</div>
			</div>
		</div>
		<!-- end page title -->





		<!-- Contant
======================================= -->

		<div class="container">



			<div class="content_fullwidth">

				<div class="one_full">


					<!-- 					<div id="errorHora" style="display: none;" class="notice"> -->
					<!-- 						<div class="message-box-wrap">La informaci&oacute;n mostrada -->
					<!-- 							no puede ser actualizada</div> -->
					<!-- 					</div> -->

					<!-- 					<div id="errorNumeroInvalido" style="display: none;" class="error"> -->
					<!-- 						<div class="message-box-wrap">El n&uacute;mero de -->
					<!-- 							transacci&oacute;n no es v&aacute;lido.</div> -->

					<!-- 					</div> -->

				</div>
				<!-- end styled boxes -->

				<div class="one_half">

					<br />
					<h3>Registrar Observación</h3>

					<form action="" method="post">

						<fieldset>

							<table class="table-style">
								<tr>
									<td>
										<label for="name" class="blocklabel">Número de transacción: </label>
										<p class="">
											<input name="transaccion" class="input_bg" type="text"
											id="idtransaccion" value='' />
										</p>		
									</td>
									<td>
										<p>
											<input name="SendRemesaCobrada" type="button" value="Buscar"
											class="comment_submit" id="btnMostarTablaRemesaCobrada" />
										</p>
									</td>
								</tr>
							</table>
							
							<div class="clearfix divider_line8"></div>

							<div id="tablaBusquedaRemesaPorCobrar" style="display: true" class="one_full">
			
								<div class="table-style ">
									<table class="table-list">
										<tr>
											<th>#</th>
											<th>Número Operación</th>
											<th>Estado</th>
											<th>Observación</th>
										</tr>
										<tbody id="tBodyBusqueda">
			
										</tbody>
			
									</table>
								</div>
			
							</div>
						
							<br> <br> <br> <br>
							
							<table class="table-style">
								<tr>
									<td>
										<p>
											<input name="SendRemesaCobrada1" type="button" value="Añadir"
											class="comment_submit" id="btnMostarTablaRemesaCobrada1" />
										</p>
									</td>
									<td>
										<p>
											<input name="SendRemesaCobrada2" type="button" value="Borrar"
											class="comment_submit" id="btnMostarTablaRemesaCobrada2" />
										</p>
									</td>
								</tr>
							</table>
							
						</fieldset>

					</form>

				</div>

			</div>

		</div>
		<!-- end content area -->


	</div>

	<%@ include file="/WEB-INF/views/template/footer.jsp"%>
</body>
</html>