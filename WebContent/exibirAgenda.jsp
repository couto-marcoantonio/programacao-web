<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
</head>
<body>
<form action="ServletAgenda" method="post">
	Nome: ${name}
	Telefone: ${phone}
	Data de Nascimento: ${birthdate}
</form>
</body>
</html>