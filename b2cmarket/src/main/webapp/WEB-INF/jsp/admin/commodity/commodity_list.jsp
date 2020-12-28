<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:if test="${!empty commodityList}">
	<c:forEach items="${commodityList}" var="commodity">
		<c:if test="${commodity.activeFlag==1}">
			<tr>
				<td>${commodity.catalogueId}</td>
				<td>${commodity.commodityName}</td>
				<td>${commodity.commodityCode}</td>
				<td><img alt="" src="${commodity.commodityPhoto}" style="width: 30px;height: 30px"> </td>
				<td>${commodity.commodityPrice}</td>
				<td>${commodity.commodityStockCount}</td>
				<td>${commodity.commodityUpDownState==0?"下架":"上架"}</td>
				<td>${commodity.commodityInfo}</td>
				<td>
				<a href="commodity/edit/${commodity.rowId}" id="btn-edit">修改</a>
				<a href="commodity/delete/${commodity.rowId}" id="btn-delete">删除</a></td>
			</tr>
		</c:if>
	</c:forEach>
</c:if>
<c:if test="${empty commodityList}">
<h1 style="color: red;">暂无数据</h1>
</c:if>