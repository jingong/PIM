<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'uploadFile.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="gray">
    <s:form action="uploadFileAction" method="post"
		enctype="multipart/form-data">
		<table border="5" cellspacing="0" cellpadding="0" bgcolor="#95BDFF"
			width="60%" align="center">
			<tr>
				<td><s:textfield name="file.fileTitle" label="文件标题" size="20"></s:textfield>
				</td>
			</tr>
			<tr>
				<td height="30"><s:file name="upload" label="选择文件" size="20"></s:file>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<s:submit value="上传"></s:submit>
					<s:reset value="清空"></s:reset>
				</td>
			</tr>
		</table>
	</s:form>
  </body>
</html>
