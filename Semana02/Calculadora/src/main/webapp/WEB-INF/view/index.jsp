<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora basica</title>
</head>
<body>

	<h1>SUMAR</h1>
	<form method="post" action="procesar">
		<div>
			<label>NUMERO 1:</label> <input type="number" name="num1" />
		</div>

		<div>
			<label>NUMERO 2:</label> <input type="number" name="num2" />
		</div>

		<div>

			<label>Selecionar operacion:</label> <select name="operacion">
				<option value="1">Suma</option>
				<option value="2">Resta</option>
				<option value="3">Multiplicacion</option>
				<option value="4">Division</option>
			</select>
		</div>

		<div>
			<input type="submit" value="Procesar" />
		</div>

	</form>
	<div style="color:blue;font-size: 70px;margin: 20px;text-align: center;">
	${respuesta}
	</div>


</body>
</html>