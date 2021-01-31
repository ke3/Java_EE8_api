<%@page contentType="text/html;charset=UTF-8" %>
<html><head><title>BMI Result</title></head>
	
<body>
	<form action="<%=request.getContextPath() %>/kadai/srv4/bmi.jsp" method="POST">
		あなたの身長：
		${BmiBean.height}<br>
		あなたの身長：
		${BmiBean.weight}<br>
		
		あなたのBMIは<br>
		${BmiBean.bmi} です<br>
			
		肥満度は<br>
		${BmiBean.mes} です<br>
	<input type="submit" value="戻る" >
	</form>
	</p>
</body>
</html>