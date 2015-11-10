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
					<h1>Cobrar Remesa</h1>
				</div>
				<div class="pagenation">
					<a href="index.html">Home</a> <i>/</i> Cobrar Remesa
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
					<h3>Cobrar Remesa</h3>

					<form action="" method="post">

						<fieldset>
						
							<table class="table-style">
								<tr>
									<td>
										<label for="name" class="blocklabel">Tipo de documento: </label>
										<p class="">
											<select name="sucursalname" class="input_bg" id="sucursal">
												<option value="dni">DNI</option>
												<option value="ruc">RUC</option>
											</select>
										</p>
									</td>
									<td>
										<p>
											<input name="SendRemesaCobrada1" type="button" value="Buscar"
											class="comment_submit" id="btnMostarTablaRemesaCobrada1" />
										</p>
									</td>
								</tr>
								<tr>
									<td>
										<label for="name" class="blocklabel">Número de documento: </label>
										<p class="">
											<input name="transaccion" class="input_bg" type="text"
											id="idtransaccion" value='' />
										</p>
									</td>
									<td></td>
								</tr>
								<tr>
									<td>
										<label for="name" class="blocklabel">PIN: </label>
										<p class="">
											<input name="fechadesdename" class="input_bg" type="text"
											id="idfechadesde" value='' />
										</p>
									</td>
									<td></td>
								</tr>
							</table>
							
							<div class="clearfix"></div>

							<br>
							<p>
								<input name="SendRemesaCobrada2" type="button" value="Generar Cobro"
									class="comment_submit" id="btnMostarTablaRemesaCobrada2" />
							</p>

						</fieldset>

					</form>

				</div>

<!-- 				<div class="clearfix divider_line8"></div> -->


<!-- 				<div id="tablaBusquedaRemesaPorCobrar" style="display: none" class="one_full"> -->

<!-- 					<div class="table-style "> -->
<!-- 						<table class="table-list"> -->
<!-- 							<tr> -->
<!-- 								<th>ID transacción</th> -->
<!-- 								<th>Fecha transacción</th> -->
<!-- 								<th>Beneficiario</th> -->
<!-- 								<th>Monto</th> -->
<!-- 								<th>Cuenta origen</th> -->
<!-- 								<th>Cuenta destino</th> -->
<!-- 								<th>Código PIN</th> -->
<!-- 							</tr> -->
<!-- 							<tbody id="tBodyBusqueda"> -->

<!-- 							</tbody> -->

<!-- 						</table> -->
<!-- 					</div> -->

<!-- 				</div> -->
				<!-- end tables -->
			</div>

		</div>
		<!-- end content area -->


	</div>

	<%@ include file="/WEB-INF/views/template/footer.jsp"%>
</body>
</html>