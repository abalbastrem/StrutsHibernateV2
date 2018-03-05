<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jugadores</title>
</head>
<script>
</script>
<body>
	
	<ol>
	<s:iterator value="jugadores">
		<li><s:property /></li>
	</s:iterator>
	</ol>

</body>
</html>