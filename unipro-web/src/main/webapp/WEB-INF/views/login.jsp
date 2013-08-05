<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Login page</title>
</head>
<body>
	<div>LOGIN</div>

	<div>
		<form:form commandName="person" method="post">
		name: <form:input path="name" /> <br>
		password : <form:password path="password" />
			<input type="submit" name="login">
		</form:form>
	</div>
</body>
</html>