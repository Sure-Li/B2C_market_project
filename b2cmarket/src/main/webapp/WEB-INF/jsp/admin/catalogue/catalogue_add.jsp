<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form  id="${catalogue.rowId==null?'form_add':'form_edit'}" action="" method="get">
<!-- 隐藏域 用于存放rowid 通过rowid的有无来判断是新增还是修改 -->
<input type="hidden" name="rowId" value="${catalogue.rowId}">
父标签ID：<input name="parentId" value="${catalogue.parentId}"><br>
目录名称：<input name="catalogueName" value="${catalogue.catalogueName}"><br>
商品数量：<input type="number" name="commodityCount" value="${catalogue.commodityCount}"><br>
<input type="button" id="${catalogue.rowId==null?'btn-add-submit':'btn-edit-submit'}" value="提交">
<input type="reset">
</form>
