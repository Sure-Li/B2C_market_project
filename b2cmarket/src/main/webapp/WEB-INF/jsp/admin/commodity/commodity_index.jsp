<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 多条件查询  -->
<form id="searchForm">
<input type="hidden" id="urlHidden" value="commodity">
<select name="commodityUpDownState">
<option value="">商品上下架状态</option>
<option value="1">上架</option>
<option value="0">下架</option>
</select>
<input name="catalogueId"  placeholder="目录ID">
<input name="commodityCode"  placeholder="商品编号">
<input name="commodityName"  placeholder="商品名称">
<input name="commodityPrice"  placeholder="商品价格">
<input name="commodityStockCount" placeholder="商品库存数量">
<input type="button" value="查询" id="btn_search">
<input type="reset" >
</form>
<a href="javaScript:;" style="float: right;" id="btn-add">新增</a>
<table>
		<tr>
			<th>目录ID</th>
			<th>商品名称</th>
			<th>商品编号</th>
			<th>商品图片</th> 
			<th>商品价格</th>
			<th>商品库存数量</th> 
			<th>商品上下架状态</th>
			<th>商品介绍</th>  
			<th>操作</th>
		</tr>
		<tbody id="tbody_container"></tbody>
</table>
<script type="text/javascript" src="js/page/admin/base.js"></script>