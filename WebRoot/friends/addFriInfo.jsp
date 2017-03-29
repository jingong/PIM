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
    
    <title>My JSP 'addFriInfo.jsp' starting page</title>
    
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
	<s:form action="addFriInfoAction" method="post" theme="simple">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<table border="1" align="center" bgcolor="AABBCCDD">
			<tr>
				<td><s:text name="好友姓名："></s:text></td>
				<td><s:textfield name="friends.friendName" label="好友姓名" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="手机号："></s:text></td>
				<td><s:textfield name="friends.friendPhone" label="手机号" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="邮箱："></s:text></td>
				<td><s:textfield name="friends.friendEmail" label="邮箱" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="住址："></s:text></td>
				<td><s:textfield name="friends.friendPlace" label="住址" size="16" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<s:submit value="提交" />
					<s:reset value="清空" />	
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<s:a href="lookFriInfoAction">返回</s:a>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>
