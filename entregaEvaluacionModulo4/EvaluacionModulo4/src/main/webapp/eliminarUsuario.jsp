<!doctype html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
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
    <title>Eliminar</title>
</head>

<body>

		    	<%
		    	
		    	
		    	int idUsuario= Integer.parseInt(request.getParameter("idUsuario"));

				Connection cnx= null;
		        Statement sta=null;
		        ResultSet rs=null;
		        
		        try {
			          Class.forName("oracle.jdbc.driver.OracleDriver");
			          cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Ashe1010@");

			          sta=cnx.createStatement();
			          //sta.executeUpdate("delete from ronald.usuario1 where ID_USUARIO='"+IdUsuario+"'");
			          sta.executeUpdate("delete from ronald.usuario1 where ID_USUARIO='"+idUsuario+"'");
			  	      request.getRequestDispatcher("listadousuario.jsp").forward(request, response);
					  sta.close();
					  rs.close();
					  cnx.close();
		        }catch (Exception e) {out.print(e+"");
		        	
		        }
		    	
		    	%>
   

</body>

</html>