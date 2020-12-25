<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form  id="form_user" action="" method="get">
用户类型：<select name="userType">
<option value="0">买家</option>
<option value="1">卖家</option>
</select><br>
用户名称：<input name="userName" value="${user.userName}"><br>
登录账号：<input name="userCode" value="${user.userCode}"><br>
登录密码：<input type="password" name="userPassword"><br>
<input type="hidden" name="userAvatar">
<input type="file" id="userFile"><br>
<input type="submit" id="btn_userSubmit" value="提交">
<input type="reset">
</form>