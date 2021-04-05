package br.edu.utfpr.CalculadoraGasolina.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GasResultController", value= "/gas-result")
public class GasResultController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/view/gas-result.jsp").forward(request, response);
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
}
