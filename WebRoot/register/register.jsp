<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-dojo-tags" prefix="sx" %>
<sx:head />
<html>
<head>
<base href="<%=basePath%>">

<title>注册页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body bgcolor="#CCCCFF">
	<s:fielderror/>
	<s:form action="registerAction" method="post" theme="simple">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<table border="1" align="center" bgcolor="AABBCCDD">
			<tr>
				<td><s:text name="用户名："></s:text></td>
				<td><s:textfield name="user.userName" label="用户名字" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="密码："></s:text></td>
				<td><s:password name="user.password" label="用户密码" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="确认密码："></s:text></td>
				<td><s:password name="user.password1" label="再次输入密码" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="生日："></s:text></td>
				<td><sx:datetimepicker name="user.birth" displayFormat="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<td><s:text name="家庭住址："></s:text></td>
				<td><s:textfield name="user.location" label="家庭住址" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="邮箱："></s:text></td>
				<td><s:textfield name="user.email" label="邮箱" size="16" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<s:submit value="提交" />
					<s:reset value="清空" />	
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<s:a href="login/login.jsp">返回</s:a>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>
