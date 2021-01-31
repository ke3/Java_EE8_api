<%@page contentType="text/html;charset=UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<%String message = (String)request.getAttribute("message"); %>
<%String color = (String)request.getAttribute("color"); %>

<html><head><title>ColorMessage2</title></head>
	
<body style="background-color: <%=color%>;">
	<form action="<%=request.getContextPath() %>/kadai/srv2/color2.jsp" method="POST">
	<p><%=message%></p>
	
	<input type="submit" value="戻る" >

	</form>
</body>
</html>