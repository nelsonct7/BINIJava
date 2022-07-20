<jsp:include page="index.jsp"></jsp:include>  
  
<%@ taglib uri="/struts-tags" prefix="s" %>  
Hello user, data is set into the ServletContext object  
<br/>  
Now you may click the second page to verify  
<br/>  
Data is :<s:property value="#application.dummyobject"/>  