<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
	<head><title>Success: Upload User Image</title></head>
	<body>
		<h2>utStruts2 File Upload Example</h2>
		User Image:	<s:property value="userImage" /><br/>
    	Content Type:<s:property value="userImageContentType" /><br/>
		File Name:<s:property value="userImageFileName" /><br/>


		<img src="images/<s:property value="userImageFileName"/>" />
	</body>
</html>