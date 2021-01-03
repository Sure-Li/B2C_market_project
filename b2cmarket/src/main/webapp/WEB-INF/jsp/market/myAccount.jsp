<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- Main Container  -->
<div class="main-container container">
	<ul class="breadcrumb">
		<li><a href="#"><i class="fa fa-home"></i></a></li>
		<li><a href="#">Account</a></li>
		<li><a href="#">My Account</a></li>
	</ul>

	<div class="row">
		<!--Middle Part Start-->
		<div class="col-sm-9" id="content">
			<h2 class="title">My Account</h2>
			<p class="lead">
				<!-- Hello, <strong>Jhone Cary!</strong> -  -->
				To update your account information.
			</p>
			<form>
				<div class="row">
					<div class="col-sm-6">
						<fieldset id="personal-details">
							<legend>Personal Details</legend>
							<div class="form-group required">
								<label for="input-firstname" class="control-label">User Type</label> <br>${userMyCount.userType==0?"买家":"卖家"}
							</div>
							<div class="form-group required">
								<label for="input-lastname" class="control-label">User Name</label> <br>${userMyCount.userName}
							</div>
							<div class="form-group required">
								<label for="input-email" class="control-label">User Code</label> <br>${userMyCount.userCode}
							</div>
							<div class="form-group required">
								<label for="input-telephone" class="control-label">User LastLoginIp</label> <br>${userMyCount.lastLoginIp}
							</div>
							<div class="form-group required">
								<label for="input-telephone" class="control-label">User LastLoginDate</label> <br>
								<fmt:formatDate value="${userMyCount.lastLoginDate}" pattern="yyyy-MM-dd HH:mm:ss" />
							</div>
							<div class="form-group">
								<label for="input-fax" class="control-label">Is Lock</label> <br>${userMyCount.isLock==1?"锁定":"正常"}
							</div>
						</fieldset>
						<br>
					</div>
					<div class="col-sm-6">
						<fieldset id="personal-details">
							<legend>
								Address Manage&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javaScript:;" id="addAddressId">Add Address</a>
							</legend>
							<c:if test="${!empty addressMycountList}">
								<c:forEach items="${addressMycountList}" var="address">
									<c:if test="${address.activeFlag==1}">
										<div class="form-group required">
										收货电话：${address.addressPhone}
											详细地址：${address.addressDetail}
											<a href="user/edit/${address.rowId}" id="btn-edit">修改</a> <a href="user/delete/${address.rowId}" id="btn-delete">删除</a>
											${address.addressIsDefault==1?"<font style='color: red;'>默认地址<font/>":""}
										</div>
											
									</c:if>
								</c:forEach>
							</c:if>
							<c:if test="${empty addressMycountList}">
								<h1 style="color: red;">暂无数据</h1>
							</c:if>
						</fieldset>
						<br>
					</div>
				</div>

				<!-- <div class="buttons clearfix">
					<div class="pull-right">
						<input type="submit" class="btn btn-md btn-primary" value="Save Changes">
					</div>
				</div> -->
			</form>
		</div>
		<!--Middle Part End-->
		<!--Right Part Start -->
		<aside class="col-sm-3 hidden-xs content-aside col-md-3" id="column-right">
			<h2 class="subtitle">Account</h2>
			<div class="list-group">
				<ul class="list-item">
					<li><a href="login.html">Login</a></li>
					<li><a href="register.html">Register</a></li>
					<li><a href="#">Forgotten Password</a></li>
					<li><a href="#">My Account</a></li>
					<li><a href="#">Address Books</a></li>
					<li><a href="wishlist.html">Wish List</a></li>
					<li><a href="#">Order History</a></li>
					<li><a href="#">Downloads</a></li>
					<li><a href="#">Reward Points</a></li>
					<li><a href="#">Returns</a></li>
					<li><a href="#">Transactions</a></li>
					<li><a href="#">Newsletter</a></li>
					<li><a href="#">Recurring payments</a></li>
				</ul>
			</div>
		</aside>
		<!--Right Part End -->
	</div>
</div>
<!-- //Main Container -->