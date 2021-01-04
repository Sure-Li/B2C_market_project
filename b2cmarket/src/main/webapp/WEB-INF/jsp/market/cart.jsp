<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Main Container  -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="main-container container">
	<ul class="breadcrumb">
		<li><a href="#"><i class="fa fa-home"></i></a></li>
		<li><a href="#">Shopping Cart</a></li>
	</ul>

	<div class="row">
		<!--Middle Part Start-->
		<div id="content" class="col-sm-12">
			<h2 class="title">Shopping Cart${cartCommodityMap}</h2>
			<div class="table-responsive form-group">
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
											<input type="text" name="quantity" value="${cartCommodity.key}" size="1" class="form-control" /> <span class="input-group-btn">
												<button type="submit" data-toggle="tooltip" title="Update" class="btn btn-primary">
													<i class="fa fa-clone"></i>
												</button>
												<button type="button" data-toggle="tooltip" title="Remove" class="btn btn-danger" onClick="">
													<i class="fa fa-times-circle"></i>
												</button>
											</span>
										</div></td>
									<td class="text-right">$ ${cartCommodity.value.commodityPrice}</td>
									<td class="text-right">$ ${cartCommodity.value.commodityPrice*cartCommodity.key}</td>
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
								<td class="text-right"><strong>Sub-Total:</strong></td>
								<td class="text-right">$168.71</td>
							</tr>
							<tr>
								<td class="text-right"><strong>Flat Shipping Rate:</strong></td>
								<td class="text-right">$4.69</td>
							</tr>
							<tr>
								<td class="text-right"><strong>Eco Tax (-2.00):</strong></td>
								<td class="text-right">$5.62</td>
							</tr>
							<tr>
								<td class="text-right"><strong>VAT (20%):</strong></td>
								<td class="text-right">$34.68</td>
							</tr>
							<tr>
								<td class="text-right"><strong>Total:</strong></td>
								<td class="text-right">$213.70</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>

			<div class="buttons">
				<div class="pull-left">
					<a href="index" class="btn btn-primary">Continue Shopping</a>
				</div>
				<div class="pull-right">
					<a href="checkout" class="btn btn-primary">Checkout</a>
				</div>
			</div>
		</div>
		<!--Middle Part End -->

	</div>
</div>
<!-- //Main Container -->
