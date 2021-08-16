<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Usuario</title>
</head>
<body>
    <h1>Usuario</h1>
    <h2><c:out value="${p.getNomUsuario()}"/> <c:out value="${p.getApeUsuario()}"/></h2>
    <p>Fecha Naciemiento: <c:out value="${p.getFecUsuario()}"/></p>
    <p>Tipo Usuario: <c:out value="${p.getTipUsuario()}"/></p>
</body>
</html>