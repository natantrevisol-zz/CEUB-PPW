package br.edu.ads.ppw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespostaDivisao", urlPatterns = {"/respostadivisao"})
public class RespostaDivisao extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        Integer dividendo = Integer.valueOf(req.getParameter("dividendo"));
        Integer divisor = Integer.valueOf(req.getParameter("divisor"));
        Integer resultadoDivisao = dividendo / divisor;
                
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Dados Recebidos de dividir.html<h1>");
        resp.getWriter().println("<h2>Utilizando o método doPost<h2>");
        resp.getWriter().println("<h3>Dividendo: " + dividendo + "</h3>");
        resp.getWriter().println("<h3>Divisor: " + divisor + "</h3>");
        resp.getWriter().println("<h3>Resultado: " + resultadoDivisao + "</h3>");
        resp.getWriter().println("</html>");
    }
}
