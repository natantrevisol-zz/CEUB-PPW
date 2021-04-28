package br.edu.ads.ppw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TabuadaEspecifica", urlPatterns = {"/tabuadaespecifica"})
public class TabuadaEspecifica extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<html>");
        
        resp.getWriter().println(gerarFormulario());
        
        try{
            resp.getWriter().println("<table>");
            for(int i=1; i<=10; i++){
                resp.getWriter().println("<tr>");
                resp.getWriter().println("<td>" + req.getParameter("numero") + " x " + i + " = " + (Integer.parseInt(req.getParameter("numero"))* i) + "</td>");
                resp.getWriter().println("</tr>");
            }
            resp.getWriter().println("</table>");
        }
        catch(NumberFormatException e){
            resp.getWriter().println("<p>Digite um número para a tabuada!<p/>");
        }
        
        resp.getWriter().println("</html>");
    }
    
    private String gerarFormulario() {
        String formGerado;
        formGerado = "<form>";
        formGerado += "Número para a Tabuada: <input type='number' name='numero'><br><br>";
        formGerado += "<input type='submit' value='Calcular Tabuada!'><br>"; 
        formGerado += "</form>";
        return formGerado;
    }    
}
