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
    
    <title>查找到的好友</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
  	function update(){
  		targetForm = document.forms[0];
  		targetForm.action = "registerAction";
  	}
  </script>
  <body>
  	<s:form action="deleteFriInfoAction" method="post" theme="simple">
	  	<table border="5" cellspacing="0" cellpadding="0" bgcolor="#95BDFF"
			width="60%" align="center">
			<tr>
				<th height="30">好友姓名</th>
				<th height="30">手机号</th>
				<th height="30">邮箱</th>
				<th height="30">住址</th>
				<th height="30">操作</th>
			</tr>
			<s:iterator value="list">
			  <tr height="32">
			  		<s:hidden name="id" value="id"></s:hidden>
				  <td><s:property value="friendName"/></td>
				  <td><s:property value="friendPhone"/></td>
				  <td><s:property value="friendEmail"/></td>
				  <td><s:property value="friendPlace"/></td>
				  <td>
				  		<a href="getUpdateFriInfoAction?id=<s:property value="id"/>">修改</a>
				  		<a href="deleteFriInfoAction?id=<s:property value="id"/>">删除</a>
				  </td>
			  </tr>
	  		</s:iterator> 
		</table>
	</s:form>
  </body>
</html>
