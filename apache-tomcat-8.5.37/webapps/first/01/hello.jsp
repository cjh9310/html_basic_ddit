<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h4>welcome page</h4>
클라이언트의 현재 시각 
<div id="area1"></div>
서버의 현재 시각 : <%=new Date() %>
<script type="text/javascript">
	let today = new Date();
	let area1 = document.getElementById("area1");
	area1.innerHTML = today;
</script>
</body>
</html>