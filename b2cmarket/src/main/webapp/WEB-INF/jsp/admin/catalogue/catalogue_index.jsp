<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 多条件查询  -->
<form id="searchForm">
<input type="hidden" id="urlHidden" value="catalogue">
<input name="parentId"  placeholder="父标签ID">
<input name="catalogueName"  placeholder="目录名称">
<input name="commodityCount"  placeholder="商品数量">
<input type="button" value="查询" id="btn_search">
<input type="reset" >
</form>
<a href="javaScript:;" style="float: right;" id="btn-add">新增</a>
<table>
		<tr>
			<th>父标签ID</th>
			<th>目录名称</th>
			<th>商品数量</th>
			<th>操作</th>
		</tr>
		<tbody id="tbody_container"></tbody>
</table>
<script type="text/javascript" src="js/page/admin/base.js"></script>