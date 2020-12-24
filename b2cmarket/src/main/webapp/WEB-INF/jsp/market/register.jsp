<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>

<!-- Basic page needs
    ============================================ -->
<title>SuperMarket - Multipurpose Responsive HTML5 Template</title>
<meta charset="utf-8">
<meta name="keywords" content="html5 template, best html5 template, best html template, html5 basic template, multipurpose html5 template, multipurpose html template, creative html templates, creative html5 templates" />
<meta name="description" content="SuperMarket is a powerful Multi-purpose HTML5 Template with clean and user friendly design. It is definite a great starter for any eCommerce web project." />
<meta name="author" content="Magentech">
<meta name="robots" content="index, follow" />

<!-- Mobile specific metas
    ============================================ -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- Favicon
    ============================================ -->
<link rel="shortcut icon" type="image/png" href="ico/favicon-16x16.png" />


<!-- Libs CSS
    ============================================ -->
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link href="css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="js/datetimepicker/bootstrap-datetimepicker.min.css" rel="stylesheet">
<link href="js/owl-carousel/owl.carousel.css" rel="stylesheet">
<link href="css/themecss/lib.css" rel="stylesheet">
<link href="js/jquery-ui/jquery-ui.min.css" rel="stylesheet">
<link href="js/minicolors/miniColors.css" rel="stylesheet">
<link href="css/bootstrapValidator/bootstrapValidator.css" rel="stylesheet">

<!-- Theme CSS
    ============================================ -->
<link href="css/themecss/so_searchpro.css" rel="stylesheet">
<link href="css/themecss/so_megamenu.css" rel="stylesheet">
<link href="css/themecss/so-categories.css" rel="stylesheet">
<link href="css/themecss/so-listing-tabs.css" rel="stylesheet">
<link href="css/themecss/so-category-slider.css" rel="stylesheet">
<link href="css/themecss/so-newletter-popup.css" rel="stylesheet">

<link href="css/footer/footer1.css" rel="stylesheet">
<link href="css/header/header1.css" rel="stylesheet">
<link id="color_scheme" href="css/theme.css" rel="stylesheet">
<link href="css/responsive.css" rel="stylesheet">

<!-- Google web fonts
    ============================================ -->
<link href='https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700' rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	font-family: 'Poppins', sans-serif;
}
</style>

</head>

