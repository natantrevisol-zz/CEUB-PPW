package br.edu.ads.ppw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InitDestroyServlet", urlPatterns = {"/initdestroyservlet"})
public class InitDestroyServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Minha Servlet INICIOU!!! (SERVLET INIT)");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Minha Servlet SE DESTRUIU!!! (SERVLET DESTROY)");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.getWriter().println("<html>");
        resp.getWriter().println("<h1>Servlet Init e Servlet Destroy</h1>");
        resp.getWriter().println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        doPost(req, resp);
    } 
}