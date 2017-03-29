<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lookInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#CCCCFF">
  	<p align="center"><s:a href="information/updateInfo.jsp">修改信息</s:a></p> 
	<s:form action="" method="post" theme="simple">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<table border="1" align="center" bgcolor="AABBCCDD">
			<tr>
				<td><s:text name="用户名："></s:text></td>
				<td><s:property value="#session.user.userName"  /> </td>
			</tr>
			
			<tr>
				<td><s:text name="密码："></s:text></td>
				<td><s:property value="#session.user.password" /></td>
			</tr>
			<tr>
				<td><s:text name="生日："></s:text></td>
				<td><s:date name="#session.user.birth" format="yyyy-MM-dd" /></td>
			</tr>
			<tr>
				<td><s:text name="家庭住址："></s:text></td>
				<td><s:property value="#session.user.location" /></td>
			</tr>
			<tr>
				<td><s:text name="邮箱："></s:text></td>
				<td><s:property value="#session.user.email" /></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
