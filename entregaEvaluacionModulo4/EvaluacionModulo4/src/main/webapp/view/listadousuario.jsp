
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>


<%@page import="java.util.List"%>


<html lang="es">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js " integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM " crossorigin="anonymous "></script>
    <link rel="stylesheet" href="css/estiloNEW.css">
    <title>Listado Usuario</title>
</head>

<body>
    <header class="container-fluid bg-primary d-flex justify-content-center">
        <p class="text-light mb-0 p-2 fs-6"> Contactanos +56 9 3641 7409 </p>
    </header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light p-3 " id="menu">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Zurita & Seguridad</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="indexN.html">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contacto</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Crear Capacitaci?n</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- imagen principal -->

    <div class="fondo">
        <h1>Zurita & Seguridad</h1>
        <h2>Somos seguridad y bienestar de tus equipos de trabajo</h2>
    </div>



    <!-- cuerpo de trabajo  -->
    <h4>Listado de Usuarios Ingresados por perfil</h4>
    <h4>Perfil Clientes</h4>
	
	
	<form action="Controlador" method="POST">
	<input type="submit" name="accion" value="Listar">
	<input type="submit" name="accion" value="Nuevo">
	
	</form>
	<table class="table">
		<thead class="table-dark">
			<tr>
				<th>ID de Usuario</th>
				<th>Run</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Fecha Nacimiento</th>
				<th>Tipo Usuario</th>
				<th>Acci?n!</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="p" items="${persona}">
			<tr>
					<th><c:url var="verPersona" value="/Controlador">
							<c:param name="idUsuario" value="${p.getIdUsuario()}"/>
							<c:param name="accion" value="verUno" />
						</c:url>
					    <a href="${verPersona}"><c:out value="${p.getIdUsuario()}"/></a></th>
					
					<td><c:out value="${p.getRunUsuario()}"/></td>
					<td><c:out value="${p.getNomUsuario()}"/></td>
					<td><c:out value="${p.getApeUsuario()}"/></td>
					<td><c:out value="${p.getFecUsuario()}"/></td>
					<td><c:out value="${p.getTipUsuario()}"/></td>
					<td>
						<c:url var="editar" value="/Controlador">
							<c:param name="idUsuario" value="${p.getIdUsuario()}" />
							<c:param name="accion" value="editar" />
						</c:url> <c:url var="borrar" value="/Controlador">
							<c:param name="idUsuario" value="${p.getIdUsuario()}" />
							<c:param name="accion" value="borrar" />
						</c:url>
						 <a href="${editar}">Editar</a> | <a href="${borrar}">Borrar</a></td>
				</tr>
		</c:forEach>
		</tbody>
	</table>

	<!-- footer  -->
	<footer class="text-center text-white"
		style="background-color: #f1f1f1;">
		<!-- Grid container -->
		<div class="container pt-4">
			<!-- Section: Social media -->
			<section class="mb-4">
				<!-- Facebook -->
				<a class="fs-5 px-3 pt-3" href="#!"><i class="bi bi-facebook"></i></a>
				<!-- Twitter -->
				<a class="fs-5 px-3 pt-3" href="#!"><i class="bi bi-twitter"></i></a>
				<!-- Instagram -->
				<a class="fs-5 px-3 pt-3" href="#!"><i class="bi bi-instagram"></i></a>
			</section>
			<!-- Section: Social media -->
		</div>
		<!-- Copyright -->
		<div class="text-center p-3 fs-5 px-3 text-dark ">
			? 2021 Copyright:
			<p class="text-dark fs-5">Zurita & Seguridad. Todos Los Derechos
				Reservados 2021</p>
		</div>
		<!-- Copyright -->
	</footer>
</body>

</html>