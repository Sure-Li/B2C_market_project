<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form  id="${catalogue.rowId==null?'form_add':'form_edit'}" action="" method="get">
<!-- 隐藏域 用于存放rowid 通过rowid的有无来判断是新增还是修改 -->
<input type="hidden" name="rowId" value="${catalogue.rowId}">
<input type="hidden" name="parentId" id="catalogueParentId" value="">
父标签ID：
<c:if test="${!empty getListByParent}">
		<select  id="chooseParentId">
		<option value="-2">请选择父标签ID</option>
		<c:forEach items="${getListByParent}" var="catalogue">
			<c:if test="${catalogue.activeFlag==1}">
			<option value="${catalogue.rowId}">${catalogue.catalogueName}</option>
			</c:if>
		</c:forEach>
	</select>
	<span class="childContainer">
	</span>
</c:if><br>
目录名称：<input name="catalogueName" value="${catalogue.catalogueName}"><br>
商品数量：<input type="number" name="commodityCount" value="${catalogue.commodityCount}"><br>
<input type="button" id="${catalogue.rowId==null?'btn-add-submit':'btn-edit-submit'}" value="提交">
<input type="reset" id="catalogueAddResetId">
</form>
<!--  -->

