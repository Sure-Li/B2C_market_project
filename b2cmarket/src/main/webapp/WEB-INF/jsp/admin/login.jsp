<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录首页</title>
<jsp:include page="../base.jsp" />
</head>
<body>
	<h1 id="login_info"></h1>
	<form id="form_login" style="text-align: center;">
		 登陆账号：<input name="userCode"><br>
		 登陆密码：<input type="password"name="userPassword"><br>
		记住我：<input type="checkbox" name="isRemenber" ${sessionScope.isRemenber==1?"checked = 'checked'":"" }><br>
		<input type="button" value="登录" id="btn_login">
		<input type="reset">
	</form>
</body>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#btn_login').off('click').on('click',function(){
		$.ajax({
			url:'admindologin',
			data:$('#form_login').serialize(),
			success:function(data){
				if(data==1){
					location.href="admin";
				}else if(data==3){
					$('#login_info').text("账户被锁定，请联系管理员");
				}else if(data==2){
					$('#login_info').text("密码错误");
				}
			}
		});
	});
	$(window).on('keydown',function(event){
		if(event.keyCode==13){
			$('#btn_login').click();
		}
	});
});
</script>
</html>