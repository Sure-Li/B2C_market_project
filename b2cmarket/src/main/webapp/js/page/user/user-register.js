$(document).ready(function() {
	console.log("tes1t");
	console.log($("#userRegisterForm")[0]);

	$('#userRegisterSubmitId').off('click').on('click', function() {
		$.ajax({
			url: "user/doRegister",
			type: 'post',
			data: $("#userRegisterForm").serialize(),
			success: function(data) {
				console.log(data);
				if (data) {
					$('#marketMainContainerId').html(data);
				}
			}
		});
		console.log("test");
		return false;
	});
});