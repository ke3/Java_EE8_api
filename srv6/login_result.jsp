<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>Enzan Result</title></head>
<%String user = (String)session.getAttribute("user"); %>
<%String ermes = (String)request.getAttribute("ermes"); %>
<%String logmes = (String)request.getAttribute("mes"); %>
<%String time = (String)request.getAttribute("time"); %>
<body>
	
	<% if(ermes!=null){ %>
			<p style="color: red;"><%=ermes%></p>
	<% } %>
			<%	if(logmes!=null){ %>
			<p><%=user%> <%=logmes%></p>
	<% } %>
	<%	if(time!=null){ %>
			<p><%=time%></p>
	<% } %>
	<br>
	<form action="<%=request.getContextPath() %>/kadai/srv6/login.jsp" method="POST">
		<input type="submit" value="戻る" >
	</form>
	
	<% if(ermes==null){ %>
		<form action="<%=request.getContextPath() %>/Login" method="POST">
			<input type="submit" name="logout" value="ログアウト" >
		</form>
	<% } %>
	
</body>
</html>