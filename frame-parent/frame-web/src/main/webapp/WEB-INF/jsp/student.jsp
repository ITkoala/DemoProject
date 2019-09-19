<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Content-Type">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>第一页</title>
<link href="../js/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
<script  src="../js/bootstrap-3.3.7/js/jquery-3.4.1.min.js"></script>
<script src="../js/bootstrap-3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- Standard button -->
<button type="button" class="btn btn-default">（默认样式）Default</button>

<div>
	<c:forEach items="${list}" var="item" varStatus="current">
		<div>${item.name}</div>
	</c:forEach>
</div>
</body>
</html>
