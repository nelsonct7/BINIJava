<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<h3>All Records:</h3>  
<s:iterator  value="list">  
<fieldset>  
<s:property value="id"/><br/>  
<s:property value="name"/><br/>  
<s:property value="password"/><br/>  
<s:property value="email"/><br/>  
</fieldset>  
</s:iterator>  