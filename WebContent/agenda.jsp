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
	Nome: <input type="text" name="name" />
	Telefone: <input type="tel" name="phone" placeholder="(00) 0000-0000" />
	Data de Nascimento: <input type="date" name="Data de Nascimento" />
	<input type="submit" value="Enviar">
</form>
</body>
</html>