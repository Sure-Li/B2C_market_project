<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form  id="${commodity.rowId==null?'form_add':'form_edit'}" action="" method="get">
<!-- 隐藏域 用于存放rowid 通过rowid的有无来判断是新增还是修改 -->
<input type="hidden" value="${commodity.rowId}">
目录ID：<select name="catalogueId">
<option>需要自动生成</option>
<option value="0">电脑</option>
<option value="1">test</option>
</select><br>
商品名称：<input name="commodityName" value="${commodity.commodityName}"><br>
商品码：<input name="commodityCode" value="${commodity.commodityCode}"><br>
商品图片：<input type="file"  id="uploadFile">预留后期添加<br>
商品价格：<input type="number" name="commodityPrice" value="${commodity.commodityPrice}"><br>
商品库存数量：<input type="number" name="commodityStockCount" value="${commodity.commodityStockCount}"><br>
商品上下架状态：<select name="commodityUpDownState">
<option value="1" ${commodity.commodityUpDownState==1?"selected":"" }>上架</option>
<option value="0" ${commodity.commodityUpDownState==0?"selected":"" }>下架</option>
</select><br>
商品简介：<input type="text" name="commodityInfo" value="${commodity.commodityInfo}"><br>
<input type="hidden" name="commodityPhoto" value="${commodity.commodityPhoto}">
<input type="button" id="${commodity.rowId==null?'btn-add-submit':'btn-edit-submit'}" value="提交">
<input type="reset">
</form>
