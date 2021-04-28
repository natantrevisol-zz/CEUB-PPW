package br.edu.ads.ppw;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MostraCabecalho", urlPatterns = {"/mostracabecalho"})
public class MostraCabecalho extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Enumeration minhaEnumeration = req.getHeaderNames();
        List<String> minhaLista = Collections.list(minhaEnumeration);
        
        resp.getWriter().println("<html>");
        resp.getWriter().println("<table style='border: 1px solid black;'>");
        resp.getWriter().println("<tr>");
        resp.getWriter().println("<th>Dado Cabeçalho</th>");
        resp.getWriter().println("<th>Valor</th>");
        resp.getWriter().println("</tr>");
        
        for(String dado : minhaLista){
            resp.getWriter().println("<tr>");
            resp.getWriter().println("<td style='border-bottom: 1px solid black;'>" + dado + "</td>");
            resp.getWriter().println("<td style='border-bottom: 1px solid black;'>" + req.getHeader(dado) + "</td>");
            resp.getWriter().println("</tr>");
        }
        
        resp.getWriter().println("</table>");
        resp.getWriter().println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        doGet(req, resp);
    }
}
