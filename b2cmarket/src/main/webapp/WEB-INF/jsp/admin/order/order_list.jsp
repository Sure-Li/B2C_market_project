<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:if test="${!empty orderList}">
	<c:forEach items="${orderList}" var="order">
		<c:if test="${order.activeFlag==1}">
			<tr>
				<td>${order.orderCode}</td>
				<td>${order.userId}</td>
				<td>${order.priceSum}</td>
				<td>${order.addressId}</td>
				<td>${order.orderState}</td>
				<td>${order.orderPayMethod}</td>
				<td>
				<a href="order/edit/${order.rowId}" id="btn-edit">修改</a>
				<a href="order/delete/${order.rowId}" id="btn-delete">删除</a></td>
			</tr>
		</c:if>
	</c:forEach>
</c:if>
<c:if test="${empty orderList}">
<h1 style="color: red;">暂无数据</h1>
</c:if>