<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>BMI</title></head>
<%String nullmes = (String)request.getAttribute("nullmes"); %>
<%String errormes = (String)request.getAttribute("errormes"); %>
<body>
	<p>身長と体重を入力してください。<br>
	<form action="<%=request.getContextPath() %>/BMI" method="POST">
		身長：
		<input type="text" name="height">cm<br>
		体重：
		<input type="text" name="weight">kg<br>
		
		<input type="submit" value="判定"><br>
		<% if(nullmes!=null){ %>
			<p><%=nullmes%></p>
		<% } %>
		<% if(errormes!=null){ %>
			<p><%=errormes%></p>
		<% } %>

	</form></p>
</body>
</html>
		

<!--  -->