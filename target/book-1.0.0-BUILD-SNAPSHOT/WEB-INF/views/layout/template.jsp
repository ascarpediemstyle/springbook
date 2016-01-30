<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width" />
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/css/styles.css"
    type="text/css" media="screen, projection">
<script type="text/javascript">

</script> 
<%-- <c:set var="titleKey"> 
    <tiles:insertAttribute name="title" ignore="true" />
</c:set>
<title><spring:message code="${titleKey}" text="Create Staff Information" /></title><!-- (3) --> --%>
</head>
<body>
    <div id="header">
        <tiles:insertAttribute name="header" /> 
    </div>
    <div id="body">
        <!-- <tiles:insertAttribute name="body" /> -->
    </div>
    <div id="footer">
        <tiles:insertAttribute name="footer" /> 
    </div>
</body>
</html>