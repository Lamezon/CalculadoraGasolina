package br.edu.utfpr.CalculadoraGasolina.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "GasCalculatorServlet", value = "/calcula-gasolina")
public class GasCalculatorController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String kml = request.getParameter("kml");
        String distance = request.getParameter("distancia");
        String gasvalue = request.getParameter("preco");

        if(kml == null || distance == null || gasvalue == null){
            request.getRequestDispatcher("/WEB-INF/view/gas-calculator.jsp").forward(request, response);

        } else {
            Integer kmlInt = Integer.parseInt(kml);
            Integer distanceInt = Integer.parseInt(distance);
            Integer gasvalueInt = Integer.parseInt(gasvalue);

            int total = calculateCost(kmlInt, distanceInt, gasvalueInt);
            request.setAttribute("total", total);
            request.getRequestDispatcher("/WEB-INF/view/gas-result.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kml = request.getParameter("kml");
        String distance = request.getParameter("distance");
        String gasvalue = request.getParameter("gasvalue");

        Integer kmlInt = Integer.parseInt(kml);
        Integer distanceInt = Integer.parseInt(distance);
        Integer gasvalueInt = Integer.parseInt(gasvalue);

        int total = calculateCost(kmlInt, distanceInt, gasvalueInt);
       /* request.setAttribute("total", total);
        request.getRequestDispatcher("/WEB-INF/view/gas-result.jsp").forward(request, response);*/

        request.setAttribute("flash.total", total);
        request.setAttribute("gas-result", gasvalueInt);

        request.getRequestDispatcher("/session-data").forward(request, response);
    }
    private int calculateCost(int kml, int distance, int gasvalue){

        int result = (distance/kml)*gasvalue;
        return result;
    }
}
