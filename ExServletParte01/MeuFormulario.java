package br.ppw.exservletparte1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeuFormulario extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<h1>Meu primeiro formulário</h1>");
        resp.getWriter().println("<form>");
        
        resp.getWriter().println("<label>Nome:</label><br>");
        resp.getWriter().println("<input type=\"text\"><br>");
        
        resp.getWriter().println("<label>E-mail:</label><br>");
        resp.getWriter().println("<input type=\"email\"><br>");
        
        resp.getWriter().println("<label>Telefone:</label><br>");
        resp.getWriter().println("<input type=\"number\"><br><br>");
        
        resp.getWriter().println("<input type=\"submit\" value=\"Cadastrar\">");
        resp.getWriter().println("</form>");
    }
}
