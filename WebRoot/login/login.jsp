<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

</head>
<script type="text/javascript">
  	function register(){
  		targetForm = document.forms[0];
  		targetForm.action = "registerAction";
  	}
  </script>

<body background="images/bg1.jpg"
	style="text-align: center;padding-top: 150px">
	<s:fielderror></s:fielderror>
	<s:form action="loginAction" method="post" theme="simple">
		<div style="background-image:url('images/bg2.jpg');height:243px;width:444px;margin:auto">
			<br>
			<br>
			<br>
			<br>
			<table border="0" align="center">
				<tr>
					<td><s:textfield name="user.userName" label="登录名" size="16" /></td>
				</tr>
				<tr>
					<td><s:password name="user.password" label="登录密码" size="16" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<s:submit value="登录" />
						
						<s:reset value="清空" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<s:a href="register/register.jsp">注册</s:a>
					</td>
				</tr>
			</table>
		</div>
	</s:form>
</body>
</html>
