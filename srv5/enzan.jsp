<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>演算</title></head>
<body>
	<h3>演算</h3><br>
	<form action="<%=request.getContextPath() %>/Enzan" method="POST">
		<input type="text" name="value1">
		<input type="text" name="enzansi">
		<input type="text" name="value2">
		<input type="submit" value="演算">
	</form>
</body>
</html>
		

<!--  -->