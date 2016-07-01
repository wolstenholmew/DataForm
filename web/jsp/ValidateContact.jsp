<%-- 
    Document   : processForm
    Created on : Jun 26, 2016, 7:54:26 PM
    Author     : WayneWolstenholme
--%>

<%@ page import="java.util.*, inputFormBean.FormBean" %>

<%! ResourceBundle bundle = null;
    public void jspInit() {
        bundle = ResourceBundle.getBundle("formRedirect");
    }
%>

<jsp:useBean id="formHandler" class="inputFormBean.FormBean" scope="request">
    <jsp:setProperty name="formHandler" property="*" />
</jsp:useBean>
    
<% 
   if (formHandler.validate()) {
       String forwardAddress = bundle.getString("process.success");
%>
    <jsp:forward page="<%= forwardAddress %>"/>
<%
   }  else {
        String forwardAddress = bundle.getString("process.retry");
%>
    <jsp:forward page="<%= forwardAddress %>"/>
<%
   }
%>