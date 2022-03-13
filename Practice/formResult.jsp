<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "Model.Person" %>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=0.8"> <!-- 控制螢幕的寬度和縮放比例 -->
		<title>Result</title>
		<link rel = "stylesheet" href = "css/form.css">
	</head>
	
	<body>
		<%!Person person;%>
		<%
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //禁止返回
			if(session.getAttribute("person") == null) //沒寫表單先返回填寫
				response.sendRedirect("form.html");
			person = (Person)session.getAttribute("person");
		 %>
		 <h2>感謝您的填寫~</h2>
		 <p class = "result"><%=person == null?null:person.toString()%></p>
		 <form class = "finish" action="finish">
		 	<button type = "submit" id = "second" >完成</button>
		 </form>
	</body>
	
</html>
