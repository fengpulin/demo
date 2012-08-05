<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

	function checkLogin(){
		var name=document.getElementById("userName").value;
		if(name==""||name==null){
			alert("用户名不可为空"+name);
			return false;
		}
		var password=document.getElementById("userPassword").value;
		if(password==""||password==null){
			alert("密码不能为空"+password);
			return false;
		}
		else return true;
	}
</script>
MY first maven struts project
<form action="login" method="post">
	user name:<input type="text" name="user.name" id="userName"></input><br/>
	password:<input type="password" name="user.password" id="userPassword"></input><h5 id="error"></h5><br/>
	<input type="submit" value="submit" onclick="return checkLogin();"></input>
</form>


</body>
</html>