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
        <link rel="stylesheet" href="../css/styles.css" type="text/css" />
        <title>JavaTwigs</title>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <h1>JavaTwigs</h1>
            </div>
            <div class="content">
                <h2>Successfully submitted</h2>
                <p>Thank you for taking the time to register, we will be in contact with you shortly.</p>

                <%
                    String title = request.getParameter("title");
                    String firstName = request.getParameter("firstName");
                    String lastName = request.getParameter("lastName");
                    String emailAddress = request.getParameter("emailAddress");
                    %>

                <form name="SubmitForm" action="../" method="POST">
                <table class="table">
                    <tr>
                        <td><%= title + " " + firstName + " " + lastName %></td>
                    </tr>
                    <tr>
                        <td><%= emailAddress %></td>
                    </tr>
                </table>
                <input class="btn" type="submit" value="Create New" name="createNew" />
                </form>
            </div>
            <div class="footer">
                © Copyright JavaTwigs 2015
            </div>
        </div>
        
        <%
            StringBuilder message = new StringBuilder();
            message.append(title);
            message.append(" ");
            message.append(firstName);
            message.append(" ");
            message.append(lastName);
            message.append("\n");
            message.append(emailAddress);
            %>
            
    </body>
</html>
