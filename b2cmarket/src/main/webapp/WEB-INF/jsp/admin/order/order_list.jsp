<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${!empty orderList}">
	<c:forEach items="${orderList}" var="order">
			<tr>
				<td>${order.orderCode}</td>
				<td>${order.userId}</td>
				<td>${order.priceSum}</td>
				<td>${order.addressId}</td>
				<td><c:if test="${order.orderState==1}">
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
				<td>${order.orderPayMethod}</td>
				<td>
					<c:if test="${order.orderState==2}">
					<a href="order/delivergoods/${order.rowId}" id="btn-order-delivergoods">发货</a>
					</c:if>
				<a href="order/edit/${order.rowId}" id="btn-edit">修改</a>
				<a href="order/delete/${order.rowId}" id="btn-delete">删除</a>
				</td>
			</tr>
	</c:forEach>
</c:if>
<%-- <input type="hidden" value="${orderList}" id="order-data-count-data-id"> --%>
<c:if test="${empty orderList}">
<h1 style="color: red;">暂无数据</h1>
</c:if>
<script type="text/javascript">
$(document).ready(function(){
	
	$(document).off('click','#btn-order-delivergoods').on('click','#btn-order-delivergoods',function(){
		console.log($(this).attr('href'));
		$.ajax({
			type : 'post',
			url : $(this).attr('href'),
			success : function(data) {
				console.log(data);
				if (data) {
					initListData();
				}
			}
		});
		return false;
	});
	function initListData(){
		$.ajax({
			url:$('#urlHidden').val()+'/list',
			type:'get',
			dataType:'html',
			data:$('#searchForm').serialize(),//将多条件查询表单
			success:function(data){
				$('#tbody_container').html(data);
			}
		});
	}
	
	
});
</script>