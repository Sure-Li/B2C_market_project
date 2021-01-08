<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>单页版首页SSM</title>
<jsp:include page="../base.jsp" />
<!-- 先引第三方 再引自己的 -->
<link rel="stylesheet" href="js/layer/theme/default/layer.css">
<link rel="stylesheet" href="css/page/index.css">
<link rel="stylesheet" href="js/uploadfile/uploadifive.css">
<link rel="stylesheet" href="js/jquery-treetable/css/jquery.treetable.css">
<link rel="stylesheet" href="js/jquery-treetable/css/jquery.treetable.theme.default.css">
</head>
<body>
	<div class="contaner">
		<div class="top">
			<h1>后台管理系统</h1>
			<span style="position: absolute; top: 10px; right: 10px"> <font id="loginUserName">${sessionScope.loginAdminUser.userName}</font> <a href="JavaScript:;" id="btn_loginOut">退出</a>
			</span>
		</div>
		<div class="left">
			<a href="orderdateCountManage">订单数据</a><br> 
			<a href="userManage">用户管理</a><br> 
			<a href="orderManage">订单管理</a><br>
			<a href="catalogueManage">商品目录管理</a><br>
			<a href="commodityManage">商品管理</a><br>
		</div>
		<div class="main" id="maindiv"></div>
	</div>

</body>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
<script type="text/javascript" src="js/page/app-ajax.js"></script>
<script type="text/javascript" src="js/uploadfile/jquery.uploadifive.js"></script>
<script type="text/javascript" src="js/page/admin/index.js"></script>
<script type="text/javascript" src="js/jquery-treetable/jquery.treetable.js"></script>
<script type="text/javascript" src="js/chartjs/dist/Chart.min.js"></script>
</html>