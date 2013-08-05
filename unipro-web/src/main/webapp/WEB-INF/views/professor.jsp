<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Professor Page</title>

<script type="text/javascript">
      var wsocket;
      function connect() {
          wsocket = new WebSocket("ws://localhost:8080/unipro-web/uniprows");
          wsocket.onmessage = onMessage;
      }
      
      function onMessage(evt) {
          
      }
      window.addEventListener("load", connect, false);
  </script>
</head>
<body>
	<div>Professor</div>
	
	<div>
		professor name = ${person.name} <br>
	</div>

	
</body>
</html>