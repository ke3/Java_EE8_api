<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>Person Output</title></head>
	
<body>
	<p>
	<!--form action="<%=request.getContextPath() %>/Personal" method="POST"-->

		名前：
		${PersonBean.name}<br>
		住所：
		${PersonBean.add}<br>
		電話番号：
		${PersonBean.tel}<br>
	
	<form><input type="button" value="戻る" onClick="history.back()" >
	</form></p>
</body>
</html>