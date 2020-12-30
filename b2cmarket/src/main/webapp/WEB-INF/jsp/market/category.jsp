<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<body class="res layout-1 listing-page">


	<div id="wrapper" class="wrapper-fluid banners-effect-5">


		<%-- <%@include file="header.jsp"%> --%>

		<!-- Main Container  -->
		<div class="main-container container">
			<ul class="breadcrumb">
				<li><a href="#"><i class="fa fa-home"></i></a></li>
				<li><a href="#">Smartphone & Tablets</a></li>
			</ul>

			<div class="row">
				<!--Left Part Start -->
				<aside class="col-sm-4 col-md-3 content-aside" id="column-left">
					<!-- <div class="module category-style">
                	<h3 class="modtitle">Categories</h3>
                	<div class="modcontent">
                		<div class="box-category">
                			<ul id="cat_accordion" class="list-group">
                				<li class="hadchild"><a href="category" class="cutom-parent">Smartphone & Tablets</a>   <span class="button-view  fa fa-plus-square-o"></span>
                					<ul style="display: block;">
                						<li><a href="category">Men's Watches</a></li>
                						<li><a href="category">Women's Watches</a></li>
                						<li><a href="category">Kids' Watches</a></li>
                						<li><a href="category">Accessories</a></li>
                					</ul>
                				</li>
                				<li class="hadchild"><a class="cutom-parent" href="category">Electronics</a>   <span class="button-view  fa fa-plus-square-o"></span>
                					<ul style="display: none;">
                						<li><a href="category">Cycling</a></li>
                						<li><a href="category">Running</a></li>
                						<li><a href="category">Swimming</a></li>
                						<li><a href="category">Football</a></li>
                						<li><a href="category">Golf</a></li>
                						<li><a href="category">Windsurfing</a></li>
                					</ul>
                				</li>
                				<li class="hadchild"><a href="category" class="cutom-parent">Shoes</a>   <span class="button-view  fa fa-plus-square-o"></span>
                					<ul style="display: none;">
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                					</ul>
                				</li>
                				<li class="hadchild"><a href="category" class="cutom-parent">Watches</a>  <span class="button-view  fa fa-plus-square-o"></span>
                					<ul style="display: none;">
                						<li><a href="category">Men's Watches</a></li>
                						<li><a href="category">Women's Watches</a></li>
                						<li><a href="category">Kids' Watches</a></li>
                						<li><a href="category">Accessories</a></li>
                					</ul>
                				</li>
                				<li class="hadchild"><a href="category" class="cutom-parent">Jewellery</a>    <span class="button-view  fa fa-plus-square-o"></span>
                					<ul style="display: none;">
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                						<li><a href="category">Sub Categories</a></li>
                					</ul>
                				</li>
                				<li class=""><a href="category" class="cutom-parent">Health &amp; Beauty</a>  <span class="dcjq-icon"></span></li>
                				<li class=""><a href="category" class="cutom-parent">Kids &amp; Babies</a>    <span class="dcjq-icon"></span></li>
                				<li class=""><a href="category" class="cutom-parent">Sports</a>  <span class="dcjq-icon"></span></li>
                				<li class=""><a href="category" class="cutom-parent">Home &amp; Garden</a><span class="dcjq-icon"></span></li>
                				<li class=""><a href="category" class="cutom-parent">Wines &amp; Spirits</a>  <span class="dcjq-icon"></span></li>
                			</ul>
                		</div>
                		
                		
                	</div>
                </div> -->
					<div class="module product-simple">
						<h3 class="modtitle">
							<span>Latest products</span>
						</h3>
						<div class="modcontent">
							<div class="so-extraslider">
								<!-- Begin extraslider-inner -->
								<div class="yt-content-slider extraslider-inner">
									<div class="item ">
										<div class="product-layout item-inner style1 ">
											<div class="item-image">
												<div class="item-img-info">
													<a href="#" target="_self" title="Mandouille short "> <img src="image/catalog/demo/product/80/1.jpg" alt="Mandouille short">
													</a>
												</div>

											</div>
											<div class="item-info">
												<div class="item-title">
													<a href="#" target="_self" title="Mandouille short">Mandouille short </a>
												</div>
												<div class="rating">
													<span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span>
												</div>
												<div class="content_price price">
													<span class="price-new product-price">$55.00 </span>&nbsp;&nbsp; <span class="price-old">$76.00 </span>&nbsp;

												</div>
											</div>
											<!-- End item-info -->
											<!-- End item-wrap-inner -->
										</div>
										<!-- End item-wrap -->
										<div class="product-layout item-inner style1 ">
											<div class="item-image">
												<div class="item-img-info">
													<a href="#" target="_self" title="Xancetta bresao "> <img src="image/catalog/demo/product/80/2.jpg" alt="Xancetta bresao">
													</a>
												</div>

											</div>
											<div class="item-info">
												<div class="item-title">
													<a href="#" target="_self" title="Xancetta bresao"> Xancetta bresao </a>
												</div>
												<div class="rating">
													<span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span>
												</div>
												<div class="content_price price">
													<span class="price-new product-price">$80.00 </span>&nbsp;&nbsp; <span class="price-old">$89.00 </span>&nbsp;



												</div>
											</div>
											<!-- End item-info -->
											<!-- End item-wrap-inner -->
										</div>
										<!-- End item-wrap -->
										<div class="product-layout item-inner style1 ">
											<div class="item-image">
												<div class="item-img-info">
													<a href="#" target="_self" title="Sausage cowbee "> <img src="image/catalog/demo/product/80/3.jpg" alt="Sausage cowbee">
													</a>
												</div>

											</div>
											<div class="item-info">
												<div class="item-title">
													<a href="#" target="_self" title="Sausage cowbee"> Sausage cowbee </a>
												</div>
												<div class="rating">
													<span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star-o fa-stack-2x"></i></span>
												</div>

												<div class="content_price price">
													<span class="price product-price"> $66.00 </span>
												</div>
											</div>
											<!-- End item-info -->
											<!-- End item-wrap-inner -->
										</div>
										<!-- End item-wrap -->
										<div class="product-layout item-inner style1 ">
											<div class="item-image">
												<div class="item-img-info">
													<a href="#" target="_self" title="Chicken swinesha "> <img src="image/catalog/demo/product/80/4.jpg" alt="Chicken swinesha">
													</a>
												</div>

											</div>
											<div class="item-info">
												<div class="item-title">
													<a href="#" target="_self" title="Chicken swinesha"> Chicken swinesha </a>
												</div>
												<div class="rating">
													<span class="fa fa-stack"> <i class="fa fa-star fa-stack-2x"></i>
													</span> <span class="fa fa-stack"> <i class="fa fa-star fa-stack-2x"></i>
													</span> <span class="fa fa-stack"> <i class="fa fa-star fa-stack-2x"></i>
													</span> <span class="fa fa-stack"> <i class="fa fa-star fa-stack-2x"></i>
													</span> <span class="fa fa-stack"> <i class="fa fa-star fa-stack-2x"></i>
													</span>
												</div>
												<div class="content_price price">
													<span class="price-new product-price">$45.00 </span>&nbsp;&nbsp; <span class="price-old">$56.00 </span>&nbsp;



												</div>
											</div>
											<!-- End item-info -->
											<!-- End item-wrap-inner -->
										</div>
										<!-- End item-wrap -->
									</div>
								</div>
								<!--End extraslider-inner -->
							</div>
						</div>
					</div>
					<div class="module banner-left hidden-xs ">
						<div class="banner-sidebar banners">
							<div>
								<a title="Banner Image" href="#"> <img src="image/catalog/banners/banner-sidebar.jpg" alt="Banner Image">
								</a>
							</div>
						</div>
					</div>
				</aside>
				<!--Left Part End -->

				<!--Middle Part Start-->
				<div id="content" class="col-md-9 col-sm-8">
					<div class="products-category">
						<h3 class="title-category ">Accessories</h3>
						<div class="category-desc">
							<div class="row">
								<div class="col-sm-12">
									<div class="banners">
										<div>
											<a href="#"><img src="image/catalog/demo/category/img-cate.jpg" alt="img cate"><br></a>
										</div>
									</div>

								</div>
							</div>
						</div>
						<!-- Filters -->
						<div class="product-filter product-filter-top filters-panel">
							<div class="row">
								<div class="col-md-5 col-sm-3 col-xs-12 view-mode">

									<div class="list-view">
										<button class="btn btn-default grid active" data-view="grid" data-toggle="tooltip" data-original-title="Grid">
											<i class="fa fa-th"></i>
										</button>
										<button class="btn btn-default list" data-view="list" data-toggle="tooltip" data-original-title="List">
											<i class="fa fa-th-list"></i>
										</button>
									</div>

								</div>
								<div class="short-by-show form-inline text-right col-md-7 col-sm-9 col-xs-12">
									<div class="form-group short-by">
										<label class="control-label" for="input-sort">Sort By:</label> <select id="input-sort" class="form-control" onchange="location = this.value;">
											<option value="" selected="selected">Default</option>
											<option value="">Name (A - Z)</option>
											<option value="">Name (Z - A)</option>
											<option value="">Price (Low &gt; High)</option>
											<option value="">Price (High &gt; Low)</option>
											<option value="">Rating (Highest)</option>
											<option value="">Rating (Lowest)</option>
											<option value="">Model (A - Z)</option>
											<option value="">Model (Z - A)</option>
										</select>
									</div>
									<div class="form-group">
										<label class="control-label" for="input-limit">Show:</label> <select id="input-limit" class="form-control" onchange="location = this.value;">
											<option value="" selected="selected">15</option>
											<option value="">25</option>
											<option value="">50</option>
											<option value="">75</option>
											<option value="">100</option>
										</select>
									</div>
								</div>
								<!-- <div class="box-pagination col-md-3 col-sm-4 col-xs-12 text-right">
                                <ul class="pagination">
                                    <li class="active"><span>1</span></li>
                                    <li><a href="">2</a></li><li><a href="">&gt;</a></li>
                                    <li><a href="">&gt;|</a></li>
                                </ul>
                            </div> -->
							</div>
						</div>
						<!-- //end Filters -->

						<!--changed listings-->
						<div class="products-list row nopadding-xs so-filter-gird">
							<c:if test="${!empty commodityList}">
								<c:forEach items="${commodityList}" var="commodity">
									<c:if test="${commodity.activeFlag==1}">
										<div class="product-layout col-lg-15 col-md-4 col-sm-6 col-xs-12">
											<div class="product-item-container">
												<div class="left-block left-b">

													<div class="product-image-container second_img">
														<a href="product/${commodity.rowId}" id="goProductId" target="_self" title="Lastrami bacon"> <img src="${commodity.commodityPhoto}" class="img-1 img-responsive" alt="image1"> <img src="image/catalog/demo/product/270/e10.jpg" class="img-2 img-responsive" alt="image2">
														</a>
													</div>
													<!--quickview-->
													<div class="so-quickview">
														<a class="iframe-link btn-button quickview quickview_handler visible-lg" href="quickview.html" title="Quick view" data-fancybox-type="iframe"><i class="fa fa-eye"></i><span>Quick view</span></a>
													</div>
													<!--end quickview-->


												</div>
												<div class="right-block">
													<div class="button-group so-quickview cartinfo--left">
														<button type="button" class="addToCart" title="Add to cart" onclick="cart.add('60 ');">
															<span>Add to cart </span>
														</button>
														<button type="button" class="wishlist btn-button" title="Add to Wish List" onclick="wishlist.add('60');">
															<i class="fa fa-heart-o"></i><span>Add to Wish List</span>
														</button>
														<button type="button" class="compare btn-button" title="Compare this Product " onclick="compare.add('60');">
															<i class="fa fa-retweet"></i><span>Compare this Product</span>
														</button>

													</div>
													<div class="caption hide-cont">
														<div class="ratings">
															<div class="rating-box">
																<span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span> <span class="fa fa-stack"><i class="fa fa-star fa-stack-2x"></i></span>
															</div>
															<span class="rating-num">( 2 )</span>
														</div>
														<h4>
															<a href="product/${commodity.rowId}"  id="goProductId" title="${commodity.commodityName}" target="_self">${commodity.commodityName}</a>
														</h4>

													</div>
													<p class="price">
														<span class="price-new">$ ${commodity.commodityPrice}</span>

													</p>
													<div class="description item-desc">
														<p>${commodity.commodityInfo}</p>
													</div>
													<div class="list-block">
														<button class="addToCart btn-button" type="button" title="Add to Cart" onclick="cart.add('101', '1');">
															<i class="fa fa-shopping-basket"></i>
														</button>
														<button class="wishlist btn-button" type="button" title="Add to Wish List" onclick="wishlist.add('101');">
															<i class="fa fa-heart"></i>
														</button>
														<button class="compare btn-button" type="button" title="Compare this Product" onclick="compare.add('101');">
															<i class="fa fa-refresh"></i>
														</button>
														<!--quickview-->
														<a class="iframe-link btn-button quickview quickview_handler visible-lg" href="quickview.html" title="Quick view" data-fancybox-type="iframe"><i class="fa fa-eye"></i></a>
														<!--end quickview-->
													</div>
												</div>

											</div>
										</div>
									</c:if>
								</c:forEach>
							</c:if>


							<!--// End Changed listings-->
							<!-- Filters -->
							<div class="product-filter product-filter-bottom filters-panel">
								<div class="row">
									<div class="col-sm-6 text-left"></div>
									<div class="col-sm-6 text-right">Showing 1 to 15 of 15 (1 Pages)</div>
								</div>
							</div>
							<!-- //end Filters -->

						</div>

					</div>


					<!--Middle Part End-->
				</div>
			</div>
			<!-- //Main Container -->


			<%-- <%@include file="footer.jsp"%> --%>

		</div>


		<!-- Cpanel Block -->
		<div id="sp-cpanel_btn" class="isDown visible-lg">
			<i class="fa fa-cog"></i>
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


		<!-- Theme files
	============================================ -->


		<script type="text/javascript" src="js/themejs/so_megamenu.js"></script>
		<script type="text/javascript" src="js/themejs/addtocart.js"></script>
		<script type="text/javascript" src="js/themejs/application.js"></script>
		<script type="text/javascript">
		<!--
			// Check if Cookie exists
			if ($.cookie('display')) {
				view = $.cookie('display');
			} else {
				view = 'grid';
			}
			if (view)
				display(view);
		//-->
		</script>
</body>
</html>
