<%--
  Created by IntelliJ IDEA.
  User: Lamezon
  Date: 05/04/2021
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="http://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Calculadora de Consumo</title>
</head>
<body style="background-color: black; color: white">
<form action="calcula-gasolina" style="text-align: center; margin-top: 10vw" method="post">
    <label for="kml">Média em KM do veículo por litro: </label><br><input required style="margin: auto; width: 40%; text-align: center" class="form-control" id="kml" name="kml" type="number" step="0.1"><br><br><br>
    <label for="distance">Qual a distância em KM da viagem: </label><br><input required style="margin: auto; width: 40%; text-align: center" class="form-control" id="distance" name="distance" type="number" step="0.1"><br><br><br>
    <label for="gasvalue">Valor da gasolina em R$: </label><br><input required style="margin: auto; width: 40%; text-align: center" class="form-control" id="gasvalue" name="gasvalue" type="number" step="0.01"><br><br><br>
    <button type="submit" class="btn btn-success">Calcular!</button>
</form>
</body>
</html>
