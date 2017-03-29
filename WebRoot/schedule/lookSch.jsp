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
    
    <title>My JSP 'lookSch.jsp' starting page</title>
    
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
	<hr noshade />
	<s:div align="center">
		<table border="0" cellspacing="0" cellpadding="0" width="100%"
			align="center">
			<tr>
				<td width="33%" align="right">
					<s:a href="schedule/addSch.jsp">增加日程</s:a>
				</td>
				
				<td width="33%" align="center">
					<s:a href="lookSchAction">查看所有日程</s:a>
				</td>
				<td width="33%" align="left">
					
				</td>
			</tr>
		</table>
	</s:div>
	<hr noshade />
	<table border="5" cellspacing="0" cellpadding="0" bgcolor="#95BDFF"
		width="60%" align="center">
		<tr>
			<th height="30">编号</th>
			<th height="30">日期</th>
			<th height="30">内容</th>
			<th height="30">操作</th>
		</tr>
		<s:iterator value="sch_lists">
		  <tr height="32">
			  <td><s:property value="id"/></td>
			  <td><s:date name="date" format="yyyy-MM-dd"/> </td>
			  <td><s:property value="thing"/></td>
			  <td>
			  		<a href="getUpdateSchAction?id=<s:property value="id"/>">修改</a>
			  		<a href="deleteSchAction?id=<s:property value="id"/>">删除</a>
			  </td>
		  </tr>
  		</s:iterator> 
	</table>
</body>
</html>
