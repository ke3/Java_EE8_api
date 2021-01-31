<%@page contentType="text/html;charset=UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<%String message = (String)request.getAttribute("message"); %>
<%String color = (String)request.getAttribute("color"); %>

<html><head><title>ColorMessage</title></head>
	
<body style="background-color: <%=color%>;">
	
	<p><%=message%></p>

	<form><input type="button" value="戻る" onClick="history.back()" >
	</form>
</body>
</html>