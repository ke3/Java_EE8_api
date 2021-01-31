<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>Login</title></head>
<!-- scrptlt -->
<%-- String outmes = (String)request.getAttribute("outmes"); --%>
<body>
	<p>ユーザー名およびパスワードを入力してください</p>
	<form action="<%=request.getContextPath() %>/Login" method="POST">
		<p>ユーザー名：<input type="text" name="user">
		<br>
		パスワード：<input type="password" name="password">
		<br>
		<input type="submit" value="ログイン"></p>
	</form>
<!-- scrptlt -->
<%-- if(outmes!=null){ %>
		<p><% =outmes %></p>
	<% } --%>
		
		${outmes}
</body>
</html>

