<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- Main Container  -->
<div class="main-container container">
	<ul class="breadcrumb">
		<li><a href="#"><i class="fa fa-home"></i></a></li>
		<li><a href="#">Account</a></li>
		<li><a href="#">My Account</a></li>
	</ul>

	<div class="row">
		<!--Middle Part Start-->
		<div class="col-sm-9" id="content">
			<h2 class="title">My Account</h2>
			<p class="lead">
				<!-- Hello, <strong>Jhone Cary!</strong> -  -->
				To update your account information.
			</p>
			<form>
				<div class="row">
					<div class="col-sm-6">
						<fieldset id="personal-details">
							<legend>Personal Details</legend>
							<input type="hidden" id="rowIdForInitFunction" value="${userMyCount.rowId}">
							<div class="form-group required">
								<label for="input-firstname" class="control-label">User Type</label> <br>${userMyCount.userType==0?"买家":"卖家"}
							</div>
							<div class="form-group required">
								<label for="input-lastname" class="control-label">User Name</label> <br>${userMyCount.userName}
							</div>
							<div class="form-group required">
								<label for="input-email" class="control-label">User Code</label> <br>${userMyCount.userCode}
							</div>
							<div class="form-group required">
								<label for="input-telephone" class="control-label">User LastLoginIp</label> <br>${userMyCount.lastLoginIp}
							</div>
							<div class="form-group required">
								<label for="input-telephone" class="control-label">User LastLoginDate</label> <br>
								<fmt:formatDate value="${userMyCount.lastLoginDate}" pattern="yyyy-MM-dd HH:mm:ss" />
							</div>
							<div class="form-group">
								<label for="input-fax" class="control-label">Is Lock</label> <br>${userMyCount.isLock==1?"锁定":"正常"}
							</div>
						</fieldset>
						<br>
					</div>
					<div class="col-sm-6">
						<fieldset id="personal-details">
							<legend>
								Address Manage&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="address/goAddAddress/${userMyCount.rowId}" id="addAddressId">Add Address</a>
							</legend>
							<c:if test="${!empty addressMycountList}">
								<c:forEach items="${addressMycountList}" var="address">
									<c:if test="${address.activeFlag==1}">
										<div class="form-group required">
											收货电话：${address.addressPhone} 详细地址：${address.addressDetail} <a href="address/edit/${address.rowId}" id="btn-edit">修改</a> <a href="address/delete/${address.rowId}" id="btn-delete">删除</a> ${address.addressIsDefault==1?"<span style='color: red;'>默认地址<span/>":""}
										</div>

									</c:if>
								</c:forEach>
							</c:if>
							<c:if test="${empty addressMycountList}">
								<h1 style="color: red;">暂无数据</h1>
							</c:if>
						</fieldset>
						<br>
					</div>
					<div class="col-sm-6">
						<fieldset id="personal-details">
							<legend>
								Order Manage
							</legend>
							<c:if test="${!empty orderList}">
							<table style="text-align: center;">
							<tr>
							<th>订单编号</th><th>用户账号</th><th>订单总价格</th><th>地址序号</th><th>订单状态</th><th>支付方式</th>
							</tr>
								<c:forEach items="${orderList}" var="order">
									<c:if test="${order.activeFlag==1}">
										<tr>
											<td>${order.orderCode}</td>
											<td>${order.userId}</td>
											<td>${order.priceSum}</td>
											<td>${order.addressId}</td>
											<td>
												<c:if test="${order.orderState==1}">
													代付款
											        </c:if>
												<c:if test="${order.orderState==2}">
													待发货
												</c:if>
												<c:if test="${order.orderState==3}">
											                        待收货
												</c:if>
												<c:if test="${order.orderState==4}">
													待评价
												</c:if>
												<c:if test="${order.orderState==5}">
													订单完成
												</c:if>
											</td>
											<td>
												<c:if test="${order.orderPayMethod==1}">
													到付
											        </c:if>
												<c:if test="${order.orderPayMethod==2}">
													微信 
												</c:if>
												<c:if test="${order.orderPayMethod==3}">
											                        支付宝 
												</c:if>
												<c:if test="${order.orderPayMethod==4}">
													信用卡
												</c:if>
											</td>
											<td>
											<c:if test="${order.orderState==1}">
													<a href="order/pay/${order.rowId}" id="btn-order-pay">支付</a>
											        </c:if>
												<c:if test="${order.orderState==3}">
											        <a href="order/getgoods/${order.rowId}" id="btn-order-pay">收货</a>
												</c:if>
												<c:if test="${order.orderState==4}">
													<a href="order/evaluate/${order.rowId}" id="btn-order-pay">评价</a>
												</c:if>
											 
											<a href="order/cancel/${order.rowId}" id="btn-order-cancel">删除</a></td>
										</tr>
									</c:if>
								</c:forEach>
								</table>
							</c:if>
							<c:if test="${empty orderList}">
								<h1 style="color: red;">暂无数据</h1>
							</c:if>
						</fieldset>
						<br>
					</div>
				</div>

			</form>
		</div>
		<!--Middle Part End-->
		<!--Right Part Start -->
		<aside class="col-sm-3 hidden-xs content-aside col-md-3" id="column-right">
			<h2 class="subtitle">Account</h2>
			<div class="list-group">
				<ul class="list-item">
					<li><a href="login.html">Login</a></li>
					<li><a href="register.html">Register</a></li>
					<li><a href="#">Forgotten Password</a></li>
					<li><a href="#">My Account</a></li>
					<li><a href="#">Address Books</a></li>
					<li><a href="wishlist.html">Wish List</a></li>
					<li><a href="#">Order History</a></li>
					<li><a href="#">Downloads</a></li>
					<li><a href="#">Reward Points</a></li>
					<li><a href="#">Returns</a></li>
					<li><a href="#">Transactions</a></li>
					<li><a href="#">Newsletter</a></li>
					<li><a href="#">Recurring payments</a></li>
				</ul>
			</div>
		</aside>
		<!--Right Part End -->
	</div>
