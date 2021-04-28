package br.edu.ads.ppw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespostaFormulario", urlPatterns = {"/respostaformulario"})
public class RespostaFormulario extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Dados Recebidos de formulario.html<h1>");
        resp.getWriter().println("<h2>Utilizando o método doPost<h2>");
        resp.getWriter().println("<h3>Seu nome é: " + req.getParameter("nome") + "</h3>");
        resp.getWriter().println("<h3>Seu e-mail é: " + req.getParameter("email") + "</h3>");
        resp.getWriter().println("<h3>Seu telefone é: " + req.getParameter("telefone") + "</h3>");
        resp.getWriter().println("</html>");
    }
}


/* RESPOSTA DA SEÇÃO 3 - EXERCICIOS SERVLETS PARTE 3
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Dados Recebidos de formulario.html<h1>");
        resp.getWriter().println("<h3>Seu nome é: " + req.getParameter("nome") + "</h3>");
        resp.getWriter().println("<h3>Seu e-mail é: " + req.getParameter("email") + "</h3>");
        resp.getWriter().println("<h3>Seu telefone é: " + req.getParameter("telefone") + "</h3>");
        resp.getWriter().println("</html>");
    }
*/

/* RESPOSTA DA SEÇÃO 4 - EXERCICIOS SERVLETS PARTE 3
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Dados Recebidos de formulario.html<h1>");
        resp.getWriter().println("<h2>Utilizando o método doGet<h2>");
        resp.getWriter().println("<h3>Seu nome é: " + req.getParameter("nome") + "</h3>");
        resp.getWriter().println("<h3>Seu e-mail é: " + req.getParameter("email") + "</h3>");
        resp.getWriter().println("<h3>Seu telefone é: " + req.getParameter("telefone") + "</h3>");
        resp.getWriter().println("</html>");
    }
*/