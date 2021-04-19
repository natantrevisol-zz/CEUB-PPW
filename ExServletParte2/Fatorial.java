package br.ppw.exservletparte2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Fatorial", urlPatterns = {"/fatorial"})
public class Fatorial extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<h1 style=\"text-align: center;\">Tabela de Fatoriais de 1 até 10.</h1>");
        
        resp.getWriter().println("<table style=\"border: black 1px solid;\">");
        
        for(int i=1; i<=10; i++){
            resp.getWriter().println("<tr>");
            
            resp.getWriter().println("<td>");
            resp.getWriter().println(i + "! = ");
            resp.getWriter().println("</td>");
            
            resp.getWriter().println("<td>");
            resp.getWriter().println(fatorial(i));
            resp.getWriter().println("</td>");
            
            resp.getWriter().println("<tr>");
        }
        
        resp.getWriter().println("</table>");
    }
        
    private static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * fatorial(num - 1);
        }
    }
}