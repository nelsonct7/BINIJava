

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="p1.Userdao"%>         
    <jsp:useBean id="obj" class="p1.User">  </jsp:useBean>  
    <jsp:setProperty property="*" name="obj"/>  
    
    

    <%  
        int i=Userdao.register(obj);  
        if(i>0)  
        out.print("You are successfully registered");  

    %>  