<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Callback</title>
</head>

<script type="text/javascript">
window.onload = formSubmit;
function formSubmit() {
	document.forms[0].submit();
} 
</script>
<body>
	<form method="post" action="ExportProcessing">
		<input type = "hidden" name="code" value="${param.code}">
		<input type = "hidden" name="userID" value="${param.client_id}">
	</form>
</body>
</html>