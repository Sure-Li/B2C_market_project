<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form  id="form_edit" >
<input type="hidden" name="rowId" value="${user.rowId}">
登录账号：<font>${user.userCode}</font><br>
用户名称：<input name="userName" value="${user.userName}"><br>
登录密码：<input type="password" name="userPassword" placeholder="请输入新密码"><br>
修改头像：<input type="file" id="userFile"><br>
		<input type="hidden" name="avatar">
<br>
修改用户状态：
<select name="isLock">
	<option value="0" ${user.isLock==0?"selected":""}>未锁定</option>
	<option value="1" ${user.isLock==1?"selected":""}>锁定</option>
</select>
<br>
<input type="button" id="btn-edit-submit" value="提交">
<input type="reset">
</form>