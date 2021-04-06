package br.edu.utfpr.CalculadoraGasolina.controller;

import br.edu.utfpr.CalculadoraGasolina.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SessionController", value = "/session-data")
public class SessionController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }


    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Integer counterApplication = (Integer) request.getServletContext().getAttribute(Constants.COUNTER_APPLICATION);
        if(counterApplication == null){
            counterApplication = 0;
        }
        counterApplication++;
        getServletContext().setAttribute(Constants.COUNTER_APPLICATION, counterApplication);

        Integer counterSession = (Integer) request.getSession(true).getAttribute(Constants.COUNTER_SESSION);
        if(counterSession==null){
            counterSession=0;
        }
        counterSession++;
        request.getSession(true).setAttribute(Constants.COUNTER_SESSION, counterSession);

        Cookie cookie = new Cookie("counter", String.valueOf(counterSession));
        cookie.setMaxAge(60*60*24);

        response.addCookie(cookie);
        response.sendRedirect("gas-result");

    }
}
