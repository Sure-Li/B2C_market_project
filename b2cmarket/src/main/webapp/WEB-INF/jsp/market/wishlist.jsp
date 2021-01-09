<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Main Container  -->
<div class="main-container container">
	<ul class="breadcrumb">
		<li><a href="#"><i class="fa fa-home"></i></a></li>
		<li><a href="#">Account</a></li>
		<li><a href="#">My Wish List</a></li>
	</ul>

	<div class="row">
		<!--Middle Part Start-->
		<div id="content" class="col-sm-9">
			<h2 class="title">My Wish List</h2>
			<div class="table-responsive">
				<table class="table table-bordered table-hover">


					<c:if test="${!empty commodityList}">
						<thead>
							<tr>
								<td class="text-center">Image</td>
								<td class="text-left">Product Name</td>
								<td class="text-left">Product Info</td>
								<td class="text-right">Stock</td>
								<td class="text-right">Unit Price</td>
								<td class="text-right">Action</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${commodityList}" var="Commodity">
								<tr>
									<td class="text-center"><a href="product.html"><img width="70px" src="${Commodity.commodityPhoto}" alt="Aspire Ultrabook Laptop" title="Aspire Ultrabook Laptop"> </a></td>
									<td class="text-left"><a href="product.html">${Commodity.commodityName}</a></td>
									<td class="text-left">${Commodity.commodityInfo}</td>
									<td class="text-right">In Stock</td>
									<td class="text-right">
										<div class="price">
											<span class="price-new">$ ${Commodity.commodityPrice}</span> <span class="price-old">$80</span>
										</div>

									</td>
									<td class="text-right">
										<button class="btn btn-primary" title="add to cart" data-rowId="${Commodity.rowId}" id="btn-add-cart-id" data-toggle="tooltip" onclick="cart.add('48');" type="button" data-original-title="Add to Cart">
											<i class="fa fa-shopping-cart"></i>
										</button> <a class="btn btn-danger" title="delete from wishlist" data-rowId="${Commodity.rowId}" id="btn-del-wishlist-id" data-toggle="tooltip" href="" data-original-title="Remove"><i class="fa fa-times"></i></a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</c:if>
					<c:if test="${empty commodityList}">
						<h1 style="color: red;">暂无数据</h1>
					</c:if>



				</table>
			</div>
		</div>

		<!--Middle Part End-->
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
	</div>
</div>
<!-- //Main Container -->
<script type="text/javascript">
	$(document).ready(
			function() {
				$(document).off('click', '#btn-add-cart-id').on('click',
						'#btn-add-cart-id', function() {
							var rowId = $(this).attr('data-rowId');
							$.ajax({
								url : 'cart/add',
								type : 'post',
								data : {
									rowId : rowId
								},
								success : function(data) {
									if (data) {
										console.log(data);
									}
								}

							});
							return false;
						});
				$(document).off('click', '#btn-del-wishlist-id').on('click',
						'#btn-del-wishlist-id', function() {
							var rowId = $(this).attr('data-rowId');
							$.ajax({
								url : 'wishlist/delete',
								type : 'post',
								data : {
									rowId : rowId
								},
								success : function(data) {
									if (data) {
										initWishList();
									}
								}

							});
							return false;
						});
				function initWishList() {
					$.ajax({
						url : 'wishlist',
						type : 'get',
						success : function(data) {
							if (data) {
								$('#marketMainContainerId').html(data);
							}
						}
					});
				}
			});
</script>
