<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>login success</h1>
	<h5>使用struts标签取值</h5>
	<s:property value="actionString"/>
	<s:property value="user.name"/>:
	<s:property value="user.password"/>
	<h6>使用struts标签取action中新建user的值，这是action里写入request中的值</h6>
	user1:<br/>
	<s:property value="user1.name"/>:
	<s:property value="user1.password"/><br/>
	user2:<br/>
	<s:property value="user2.name"/>:
	<s:property value="user2.password"/>
	<h5>使用el表达式取值</h5>
	${actionString}
	${user.name} : ${user.password}
	<h6>使用el表达式取action中新建user的值，这是action里写入request中的值</h6>
	user1:<br/>
	${u1.name} : ${u1.password}<br/>
	user2:<br/>
	${u2.name} : ${u2.password}
</body>
</html>