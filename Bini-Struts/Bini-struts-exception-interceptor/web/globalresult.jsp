<%@ taglib uri="/struts-tags" prefix="s" %>  
  
Sorry an exception occured!  
<p>Exception Name: <s:property value="exception" /> </p>  
<p>Exception Details: <s:property value="exceptionStack" /></p>  
<form>  
<input type="button" value="back" onclick="history.back()">  
</form>  