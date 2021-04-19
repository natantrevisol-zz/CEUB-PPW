package br.ppw.exservletparte2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OlaMundo", urlPatterns = {"/ola"})
public class OlaMundo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("Segunda Parte Exercício Servlet - UniCEUB");
        resp.getWriter().println("Olá Mundo!!! Com Servlet 3.X");
    }
}
