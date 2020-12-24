$(document).ready(function() {
	console.log("tes1t");
	$('#userRegisterSubmitId').off('click').on('click', function() {
		$.ajax({
			url: "user/doRegister",
			type: 'post',
			data: $("#userLoginForm").serialize(),
			success: function(data) {
				console.log(data);
			}
		});
		console.log("test");
		return false;
	});
});