<body class="res layout-1 layout-subpage">


	<div id="wrapper" class="wrapper-fluid banners-effect-5">


		<%@include file="header.jsp"%>

		<!-- Main Container  -->
		<div class="main-container container">
			<ul class="breadcrumb">
				<li><a href="#"><i class="fa fa-home"></i></a></li>
				<li><a href="#">Account</a></li>
				<li><a href="#">Register</a></li>
			</ul>

			<div class="row">
				<div id="content" class="col-sm-12">
					<h2 class="title">Register Account</h2>
					<p>
						If you already have an account with us, please login at the <a href="login">login page</a>.
					</p>
					<!-- enctype="multipart/form-data" -->
					<form action="user/doRegister" id="userRegisterForm" method="post" class="form-horizontal account-register clearfix">
						<fieldset id="account">
							<legend>Your Personal Details</legend>
							<div class="form-group required" style="display: none;">
								<label class="col-sm-2 control-label">Customer Group</label>
								<div class="col-sm-10">
									<div class="radio">
										<label> <input type="radio" name="customer_group_id" value="1" checked="checked"> Default
										</label>
									</div>
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-firstname">User Name</label>
								<div class="col-sm-10">
									<input type="text" name="userName" value="" placeholder="userName" id="input-userName" class="form-control">
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-email">User Code</label>
								<div class="col-sm-10">
									<input type="text" name="userCode" value="" placeholder="User Code" id="input-userCode" class="form-control">
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-telephone">User Phone</label>
								<div class="col-sm-10">
									<input type="tel" name="userPhone" value="" placeholder="User Phone" id="input-userPhone" class="form-control">
								</div>
							</div>
						</fieldset>
						<fieldset id="address">
							<legend>Your Address</legend>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-country">Province</label>
								<div class="col-sm-10">
									<select name="addressProvinceCode" id="input-addressProviceCode" class="form-control">
										<option value="">--- Please Select ---</option>
										<option value="244">Aaland Islands</option>
										<option value="1">Afghanistan</option>
										<option value="2">Albania</option>
										<option value="3">Algeria</option>
										<option value="4">American Samoa</option>
										<option value="5">Andorra</option>
										<option value="6">Angola</option>
									</select>
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-country">City</label>
								<div class="col-sm-10">
									<select name="addressCityCode" id="input-addressCityCode" class="form-control">
										<option value="">--- Please Select ---</option>
										<option value="244">Aaland Islands</option>
										<option value="1">Afghanistan</option>
										<option value="2">Albania</option>
										<option value="3">Algeria</option>
										<option value="4">American Samoa</option>
										<option value="5">Andorra</option>
										<option value="6">Angola</option>
									</select>
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-zone">Region</label>
								<div class="col-sm-10">
									<select name="addressReginCode" id="input-addressReginCode" class="form-control">
										<option value="">--- Please Select ---</option>
										<option value="3513">Aberdeen</option>
										<option value="3514">Aberdeenshire</option>
										<option value="3515">Anglesey</option>
										<option value="3516">Angus</option>
									</select>
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-city">Address Detail</label>
								<div class="col-sm-10">
									<input type="text" name="addressDetail" value="" placeholder="Address Detail" id="input-addressDetail" class="form-control">
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-postcode">Post Code</label>
								<div class="col-sm-10">
									<input type="text" name="postcode" value="" placeholder="Post Code" id="input-postcode" class="form-control">
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-postcode">Phone</label>
								<div class="col-sm-10">
									<input type="text" name="addressPhone" value="" placeholder="Phone" id="input-postcode" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">Is Default Address</label>
								<div class="col-sm-10">
									<label class="radio-inline"> <input type="radio" name="addressIsDefault" value="1"> Yes
									</label> <label class="radio-inline"> <input type="radio" name="addressIsDefault" value="0" checked="checked"> No
									</label>
								</div>
							</div>

						</fieldset>
						<fieldset>
							<legend>Your Password</legend>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-password">Password</label>
								<div class="col-sm-10">
									<input type="password" name="userPassword" value="" placeholder="Password" id="input-password" class="form-control">
								</div>
							</div>
							<div class="form-group required">
								<label class="col-sm-2 control-label" for="input-confirm">Password Confirm</label>
								<div class="col-sm-10">
									<input type="password" value="" placeholder="Password Confirm" id="input-confirm" class="form-control">
								</div>
							</div>
						</fieldset>
						<div class="buttons">
							<div class="pull-right">
								I have read and agree to the <a href="#" class="agree"><b>Pricing Tables</b></a> <input class="box-checkbox" type="checkbox" name="agree" value="1"> &nbsp; <input type="submit" id="userRegisterSubmitId" value="Continue" class="btn btn-primary">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- //Main Container -->


		<%@include file="footer.jsp"%>

	</div>



	<!-- Include Libs & Plugins
	============================================ -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/owl-carousel/owl.carousel.js"></script>
	<script type="text/javascript" src="js/slick-slider/slick.js"></script>
	<script type="text/javascript" src="js/themejs/libs.js"></script>
	<script type="text/javascript" src="js/unveil/jquery.unveil.js"></script>
	<script type="text/javascript" src="js/countdown/jquery.countdown.min.js"></script>
	<script type="text/javascript" src="js/dcjqaccordion/jquery.dcjqaccordion.2.8.min.js"></script>
	<script type="text/javascript" src="js/datetimepicker/moment.js"></script>
	<script type="text/javascript" src="js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui/jquery-ui.min.js"></script>
	<script type="text/javascript" src="js/bootstrapValidator/bootstrapValidator.js"></script>


	<!-- Theme files
	============================================ -->


	<script type="text/javascript" src="js/themejs/so_megamenu.js"></script>
	<script type="text/javascript" src="js/themejs/addtocart.js"></script>
	<script type="text/javascript" src="js/themejs/application.js"></script>

	<!-- Self files
	============================================ -->
	<script type="text/javascript" src="js/page/user/user-register.js"></script>

</body>
</html>
