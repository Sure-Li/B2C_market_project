$(document).ready(function() {
	console.log("tes1t");
	$('#loginFormSubmitId').off('click').on('click', function() {
		$.ajax({
			url: "user/doLogin",
			type: 'get',
			data: $('#userLoginForm').serialize(),
			success: function(data) {
				console.log(data);
				if(data=='success'){
					location.href="index";
				}else{
					$('#loginInfoPId').html('<div class="alert alert-danger" role="alert" >登录失败，请仔细检查账号和密码</div>');
				}
				
			}
		});
		console.log("test");
		return false;
	});
});