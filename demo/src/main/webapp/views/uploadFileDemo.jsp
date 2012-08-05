<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts 2 File Upload</title>
</head>
<body>
	<s:form action="fileUpload" method="POST" enctype="multipart/form-data"> 
        <s:file name="myFile" label="Image File"/> 
        <s:textfield name="caption" label="Caption"/>        
        <s:submit/> 
    </s:form>
    
    <s:property value ="caption"/><br/>
    <img src ='\uploadFile\<s:property value="imageFileName"/>'/>
    
</body>
</html>