<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primeiro Formulario JSP</title>
    </head>
    <body>
        
        <h1>Meu primeiro formulário - JSP Parte 1</h1>           
            <form>  
                <label>Nome:</label><br>
                <input type='text' name='nome'><br>
                <label>E-mail:</label><br>
                <input type='email' name='email'><br>
                <label>Telefone:</label><br>
                <input type='tel' name='telefone'><br><br>
                <input type='submit' value='Cadastrar'><br><br>  
                <%
                    try{
                        String nome = request.getParameter("nome");
                        String email = request.getParameter("email");
                        Integer tel = Integer.valueOf(request.getParameter("telefone"));
                %>
                        <h4>Seu nome é: <%= nome %></h4>
                        <h4>Seu E-mail é: <%= email %></h4>
                        <h4>Seu Telefone é: <%= tel %></h4>      
                <% }                
                    catch(Exception e){
                        out.println("Preencha o formulário!");
                    }
                %>
            </form>   
    </body>
</html>
