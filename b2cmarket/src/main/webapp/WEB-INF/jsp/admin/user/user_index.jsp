<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 多条件查询  -->
<form id="searchForm">
<input type="hidden" id="urlHidden" value="user">
<select name="isLock">
<option value="">用户状态</option>
<option value="1">锁定</option>
<option value="0">未锁定</option>
</select>
<select name="userType">
<option value="">用户类型</option>
<option value="1">卖家</option>
<option value="0">买家</option>
</select>
<input name="userName"  placeholder="用户名称">
<input name="userCode" placeholder="用户账号">
<input type="button" value="查询" id="btn_search">
<input type="reset" >
</form>
<a href="javaScript:;" style="float: right;" id="btn-add">新增</a>
<table>
		<tr>
			<th>用户类型</th>
			<th>用户名称</th>
			<th>登录账号</th>
			<th>最后登录信息</th> 
			<th>账户状态</th> 
			<th>操作</th>
		</tr>
		<tbody id="tbody_container"></tbody>
</table>
<script type="text/javascript" src="js/page/admin/base.js"></script>