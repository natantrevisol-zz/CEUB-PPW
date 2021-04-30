<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabuada em JSP</title>
    </head>
    <body>          
        <% try{ Integer numero = Integer.valueOf(request.getParameter("numero")); %>
        
        <h2>Exibindo a tabuada do número: <%=numero%></h2>
        
        <hr>
        
        <table border="1">
            <%for(int i=1; i<=10; i++){ %>
            <tr>
                <td><%= numero %> x <%= i %> = <%= numero * i %></td>
            </tr>
            <% } %>
        </table>
        
        <% } catch(Exception e){
                out.println("Insira um número no parametro numero na URL!");
            }
        %>
        
    </body>
</html>
