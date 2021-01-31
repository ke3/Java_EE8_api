<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>Enzan Result</title></head>
<%String nullmes = (String)request.getAttribute("nullmes"); %>
<%String error1 = (String)request.getAttribute("error1"); %>
<%String error2 = (String)request.getAttribute("error2"); %>
<%String error3 = (String)request.getAttribute("error3"); %>

<body>
	${EnzanBean.v1}
	${EnzanBean.ezs}
	${EnzanBean.v2}
	${EnzanBean.equ}
<%--	if(nullmes == null && error1 == null && error2 == null && error3 == null){ %>
		=
	<% } %> --%>
	${EnzanBean.result}

	<% if(nullmes!=null){ %>
			<p><%=nullmes%></p>
	<% } %>
	<% if(error1!=null){ %>
			<p><%=error1%></p>
	<% } %>
	<% if(error2!=null){ %>
			<p><%=error2%></p>
	<% } %>
	<% if(error3!=null){ %>
			<p><%=error3%></p>
	<% } %>
	<br>
	<form action="<%=request.getContextPath() %>/kadai/srv5/enzan.jsp" method="POST">
		<input type="submit" value="戻る" >
	</form>
	
</body>
</html>