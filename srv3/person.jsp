<%@page contentType="text/html;charset=UTF-8" %>

<html><head><title>Person Input</title></head>
	
<body>
	<p>個人情報を入力してください。<br>
	<form action="<%=request.getContextPath() %>/Personal" method="POST">
		名前：
		<input type="text" name="name"><br>
		住所：
		<input type="text" name="address"><br>
		電話番号：
		<input type="text" name="telephone"><br>
		
		<input type="submit" value="送信"><br>
	</form></p>
</body>
</html>