<%@page contentType="text/html;charset=UTF-8" %>

<html><head><title>Color</title></head>
	
<body>
	<p>表示したいメッセージを入れ<br>
	メッセージの背景色を選択して送信ボタンを<br>
	クリックしてください。
	<form action="<%=request.getContextPath() %>/ColorMessage" method="POST">
		メッセージ：
			<input type="text" name="message"><br>
		背景色：
			<select name="color">
				<option value="red">Red
				<option value="yellow">Yellow
				<option value="blue">Blue
				<option value="green">Green
				<option value="purple">Purple
				<option value="gray">Gray
				<option value="white">White
			</select><br>
			<input type="submit" value="送信">
	
	</form></p>
</body>
</html>