<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 多条件查询  -->
<form id="searchForm">
	<input type="hidden" id="urlHidden" value="order">
	<select name="orderState">
		<!--  订单状态 1:待付款;2:待发货;3:待收货;4:待评价;5:订单完成; -->
		<option value="">订单状态</option>
		<option value="1">待付款</option>
		<option value="2">待发货</option>
		<option value="3">待收货</option>
		<option value="4">待评价</option>
		<option value="5">订单完成</option>
	</select>

	<!--  支付方式 1：到付 2：微信 3：支付宝 4：信用卡 -->
	<select name="userType">
		<option value="">支付方式</option>
		<option value="1">到付</option>
		<option value="2">微信</option>
		<option value="3">支付宝</option>
		<option value="4">信用卡</option>
	</select> <input name="orderCode" placeholder="订单编号"> <input name="userId" placeholder="用户id"> <input name="addressId" placeholder="地址id"> <input type="button" value="查询" id="btn_search"> <input type="reset">
</form>
<a href="javaScript:;" style="float: right;" id="btn-add">新增</a>
<table>
	<tr>
		
		<th>订单编号</th>
		<th>用户名</th>
		<th>总价格</th>
		<th>收货地址</th>
		<th>订单状态</th>
		<th>支付方式</th>
	</tr>
	<tbody id="tbody_container"></tbody>
</table>
<script type="text/javascript" src="js/page/admin/base.js"></script>