<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ligas</title>
</head>
<body>

	<ol>
	<s:iterator value="liga">
		<li><s:property /></li>
	</s:iterator>
	</ol>

</body>
</html>