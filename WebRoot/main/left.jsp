<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body bgcolor="#ACD6FF" style="padding-left: 15px">
	<br>
	<h4>欢迎使用</h4>
	<br>

	<p>
		<a href="information/lookInfo.jsp" target="main">个人信息管理</a>
	</p>

	<p>
		<a href="lookFriInfoAction" target="main">通讯录管理</a>
	</p>
	
	<p>
		<a href="lookSchAction" target="main">日程安排管理</a>
	</p>
	
	<p>
		<a href="lookFilesInfoAction" target="main">个人文件管理</a>
	</p>
	
</body>
</html>
