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
					<h1>Consultar estado de remesa</h1>
				</div>
				<div class="pagenation">
					<a href="index.html">Home</a> <i>/</i> Consultar estado de remesa
				</div>
			</div>
		</div>
		<!-- end page title -->





		<!-- Contant
======================================= -->

		<div class="container">



			<div class="content_fullwidth">

				<div class="one_full">


					<div id="errorHora" style="display: none;" class="notice">
						<div class="message-box-wrap"></div>
					</div>

					<div id="errorNumeroInvalido" style="display: none;"  class="error">
						<div class="message-box-wrap">El n&uacute;mero de transacci&oacute;n no es
							v&aacute;lido.</div>

					</div>

				</div>
				<!-- end styled boxes -->

				<div class="one_half">




					<br />
					<h3>Consultar Estado de Remesa</h3>

					<form action="" method="post">

						<fieldset>


							<label for="name" class="blocklabel">Número de
								Transacción</label>
							<p class="">
								<input name="yourname" class="input_bg" type="text" id="numero"
									value='' />
							</p>

							<br>
							<br>
							<br>
							<br>
							<div class="clearfix"></div>
							<p>
								<input name="Send" type="button" value="Buscar"
									class="comment_submit" id="btnMostarTabla" />
							</p>

						</fieldset>

					</form>

				</div>

				<div class="clearfix divider_line8"></div>


				<div id="tablaBusqueda" style="display: none" class="one_full">

					<div class="table-style ">
						<table class="table-list">
							<tr>
								<th>C&oacute;digo</th>
								<th>PIN</th>
								<th>Fecha</th>
								<th>Agencia</th>
								<th>Moneda</th>
								<th>Monto</th>
								<th>Estado</th>
							</tr>
							<tbody id="tBodyBusqueda">
								
							</tbody>

						</table>
					</div>

				</div>
				<!-- end tables -->
			</div>

		</div>
		<!-- end content area -->


	</div>

	<%@ include file="/WEB-INF/views/template/footer.jsp"%>

</body>
</html>