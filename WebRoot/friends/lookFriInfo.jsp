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

<title>好友信息页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body bgcolor="#CCCCFF">
	<hr noshade />
	<s:div align="center">
		<s:form action="findFriInfoAction" method="post" theme="simple">
			<table border="0" cellspacing="0" cellpadding="0" width="100%"
				align="center">
				<tr>
					<td width="33%" align="right">
						<s:a href="friends/addFriInfo.jsp" >增加好友</s:a>
					</td>
					
					<td width="33%" align="center">
						<s:a href="lookFriInfoAction">查看所有好友</s:a>
					</td>
					<td width="33%" align="left">
						<s:text name="修改、删除联系人:"></s:text> 
						<s:textfield name="friends.friendName"></s:textfield> 
						<s:submit value="查找"></s:submit>
					</td>
				</tr>
			</table>
		</s:form>
	</s:div>
	<hr noshade />
	<table border="5" cellspacing="0" cellpadding="0" bgcolor="#95BDFF"
		width="60%" align="center">
		<tr>
			<th height="30">好友姓名</th>
			<th height="30">手机号</th>
			<th height="30">邮箱</th>
			<th height="30">住址</th>
		</tr>
		<s:iterator value="fri_lists">
		  <tr height="32">
			  <td><s:property value="friendName"/></td>
			  <td><s:property value="friendPhone"/></td>
			  <td><s:property value="friendEmail"/></td>
			  <td><s:property value="friendPlace"/></td>
		  </tr>
  		</s:iterator>  
	</table>
</body>
</html>
