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
    
    <title>My JSP 'updateFriInfo.jsp' starting page</title>
    
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
	<s:form action="updateFriInfoAction" method="post" theme="simple">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<table border="1" align="center" bgcolor="AABBCCDD">
			<!-- 设置一个隐藏的文本用于存放id,为了方便去数据库更新数据 -->
			<s:hidden name="friends.id" value="%{#session.friend.id}"></s:hidden>
			<tr>
				<td><s:text name="好友名："></s:text></td>
				<td><s:textfield name="friends.friendName" value="%{#session.friend.friendName}" label="好友字" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="手机号："></s:text></td>
				<td><s:textfield name="friends.friendPhone" value="%{#session.friend.friendPhone}" label="手机号" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="邮箱："></s:text></td>
				<td><s:textfield name="friends.friendEmail" value="%{#session.friend.friendEmail}" label="邮箱" size="16" /></td>
			</tr>
			<tr>
				<td><s:text name="地址："></s:text></td>
				<td><s:textfield name="friends.friendPlace" value="%{#session.friend.friendPlace}" label="地址" size="16" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<s:submit value="提交" />
					<s:reset value="清空" />	
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>
