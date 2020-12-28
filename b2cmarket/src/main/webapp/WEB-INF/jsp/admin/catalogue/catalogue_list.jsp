<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:if test="${!empty catalogueList}">
	<table id="test" >
		<tr>
			<th>父标签ID</th>
			<th>目录名称</th>
			<th>商品数量</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${catalogueList}" var="catalogue">
			<c:if test="${catalogue.activeFlag==1}">

				<tr data-tt-id="${catalogue.rowId}" data-tt-parent-id="${catalogue.parentId}">
					<td>${catalogue.parentId}</td>
					<td>${catalogue.catalogueName}</td>
					<td>${catalogue.commodityCount}</td>
					<td><a href="catalogue/edit/${catalogue.rowId}" id="btn-edit">修改</a> <a href="catalogue/delete/${catalogue.rowId}" id="btn-delete">删除</a></td>
				</tr>

			</c:if>
		</c:forEach>
	</table>
</c:if>
<c:if test="${empty catalogueList}">
	<h1 style="color: red;">暂无数据</h1>
</c:if>
<script type="text/javascript">
	$(document).ready(function() {
		$("#test").treetable({
			expandable : true,
		});
	});
</script>