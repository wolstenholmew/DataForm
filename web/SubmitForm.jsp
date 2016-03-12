<%-- 
    Document   : CommissionerSubmitted
    Created on : Mar 9, 2016, 11:22:08 PM
    Author     : WayneWolstenholme
--%>

<%@page import="freshstart.forms.EmailMain"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thank you!</title>
    </head>
    <body>
        <h1>Successfully submitted</h1>
        <h3>Thank you for taking the time to register with Fresh Start in Education</h3>
        
        <%
            String title = request.getParameter("title");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String emailAddress = request.getParameter("emailAddress");
            %>
        
            <form name="SubmitForm" action="index.html" method="POST">
            <table>
                <tr>
                    <td>Title:</td>
                    <td><%= title %></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><%= firstName %></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><%= lastName %></td>
                </tr>
                <tr>
                    <td>Email Address:</td>
                    <td><%= emailAddress %></td>
                </tr>
            </table>
            <input type="submit" value="Create New" name="createNew" />
        </form>
        
        <%
            StringBuilder message = new StringBuilder();
            message.append(title);
            message.append(" ");
            message.append(firstName);
            message.append(" ");
            message.append(lastName);
            message.append("\n");
            message.append(emailAddress);

            //EmailMain.getInstance("fromWayne", "toEmily", "subjectLove", message.toString());
            %>
            
    </body>
</html>
