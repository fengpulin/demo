<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>accessWebElement</title>
</head>
<body>
	<s:property value="#request.request1"/><br/>
	<s:property value="#session.session1"/><br/>
	<s:property value="#application.application1"/><br/>
	el:${request1}
	el:${application1}
</body>
</html>