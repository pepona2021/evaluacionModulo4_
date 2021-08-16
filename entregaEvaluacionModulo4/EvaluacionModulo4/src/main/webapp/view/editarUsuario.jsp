<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html lang="es">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
    <link rel="shortcut icon" href="https://raw.githubusercontent.com/Ruzder/grupal/main/icono.com%20(1).png">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js " integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM " crossorigin="anonymous "></script>
    <link rel="stylesheet" href="css/estiloNEW.css">
    <title>Crear Usuario</title>
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
                        <a class="nav-link" href="#">Crear Capacitación</a>
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
	<div class="container">
		<div class="contact-box">
			<div class="left2"></div>
			<div class="right">
				<h4>Editar Registro De Usuario</h4>
				<c:url var="action" value="/Controlador">
    			<c:param name="accion" value="editar"/>
				</c:url>

				<form action="${action}" method="POST">
					<!--value="${cap.getIdCapacitacion()}"  -->
					<div class="mb-3">
						<label for="idUsuario" class="form-label">ID Usuario</label> <input
							type="hidden" class="form-control"  name="idUsuario" value="${p.getIdUsuario()}">
					</div>
					<div class="mb-3">
						<label for="txtRun" class="form-label">Run Usuario</label> <input
							type="number" class="form-control" id="txtRun"
							name="txtRun" value="${p.getRunUsuario()}">    <!-- ${persona.getNomUsuario()} o ${dato.getRunUsuario()}-->
					</div>
					<div class="mb-3">
						<label for="txtNom" class="form-label">Nombre</label> <input
							type="text" class="form-control" id="txtNom"
							name="txtNom" value="${p.getNomUsuario()}">
					</div>
					<div class="mb-3">
						<label for="txtApe" class="form-label">Apellido</label> <input
							type="text" class="form-control" id="txtApe"
							name="txtApe" value="${p.getApeUsuario()}">
					</div>
					<div class="mb-3">
						<label for="txtFec" class="form-label">Fecha
							nacimiento</label> <input type="text" class="form-control"
							id="txtFec" name="txtFec" value="${p.getFecUsuario()}">
					</div>
					<div class="mb-3">
						<label for="txtTip" class="form-label">Tipo Usuario</label> <input
							type="text" class="form-control" id="txtTip"
							name="txtTip" value="${p.getTipUsuario()}">
					</div>
					<p><button type="submit">Enviar</button> <button type="Reset">Reset</button>
				
				</form>
			</div>
		</div>
	</div>
	<!-- footer  -->
    <footer class="text-center text-white" style="background-color: #f1f1f1;">
        <!-- Grid container -->
        <div class="container pt-4">
            <!-- Section: Social media -->
            <section class="mb-4">
                <!-- Facebook -->
                <a class="fs-5 px-3 pt-3" href="#!"><i class="bi bi-facebook"></i
                    ></a>
                <!-- Twitter -->
                <a class="fs-5 px-3 pt-3" href="#!"><i class="bi bi-twitter"></i
                    ></a>
                <!-- Instagram -->
                <a class="fs-5 px-3 pt-3" href="#!"><i class="bi bi-instagram"></i
                    ></a>
            </section>
            <!-- Section: Social media -->
        </div>

        <!-- Copyright -->
        <div class="text-center p-3 fs-5 px-3 text-dark ">
            © 2021 Copyright:
            <p class="text-dark fs-5">Zurita & Seguridad. Todos Los Derechos Reservados 2021</p>
        </div>
        <!-- Copyright -->
    </footer>



    <!-- Option 1: Bootstrap Bundle with Popper -->



</body>

</html>