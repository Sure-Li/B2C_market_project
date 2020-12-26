<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form id="form_edit">
	  订单编号：<font>${order.orderCode}</font> <br>
	  用户ID：<font>${order.userId}</font><br>
	  <input type="hidden" name="rowId" value="${order.rowId}">
	   订单状态：<select name="orderState">
		<!--  订单状态 1:待付款;2:待发货;3:待收货;4:待评价;5:订单完成; -->
		<option value="1" ${order.orderState==1?"selected":""}>待付款</option>
		<option value="2" ${order.orderState==2?"selected":""}>待发货</option>
		<option value="3" ${order.orderState==3?"selected":""}>待收货</option>
		<option value="4" ${order.orderState==4?"selected":""}>待评价</option>
		<option value="5" ${order.orderState==5?"selected":""}>订单完成</option>
	</select><br>

	<!--  支付方式 1：到付 2：微信 3：支付宝 4：信用卡 -->
	支付方式：<select name="orderPayMethod">
		<option value="1" ${order.orderPayMethod==1?"selected":""}>到付</option>
		<option value="2" ${order.orderPayMethod==2?"selected":""}>微信</option>
		<option value="3" ${order.orderPayMethod==3?"selected":""}>支付宝</option>
		<option value="4" ${order.orderPayMethod==4?"selected":""}>信用卡</option>
	</select><br>
	  地址ID：<input name="addressId" value="${order.addressId}"><br>
	  <input type="button" id="btn-edit-submit" value="提交"> 
	  <input type="reset"> 
</form>