<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
</head>
<body>
	<form action="/add.do" method="post" enctype="multipart/form-data">
		<table>
		<tr>
		<td>
			<input type="file" name="f">
		</td>
		</tr>
		<tr>
		<td colspan="100">
		<input type="submit" value="添加">
		</td>
		</tr>
	</table>
	</form>
</body>
</html>