<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul class="breadcrumb">
	<li><a href="#"><i class="fa fa-home"></i></a></li>
	<li><a href="#">Account</a></li>
	<li><a href="#">Register</a></li>
</ul>

<div class="row">
	<div id="content" class="col-sm-12">
		<h2 class="title">Register Account</h2>
		<p>
			If you already have an account with us, please login at the <a href="login">login page</a>.
		</p>
		<!-- enctype="multipart/form-data" -->
		<form action="user/doRegister" id="userRegisterForm" class="form-horizontal account-register clearfix">
			<fieldset id="account">
				<legend>Your Personal Details</legend>
				<div class="form-group required" style="display: none;">
					<label class="col-sm-2 control-label">Customer Group</label>
					<div class="col-sm-10">
						<div class="radio">
							<label> <input type="radio" name="customer_group_id" value="1" checked="checked"> Default
							</label>
						</div>
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-firstname">User Name</label>
					<div class="col-sm-10">
						<input type="text" name="userName" value="" placeholder="userName" id="input-userName" class="form-control">
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-email">User Code</label>
					<div class="col-sm-10">
						<input type="text" name="userCode" value="" placeholder="User Code" id="input-userCode" class="form-control">
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-telephone">User Phone</label>
					<div class="col-sm-10">
						<input type="tel" name="userPhone" value="" placeholder="User Phone" id="input-userPhone" class="form-control">
					</div>
				</div>
			</fieldset>
			<fieldset id="address">
				<legend>Your Address</legend>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-country">Province</label>
					<div class="col-sm-10">
						<select name="addressProvinceCode" id="input-addressProviceCode" class="form-control">
							<option value="">--- Please Select ---</option>
							<c:if test="${!empty provinceList}">
								<c:forEach items="${provinceList}" var="province">
									<c:if test="${province.activeFlag==1}">
										<option value="${province.areaCode}">${province.areaName}</option>
									</c:if>
								</c:forEach>
							</c:if>
						</select>
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-country">City</label>
					<div class="col-sm-10">
						<select name="addressCityCode" id="input-addressCityCode" class="form-control">
							<option value="">--- Please Select ---</option>
						</select>
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-zone">Region</label>
					<div class="col-sm-10">
						<select name="addressReginCode" id="input-addressReginCode" class="form-control">
							<option value="">--- Please Select ---</option>
						</select>
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-city">Address Detail</label>
					<div class="col-sm-10">
						<input type="text" name="addressDetail" value="" placeholder="Address Detail" id="input-addressDetail" class="form-control">
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-postcode">Post Code</label>
					<div class="col-sm-10">
						<input type="text" name="addressPostCode" value="" placeholder="Post Code" id="input-postcode" class="form-control">
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-postcode">Phone</label>
					<div class="col-sm-10">
						<input type="text" name="addressPhone" value="" placeholder="Phone" id="input-postcode" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">Is Default Address</label>
					<div class="col-sm-10">
						<label class="radio-inline"> <input type="radio" name="addressIsDefault" value="1" checked="checked"> Yes
						</label> <label class="radio-inline"> <input type="radio" name="addressIsDefault" value="0"> No
						</label>
					</div>
				</div>

			</fieldset>
			<fieldset>
				<legend>Your Password</legend>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-password">Password</label>
					<div class="col-sm-10">
						<input type="password" name="userPassword" value="" placeholder="Password" id="input-password" class="form-control">
					</div>
				</div>
				<div class="form-group required">
					<label class="col-sm-2 control-label" for="input-confirm">Password Confirm</label>
					<div class="col-sm-10">
						<input type="password" value="" placeholder="Password Confirm" id="input-confirm" class="form-control">
					</div>
				</div>
			</fieldset>
			<div class="buttons">
				<div class="pull-right">
					I have read and agree to the <a href="#" class="agree"><b>Pricing Tables</b></a> <input class="box-checkbox" type="checkbox" name="agree" value="1"> &nbsp; <input type="submit" id="userRegisterSubmitId" value="Continue" class="btn btn-primary">
				</div>
			</div>
		</form>
	</div>
</div>
<script type="text/javascript" src="js/page/user/user-register.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#input-addressProviceCode').off('change').on('change', function() {
			var rowId = $(this).val();
			$.ajax({
				url:'register/makeCity/'+rowId,
				method:'get',
				success:function(data){
						if(data){
							$('#input-addressCityCode').html(data);
							$('#input-addressReginCode').html('<option value="">--- Please Select ---</option>');
						}else{
							$('#input-addressCityCode').html('<option>---已经是最底部---<option/>');
						}
					}
			})
		});
		$('#input-addressCityCode').off('change').on('change', function() {
			var rowId = $(this).val();
			$.ajax({
				url:'register/makeRegin/'+rowId,
				method:'get',
				success:function(data){
						if(data){
							$('#input-addressReginCode').html(data);
						}else{
							$('#input-addressReginCode').html('<option>---已经是最底部---<option/>');
						}
					}
			})
		});
		$('#userRegisterForm').bootstrapValidator({
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
	                            message: '用户账号不能为空'
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
	                userPhone: {
	                    message: '用户手机号验证失败',
	                    validators: {
	                        notEmpty: {
	                            message: '用户手机号不能为空'
	                        },
	                        stringLength: {
	                            min: 1,
	                            max: 11,
	                            message: '用户手机号长度必须在1到11位之间'
	                        }
	                        /* ,
	                        regexp: {
	                            regexp: '0?(13|14|15|18)[0-9]{9}',
	                            message: '手机格式匹配不正确'
	                        } */
	                    }
	                },
	                userPassword: {
	                    validators: {
	                        notEmpty: {
	                            message: '密码不能为空'
	                        },
	                    }
	                },
	                userName: {
	                    validators: {
	                        notEmpty: {
	                            message: '用户名称不能为空'
	                        },
	                    }
	                },
	                addressDetail: {
	                    validators: {
	                        notEmpty: {
	                            message: '详细地址不能为空'
	                        },
	                    }
	                },
	                addressPostCode: {
	                    validators: {
	                        notEmpty: {
	                            message: '邮编不能为空'
	                        },
	                    }
	                },
	                addressPhone: {
	                    validators: {
	                        notEmpty: {
	                            message: '收货人手机号不能为空'
	                        },
	                    }
	                }
	            },
	            submitHandler: function (validator, form, submitButton) {
	                alert("submit");
	            }
		});
	});
</script>
