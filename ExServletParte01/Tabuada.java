package br.ppw.exservletparte1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tabuada extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<h1 style=\"text-align: center;\">TABUADA DO 1 AO 10 COM RESULTADOS!</h1>");
        
        resp.getWriter().println("<table style=\"border: black 3px solid; \">");
        resp.getWriter().println("<tr>");
        
        for(int i=1; i<=10; i++){
            resp.getWriter().println("<td>");
            resp.getWriter().println("<table style=\"border: black 1px dashed;\">"); 
            
            for(int j=1; j<=10; j++){
                resp.getWriter().println("<tr>");
                resp.getWriter().println("<td>");
                resp.getWriter().println(i + " x " + j + " = " + i*j);
                resp.getWriter().println("</td>");
                resp.getWriter().println("</tr>");
            }    
            
            resp.getWriter().println("</table>");
            resp.getWriter().println("</td>");
        }
        
        resp.getWriter().println("</tr>");
        resp.getWriter().println("</table>");
    }   
}