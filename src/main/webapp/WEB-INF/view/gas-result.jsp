<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lamezon
  Date: 05/04/2021
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado</title>
</head>
<body style="background-color: black; color: white; text-align: center">
<br>
<div style="margin-top: 10%">
<h1>O preço a se gastar com combustível para a viagem será de aproximadamente R$ ${total}</h1>
<br>
    Informações da viagem<br> Distancia: ${distance}km <br> Consumo de Gasolina: ${kml}km por litro <br>
    Preço da gasolina: R$${gasValue} <br><br>
    Contador Global: ${counterApplication} <br>
    Na sessão, foi utilizado ${counterSession}x a calculadora
    <br>
    Distancia das viagens calculadas: <br>
    <c:if test="${not empty travels}">
        <ul>
            <c:forEach var="info" items="${travels}">
            <li>${info.distance}KM</li>
            </c:forEach>
        </ul>
    </c:if>

<br>
    <a href="/CalculadoraGasolina/calcula-gasolina"><button>Calcular Novamente</button></a>
</div>
</body>
</html>
