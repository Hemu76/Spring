<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
String p=""+request.getAttribute("userName");
%>
	<h3>Hi ${userName}</h3>
</body>
<script type="text/javascript">
console.log(${userName});
</script>
</html>