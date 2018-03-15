<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ligas</title>
</head>
<body>

	<s:form action="listLigas.action" namespace="/" method="post">
		<s:submit value="Lista las ligas"></s:submit>
	</s:form>

	<ol>
	<s:iterator value="ligas">
		<li><s:property value="nombre"/></li>
	</s:iterator>
	</ol>

</body>
</html>