</div>
<!-- //Main Container -->
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						var add_index = null;
						$('#addAddressId').off('click').on('click', function() {
							var href = $(this).attr('href');
							console.log(href);
							$.ajax({
								url : href,
								type : 'get',
								success : function(htmlData) {
									add_index = layer.open({
										type : 1,
										title : "用户地址新增",
										area : [ '600px', '550px' ],
										content : htmlData,
										success : function(layero, index) {
											bindSubmit();
										}
									});
								}
							});
							return false;
						});
						function bindSubmit() {
							$('#btn-add-submit').off('click').on('click',
									function() {
										$.ajax({
											type : 'post',
											url : 'address',
											data : $('#form_add').serialize(),
											success : function(data) {
												console.log(data);
												if (data) {
													layer.close(add_index);
													initListData();
												}
											}
										});
										return false;
									});

						}
						$(document)
								.off('change', '#input-addressProviceCode')
								.on(
										'change',
										'#input-addressProviceCode',
										function() {
											var rowId = $(this).val();
											$
													.ajax({
														url : 'register/makeCity/'
																+ rowId,
														method : 'get',
														success : function(data) {
															if (data) {
																$(
																		'#input-addressCityCode')
																		.html(
																				data);
																$(
																		'#input-addressReginCode')
																		.html(
																				'<option value="">--- Please Select ---</option>');
															} else {
																$(
																		'#input-addressCityCode')
																		.html(
																				'<option>---已经是最底部---<option/>');
															}
														}
													})
										});
						$(document)
								.off('change', '#input-addressCityCode')
								.on(
										'change',
										'#input-addressCityCode',
										function() {
											var rowId = $(this).val();
											$
													.ajax({
														url : 'register/makeRegin/'
																+ rowId,
														method : 'get',
														success : function(data) {
															if (data) {
																$(
																		'#input-addressReginCode')
																		.html(
																				data);
															} else {
																$(
																		'#input-addressReginCode')
																		.html(
																				'<option>---已经是最底部---<option/>');
															}
														}
													})
										});
						$(document).off('click', '#btn-delete').on('click',
								'#btn-delete', function() {
									console.log("btn-delete");
									var href = $(this).attr('href');
									console.log(href);
									layer.alert('', {
										icon : 2,
										area : [ '200px', '200px' ],
										title : '地址删除',
										content : '您确定要删除吗？',
										closeBtn : 1
									}, function(index) {
										$.ajax({
											url : href,
											method : 'get',
											success : function(data) {
												if (data == 1) {
													initListData();
												}
											}
										});
										layer.close(index);
									});
									return false;
								});
						function initListData() {
							$.ajax({
								url : 'myAccount',
								type : 'get',
								data : {
									rowId : $('#rowIdForInitFunction').val()
								},
								success : function(data) {
									if (data) {
										$('#marketMainContainerId').html(data);
									}
								}
							});
						}
						/* edit */
						var editIndex = null;
						function bindEditSubmit() {
							$('#btn-edit-submit').off('click').on('click',
									function() {
										$.ajax({
											type : 'get',
											url : 'address/doedit',
											data : $('#form_edit').serialize(),
											success : function(data) {
												console.log(data);
												if (data) {
													layer.close(editIndex);
													initListData();
												}
											}
										});
										return false;
									});
						}
						$(document)
								.off('click', '#btn-edit')
								.on(
										'click',
										'#btn-edit',
										function() {
											console.log("btn-edit");
											var href = $(this).attr('href');
											console.log(href);
											$
													.ajax({
														url : href,
														type : 'GET',
														success : function(
																result) {
															editIndex = layer
																	.open({
																		type : 1,
																		title : "用户修改",
																		area : [
																				'600px',
																				'550px' ],
																		content : result,
																		success : function(
																				data) {
																			console
																					.log("bindEditSubmit();");
																			bindEditSubmit();
																		}
																	});
														}
													});
											return false;
										});
						
						$(document).off('click', '#btn-order-pay').on('click','#btn-order-pay',function() {
							console.log($(this).attr('href'));
							$.ajax({
								type : 'post',
								url : $(this).attr('href'),
								success : function(data) {
									console.log(data);
									if (data) {
										initMycountPage();
									}
								}
							});
							return false;
						});
						$(document).off('click', '#btn-order-cancel').on('click','#btn-order-cancel',function() {
							console.log($(this).attr('href'));
							$.ajax({
								type : 'post',
								url : $(this).attr('href'),
								success : function(data) {
									console.log(data);
									if (data) {
										initMycountPage();
									}
								}
							});
							return false;
						});
						function initMycountPage() {
							console.log($('#userLoginRowId').val());
							$.ajax({
								url:'myAccount',
								type:'get',
								data:{rowId:$('#userLoginRowId').val()},
								success:function(result){
									if(result){
										$('#marketMainContainerId').html(result);
									}
								}
							});
						}
					});
</script>