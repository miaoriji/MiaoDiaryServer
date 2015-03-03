<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@include file="/common/include/getCtx.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${ctx }/js/user.js"></script>
<title>登录界面</title>

</head>
<body>
	<%
	Object msg = session.getAttribute("message");
	%>
	<form id="userlogin" name="userlogin" action="${ctx }/user/login" method="post">
		<table width="500" align="center"  border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td >
					用户名：
				</td>
				<td >
					<input id="account" name="account" type="text" />
				</td>
			</tr>
			<tr>
				<td >
					密码：
				</td>
				<td>
					<input id="password" name="password" type="password"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input  type="button" value="提交" onclick="usersubmit()" />
					<input  type="button" value="取消"/>
				</td>
			</tr>
		</table>
		
		
		
	</form> 
	
	<% if(msg != null ){ %>
		<p><font color="red"><%=msg.toString() %></font></p>
	<%} %>
	

	
</body>
</html>