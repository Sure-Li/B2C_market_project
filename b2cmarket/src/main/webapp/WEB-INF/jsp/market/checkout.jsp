<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Main Container  -->
<div class="main-container container">
	<ul class="breadcrumb">
		<li><a href="#"><i class="fa fa-home"></i></a></li>
		<li><a href="#">Checkout</a></li>

	</ul>

	<div class="row">
		<!--Middle Part Start-->
		<div id="content" class="col-sm-12">
			<h2 class="title">Checkout</h2>
			<div class="so-onepagecheckout row">
				<div class="col-left col-sm-3">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<i class="fa fa-book"></i> Your Address
							</h4>
						</div>
						<div class="panel-body">
							<select class="form-control" id="select-order-adress-id">
								<c:if test="${!empty addressMycountList}">
									<option value="">--- Please Select ---</option>
									<c:forEach items="${addressMycountList}" var="address">
										<c:if test="${address.activeFlag==1}">
											<option value="${address.rowId}">收货电话：${address.addressPhone}详细地址：${address.addressDetail}</option>
										</c:if>
									</c:forEach>
								</c:if>
								<c:if test="${empty addressMycountList}">
									<option value="">--- No Data ---</option>
								</c:if>
							</select>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<i class="fa fa-book"></i> Hot Topic
							</h4>
						</div>
						<div class="panel-body">
							<img src="image/catalog/banners/id3-bn4.jpg" alt="image">
						</div>
					</div>

				</div>
				<div class="col-right col-sm-9">
					<div class="row">
						<div class="col-sm-12">
							<div class="panel panel-default no-padding">
								<div class="col-sm-6 checkout-shipping-methods">
									<div class="panel-heading">
										<h4 class="panel-title">
											<i class="fa fa-truck"></i> Delivery Method
										</h4>
									</div>
									<div class="panel-body ">
										<p>Please select the preferred shipping method to use on this order.</p>
										<div class="radio">
											<label> <input type="radio" checked="checked" name="Free Shipping"> Free Shipping - $0.00
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="Flat Shipping Rate"> Flat Shipping Rate - $7.50
											</label>
										</div>

									</div>
								</div>
								<div class="col-sm-6  checkout-payment-methods">
									<div class="panel-heading">
										<h4 class="panel-title">
											<i class="fa fa-credit-card"></i> Payment Method
										</h4>
									</div>
									<div class="panel-body">
										<p>Please select the preferred payment method to use on this order.</p>
										<div class="radio">
											<label> <input type="radio" checked="checked" value="1" name="orderPayMethod" id="orderPayMethodCash">Cash On Delivery
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" value="2" name="orderPayMethod" id="orderPayMethodWeChat">WeChat
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" value="3" name="orderPayMethod" id="orderPayMethodAliPay">AliPay
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" value="4" name="orderPayMethod" id="orderPayMethodCreditCard">Credit Card 
											</label>
										</div>
									</div>
								</div>
							</div>



						</div>

						<div class="col-sm-12">
							<div id="content" class="col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<i class="fa fa-shopping-cart"></i> Shopping cart
										</h4>
									</div>
									<div class="panel-body">
										<div class="table-responsive">
											<table class="table table-bordered">
												<thead>
													<tr>
														<td class="text-center">Image</td>
														<td class="text-left">Product Name</td>
														<td class="text-left">Model</td>
														<td class="text-left">Quantity</td>
														<td class="text-right">Unit Price</td>
														<td class="text-right">Total</td>
													</tr>
												</thead>
												<tbody>
													<c:if test="${!empty cartCommodityMap}">
														<c:forEach items="${cartCommodityMap}" var="cartCommodity">
															<%-- key=${cartCommodity.key},value=${cartCommodity.value} --%>
															<tr>
																<td class="text-center"><a href="product"><img width="70px" src="${cartCommodity.value.commodityPhoto}" alt="Aspire Ultrabook Laptop" title="Aspire Ultrabook Laptop" class="img-thumbnail" /></a></td>
																<td class="text-left"><a href="product">${cartCommodity.value.commodityName}</a><br /></td>
																<td class="text-left">${cartCommodity.value.commodityInfo}</td>
																<td class="text-left" width="200px"><div class="input-group btn-block quantity">
																		<input type="text" name="quantity" value="${cartCommodity.key.commodityCount}" size="1" class="form-control" data-href="cart/edit/${cartCommodity.value.rowId}/${userId}/${cartCommodity.value.commodityPrice}" id="input-commodityCount-id" /> <span class="input-group-btn">
																			<button type="button" data-toggle="tooltip" title="Remove" class="btn btn-danger" data-href="cart/delete/${cartCommodity.value.rowId}/${userId}/${cartCommodity.value.commodityPrice}" id="btn-submit-delete-id">
																				<i class="fa fa-times-circle"></i>
																			</button>

																		</span>
																	</div></td>
																<td class="text-right">$ ${cartCommodity.value.commodityPrice}</td>
																<td class="text-right">$ ${cartCommodity.value.commodityPrice*cartCommodity.key.commodityCount}</td>
															</tr>
														</c:forEach>
														<br>
													</c:if>
													<c:if test="${empty cartCommodityMap}">
														<h1 style="color: red;">暂无数据</h1>
													</c:if>
												</tbody>
											</table>
										</div>
										<div class="row">
											<div class="col-sm-4 col-sm-offset-8">
												<table class="table table-bordered">
													<tbody>
														<tr>
															<td class="text-right"><strong>Total:</strong></td>
															<td class="text-right">$ <span  id="cartPriceSumId">${cartPriceSum}</span></td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-12">

							<div class="buttons">
								<div class="pull-right">
									<input type="button" class="btn btn-primary" id="button-confirm" value="Confirm Order">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--Middle Part End -->

	</div>
</div>
<!-- //Main Container -->
<script type="text/javascript">
$(document).ready(function(){
	$('#button-confirm').off('click').on('click',function(){
		console.log('111');
		console.log($('#select-order-adress-id').val());
		console.log($('input:radio[name="orderPayMethod"]:checked').val());
		console.log($('#cartPriceSumId').html());
		$.ajax({
			url:'order/add',
			type:'post',
			data:{priceSum:$('#cartPriceSumId').html(),addressId:$('#select-order-adress-id').val(),orderPayMethod:$('input:radio[name="orderPayMethod"]:checked').val()},
			success:function(data){
				/* if(data){
					$('#marketMainContainerId').html(data);
				} */
				console.log($('#userLoginRowId').val());
				$.ajax({
					url:'myAccount',
					type:'get',
					data:{rowId:$('#userLoginRowId').val()},
					success:function(data){
						if(data){
							$('#marketMainContainerId').html(data);
						}
					}
				});
			}
		});
		return false;
	});
});
</script>
