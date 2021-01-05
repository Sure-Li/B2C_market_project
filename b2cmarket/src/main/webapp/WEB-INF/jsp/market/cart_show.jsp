<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<li>
	<table class="table table-striped">
		<tbody>
			<c:if test="${!empty sessionScope.userCartMap}">
				<c:forEach items="${sessionScope.userCartMap}" var="cartCommodity">
					<%-- key=${cartCommodity.key},value=${cartCommodity.value} --%>
					<%-- <tr>
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
													</tr> --%>
					<tr>
						<td class="text-center" style="width: 70px"><a href="product"> <img src="${cartCommodity.value.commodityPhoto}" style="width: 70px" alt="Yutculpa ullamcon" title="Yutculpa ullamco" class="preview">
						</a></td>
						<td class="text-left"><a class="cart_product_name" href="product">${cartCommodity.value.commodityName}</a></td>
						<td class="text-center">x ${cartCommodity.key.commodityCount}</td>
						<td class="text-center">$ ${cartCommodity.value.commodityPrice}</td>
						<!-- <td class="text-right"><a href="product" class="fa fa-edit"></a></td>
														<td class="text-right"><a onclick="cart.remove('2');" class="fa fa-times fa-delete"></a></td> -->
					</tr>
				</c:forEach>
				<br>
			</c:if>
			<c:if test="${empty sessionScope.userCartMap}">
				<h1 style="color: red;">暂无数据</h1>
			</c:if>

		</tbody>
	</table>
</li>
<li>
	<div>
		<table class="table table-bordered">
			<tbody>
				<tr>
					<td class="text-left"><strong>Total</strong></td>
					<td class="text-right">$ ${sessionScope.userCartPriceSum}</td>
				</tr>
			</tbody>
		</table>
		<p class="text-right">
			<a class="btn view-cart" href="cart" id="btn-view-cart-id"><i class="fa fa-shopping-cart"></i>View Cart</a>&nbsp;&nbsp;&nbsp; <a class="btn btn-mega checkout-cart" href="checkout" id="btn-checkout-id"><i class="fa fa-share"></i>Checkout</a>
		</p>
	</div>
</li>