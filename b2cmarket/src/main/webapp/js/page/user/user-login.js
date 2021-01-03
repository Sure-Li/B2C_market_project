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
	/*表单验证*/
	$('#loginFormSubmitId').bootstrapValidator('validate');
	$('#userLoginForm').bootstrapValidator({
		message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                userCode: {
                    message: '用户名验证失败',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {
                            min: 1,
                            max: 18,
                            message: '用户名长度必须在1到18位之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '用户名只能包含大写、小写、数字和下划线'
                        }
                    }
                },
                userPassword: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                    }
                }
            },
            submitHandler: function (validator, form, submitButton) {
                alert("submit");
            }
	});
});