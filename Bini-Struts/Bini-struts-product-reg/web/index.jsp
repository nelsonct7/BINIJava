<%-- 
    Document   : index
    Created on : Dec 9, 2015, 8:26:43 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>      
<s:form action="product">  
<s:textfield name="id" label="Product Id"></s:textfield>  
<s:textfield name="name" label="Product Name"></s:textfield>  
<s:textfield name="price" label="Product Price"></s:textfield>  
<s:submit value="save"></s:submit>  
</s:form>  
   