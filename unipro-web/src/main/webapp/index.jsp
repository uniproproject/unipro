

<!DOCTYPE html>
<html>
<head>
<title>Student page</title>

<script type="text/javascript">
      var wsocket;
      function connect() {
    	  alert('entramos');
//           wsocket = new WebSocket("ws://localhost:8080/dukeetf2/dukeetf");
// 			wsocket = new WebSocket("ws://localhost:8080/unipro/uniprows");
// 			wsocket = new WebSocket("ws://localhost:8080/test-ws/test-ws");
			wsocket = new WebSocket("ws://localhost:8080/unipro-web/uniprows");
			
          wsocket.onmessage = onMessage;
      }
      
      function onMessage(evt) {
          
      }
      window.addEventListener("load", connect, false);
  </script>
</head>
<body>
	<div>Student</div>

	
</body>
</html>