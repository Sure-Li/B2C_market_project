<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Header Container  -->
<header id="header" class=" typeheader-1">

	<!-- Header Top -->
	<div class="header-top hidden-compact">
		<div class="container">
			<div class="row">
				<div class="header-top-left col-lg-7 col-md-8 col-sm-6 col-xs-4">
					<div class="hidden-md hidden-sm hidden-xs welcome-msg">
						Welcome to SuperMarket! Wrap new offers / gift every single day on Weekends - New Coupon code: <span>Sure_Li</span>
					</div>
					<ul class="top-link list-inline hidden-lg ">
						<li class="account" id="my_account"><a href="#" title="My Account " class="btn-xs dropdown-toggle" data-toggle="dropdown"> <span class="hidden-xs">My Account </span> <span class="fa fa-caret-down"></span>
						</a>
							<ul class="dropdown-menu ">
								<li><a href="register"><i class="fa fa-user"></i> Register</a></li>
								<li><a href="login"><i class="fa fa-pencil-square-o"></i> Login</a></li>
							</ul></li>
					</ul>
				</div>
				<div class="header-top-right collapsed-block col-lg-5 col-md-4 col-sm-6 col-xs-8">
					<ul class="top-link list-inline lang-curr">
						<li class="currency">
							<div class="btn-group currencies-block">
								<form action="index" method="post" enctype="multipart/form-data" id="currency">
									<a class="btn btn-link dropdown-toggle" data-toggle="dropdown"> <span class="icon icon-credit "></span> $ US Dollar <span class="fa fa-angle-down"></span>
									</a>
									<ul class="dropdown-menu btn-xs">
										<li><a href="#">(€)&nbsp;Euro</a></li>
										<li><a href="#">(£)&nbsp;Pounds </a></li>
										<li><a href="#">($)&nbsp;US Dollar </a></li>
									</ul>
								</form>
							</div>
						</li>
						<li class="language">
							<div class="btn-group languages-block ">
								<form action="index" method="post" enctype="multipart/form-data" id="bt-language">
									<a class="btn btn-link dropdown-toggle" data-toggle="dropdown"> <img src="image/catalog/flags/gb.png" alt="English" title="English"> <span class="">English</span> <span class="fa fa-angle-down"></span>
									</a>
									<ul class="dropdown-menu">
										<li><a href="index"><img class="image_flag" src="image/catalog/flags/gb.png" alt="English" title="English" /> English </a></li>
										<li><a href=""> <img class="image_flag" src="image/catalog/flags/ar.png" alt="Arabic" title="Arabic" /> Arabic
										</a></li>
									</ul>
								</form>
							</div>

						</li>
					</ul>



				</div>
			</div>
		</div>
	</div>
	<!-- //Header Top -->

	<!-- Header center -->
	<div class="header-middle">
		<div class="container">
			<div class="row">
				<!-- Logo -->
				<div class="navbar-logo col-lg-2 col-md-3 col-sm-4 col-xs-12">
					<div class="logo">
						<a href="index"><img src="image/catalog/logo.png" title="Your Store" alt="Your Store" /></a>
					</div>
				</div>
				<!-- //end Logo -->


				<!-- Search -->
				<div class="col-lg-7 col-md-6 col-sm-5">
					<div class="search-header-w">
						<div class="icon-search hidden-lg hidden-md hidden-sm">
							<i class="fa fa-search"></i>
						</div>

						<div id="sosearchpro" class="sosearchpro-wrapper so-search ">
							<form method="GET" action="index">
								<div id="search0" class="search input-group form-group">
									<div class="select_category filter_type  icon-select hidden-sm hidden-xs">
										<select class="no-border" name="category_id">
											<option value="0">All Categories</option>
											<option value="78">Apparel</option>
											<option value="77">Cables &amp; Connectors</option>
											<option value="82">Cameras &amp; Photo</option>
											<option value="80">Flashlights &amp; Lamps</option>
											<option value="81">Mobile Accessories</option>
											<option value="79">Video Games</option>
											<option value="20">Jewelry &amp; Watches</option>
											<option value="76">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Earings</option>
											<option value="26">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Wedding Rings</option>
											<option value="27">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Men Watches</option>
										</select>
									</div>

									<input class="autosearch-input form-control" type="text" value="" size="50" autocomplete="off" placeholder="Keyword here..." name="search">

									<button type="submit" class="button-search btn btn-primary" name="submit_search">
										<i class="fa fa-search"></i>
									</button>

								</div>
								<input type="hidden" name="route" value="product/search" />
							</form>
						</div>
					</div>
				</div>
				<!-- //end Search -->
				<div class="middle-right col-lg-3 col-md-3 col-sm-3">
					<!--cart-->
					<div class="shopping_cart">
						<div id="cart" class="btn-shopping-cart">

							<a data-loading-text="Loading... " class="btn-group top_cart dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
								<div class="shopcart">
									<span class="icon-c" id="span-cart-incon-id"> <i class="fa fa-shopping-bag"></i>
									</span>
									<div class="shopcart-inner">
										<p class="text-shopping-cart">My cart</p>

										<!-- <span class="total-shopping-cart cart-total-full"> <span class="items_cart">02</span><span class="items_cart2"> item(s)</span><span class="items_carts">( $162.00 )</span> -->
										</span>
									</div>
								</div>
							</a>

							<ul class="dropdown-menu pull-right shoppingcart-box" role="menu" id="tbody-cart-show-id">
								<li>
									<table class="table table-striped">
										<tbody>
											<c:if test="${!empty sessionScope.userCartMap}">
												<c:forEach items="${sessionScope.userCartMap}" var="cartCommodity">
													<%-- key=${cartCommodity.key},value=${cartCommodity.value} --%>
													<%-- <tr>
														<td class="text-center"><a href="product"><img width="70px" src="${cartCommodity.value.commodityPhoto}" alt="Aspire Ultrabook Laptop" title="Aspire Ultrabook Laptop" class="img-thumbnail" /></a></td>
														<td class="text-left"><a href="product">${cartCommodity.value.commodityName}</a><br /></td>
														<td class="text-left">${cartCommodity.value.commodityInfo}</td>
														<td class="text-left" width="200px"><div class="input-group btn-block quantity">
																<input type="text" name="quantity" value="${cartCommodity.key.commodityCount}" size="1" class="form-control" data-href="cart/edit/${cartCommodity.value.rowId}/${userId}/${cartCommodity.value.commodityPrice}" id="input-commodityCount-id" /> <span class="input-group-btn">
																	<button type="button" data-toggle="tooltip" title="Remove" class="btn btn-danger" data-href="cart/delete/${cartCommodity.value.rowId}/${userId}/${cartCommodity.value.commodityPrice}" id="btn-submit-delete-id">
																		<i class="fa fa-times-circle"></i>
																	</button>

																</span>
															</div></td>
														<td class="text-right">$ ${cartCommodity.value.commodityPrice}</td>
														<td class="text-right">$ ${cartCommodity.value.commodityPrice*cartCommodity.key.commodityCount}</td>
													</tr> --%>
													<tr>
														<td class="text-center" style="width: 70px"><a href="product"> <img src="${cartCommodity.value.commodityPhoto}" style="width: 70px" alt="Yutculpa ullamcon" title="Yutculpa ullamco" class="preview">
														</a></td>
														<td class="text-left"><a class="cart_product_name" href="product">${cartCommodity.value.commodityName}</a></td>
														<td class="text-center">x ${cartCommodity.key.commodityCount}</td>
														<td class="text-center">$ ${cartCommodity.value.commodityPrice}</td>
														<!-- <td class="text-right"><a href="product" class="fa fa-edit"></a></td>
														<td class="text-right"><a onclick="cart.remove('2');" class="fa fa-times fa-delete"></a></td> -->
													</tr>
												</c:forEach>
												<br>
											</c:if>
											<c:if test="${empty sessionScope.userCartMap}">
												<h1 style="color: red;">暂无数据</h1>
											</c:if>

										</tbody>
									</table>
								</li>
								<li>
									<div>
										<table class="table table-bordered">
											<tbody>
												<tr>
													<td class="text-left"><strong>Total</strong></td>
													<td class="text-right">$ ${sessionScope.userCartPriceSum}</td>
												</tr>
											</tbody>
										</table>
										<p class="text-right">
											<a class="btn view-cart" href="cart" id="btn-view-cart-id"><i class="fa fa-shopping-cart"></i>View Cart</a>&nbsp;&nbsp;&nbsp; <a class="btn btn-mega checkout-cart" href="checkout" id="btn-checkout-id"><i class="fa fa-share"></i>Checkout</a>
										</p>
									</div>
								</li>
							</ul>
						</div>

					</div>
					<!--//cart-->

					<ul class="wishlist-comp hidden-md hidden-sm hidden-xs">
						<li class="compare hidden-xs"><a href="#" class="top-link-compare" title="Compare "><i class="fa fa-refresh"></i></a></li>
						<li class="wishlist hidden-xs"><a href="wishlist" id="header-wishlist-id" class="top-link-wishlist" title="Wish List (0) "><i class="fa fa-heart"></i></a></li>
					</ul>



				</div>

			</div>

		</div>
	</div>
	<!-- //Header center -->

	<!-- Header Bottom -->
	<div class="header-bottom hidden-compact">
		<div class="container">
			<div class="row">

				<div class="bottom1 menu-vertical col-lg-2 col-md-3 col-sm-3">
					<div class="responsive so-megamenu megamenu-style-dev ">
						<div class="so-vertical-menu ">
							<nav class="navbar-default">

								<div class="container-megamenu vertical">
									<div id="menuHeading">
										<div class="megamenuToogle-wrapper">
											<div class="megamenuToogle-pattern">
												<div class="container" id="HeaderAllCatalogueId">
													<div>
														<span></span> <span></span> <span></span>
													</div>
													All Categories
												</div>
											</div>
										</div>
									</div>

									<div class="navbar-header">
										<button type="button" id="show-verticalmenu" data-toggle="collapse" class="navbar-toggle">
											<i class="fa fa-bars"></i> <span> All Categories</span>
										</button>
									</div>
									<div class="vertical-wrapper">
										<span id="remove-verticalmenu" class="fa fa-times"></span>
										<div class="megamenu-pattern">
											<div class="container-mega">
												<ul class="megamenu" id="megamenuId">
													<c:if test="${!empty catalogueList}">
														<c:forEach items="${catalogueList}" var="catalogue">
															<li class="item-vertical" style="display: true;">
																<p class="close-menu"></p> <a href="category/catagoryCommodity/${catalogue.rowId}" id="category-rowId-id" class="clearfix"> <img src="image/catalog/menu/icons/ico6.png" alt="icon"> <span >${catalogue.catalogueName}</span>
															</a>
															</li>

														</c:forEach>
														<!-- <li class="loadmore"><i class="fa fa-plus-square-o"></i> <span class="more-view">More Categories</span></li> -->
													</c:if>
												</ul>
												<!-- <ul class="megamenu">
													<li class="item-vertical  with-sub-menu hover">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico10.png" alt="icon"> <span>test</span> <b class="fa-angle-right"></b>
													</a>
														<div class="sub-menu" data-subwidth="60">
															<div class="content">
																<div class="row">
																	<div class="col-sm-12">
																		<div class="row">
																			<div class="col-md-4 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Apparel</a>
																							<ul>
																								<li><a href="#">Accessories for Tablet PC</a></li>
																								<li><a href="#">Accessories for i Pad</a></li>
																								<li><a href="#">Accessories for iPhone</a></li>
																								<li><a href="#">Bags, Holiday Supplies</a></li>
																								<li><a href="#">Car Alarms and Security</a></li>
																								<li><a href="#">Car Audio &amp; Speakers</a></li>
																							</ul></li>
																						<li><a href="#" class="main-menu">Cables &amp; Connectors</a>
																							<ul>
																								<li><a href="#">Cameras &amp; Photo</a></li>
																								<li><a href="#">Electronics</a></li>
																								<li><a href="#">Outdoor &amp; Traveling</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																			<div class="col-md-4 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Camping &amp; Hiking</a>
																							<ul>
																								<li><a href="#">Earings</a></li>
																								<li><a href="#">Shaving &amp; Hair Removal</a></li>
																								<li><a href="#">Salon &amp; Spa Equipment</a></li>
																							</ul></li>
																						<li><a href="#" class="main-menu">Smartphone &amp; Tablets</a>
																							<ul>
																								<li><a href="#">Sports &amp; Outdoors</a></li>
																								<li><a href="#">Bath &amp; Body</a></li>
																								<li><a href="#">Gadgets &amp; Auto Parts</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																			<div class="col-md-4 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Bags, Holiday Supplies</a>
																							<ul>
																								<li><a href="#" onclick="window.location = '18_46';">Battereries &amp; Chargers</a></li>
																								<li><a href="#" onclick="window.location = '24_64';">Bath &amp; Body</a></li>
																								<li><a href="#" onclick="window.location = '18_45';">Headphones, Headsets</a></li>
																								<li><a href="#" onclick="window.location = '18_30';">Home Audio</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</li>
													<li class="item-vertical">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico1.png" alt="icon"> <span>Fashion & Accessories</span>

													</a>
													</li>
													<li class="item-vertical  style1 with-sub-menu hover">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <span class="label"></span> <img src="image/catalog/menu/icons/ico9.png" alt="icon"> <span>Electronic</span> <b class="fa-angle-right"></b>
													</a>
														<div class="sub-menu" data-subwidth="40">
															<div class="content">
																<div class="row">
																	<div class="col-md-6">
																		<div class="row">
																			<div class="col-md-12 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Smartphone</a>
																							<ul>
																								<li><a href="#">Esdipiscing</a></li>
																								<li><a href="#">Scanners</a></li>
																								<li><a href="#">Apple</a></li>
																								<li><a href="#">Dell</a></li>
																								<li><a href="#">Scanners</a></li>
																							</ul></li>
																						<li><a href="#" class="main-menu">Electronics</a>
																							<ul>
																								<li><a href="#">Asdipiscing</a></li>
																								<li><a href="#">Diam sit</a></li>
																								<li><a href="#">Labore et</a></li>
																								<li><a href="#">Monitors</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																		</div>
																	</div>
																	<div class="col-md-6">
																		<div class="row banner">
																			<a href="#"> <img src="image/catalog/menu/megabanner/vbanner1.jpg" alt="banner1">
																			</a>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</li>
													<li class="item-vertical with-sub-menu hover">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico7.png" alt="icon"> <span>Health &amp; Beauty</span> <b class="fa-angle-right"></b>
													</a>
														<div class="sub-menu" data-subwidth="60">
															<div class="content">
																<div class="row">
																	<div class="col-md-12">
																		<div class="row">
																			<div class="col-md-4 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Car Alarms and Security</a>
																							<ul>
																								<li><a href="#">Car Audio &amp; Speakers</a></li>
																								<li><a href="#">Gadgets &amp; Auto Parts</a></li>
																								<li><a href="#">Gadgets &amp; Auto Parts</a></li>
																								<li><a href="#">Headphones, Headsets</a></li>
																							</ul></li>
																						<li><a href="24" onclick="window.location = '24';" class="main-menu">Health &amp; Beauty</a>
																							<ul>
																								<li><a href="#">Home Audio</a></li>
																								<li><a href="#">Helicopters &amp; Parts</a></li>
																								<li><a href="#">Outdoor &amp; Traveling</a></li>
																								<li><a href="#">Toys &amp; Hobbies</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																			<div class="col-md-4 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Electronics</a>
																							<ul>
																								<li><a href="#">Earings</a></li>
																								<li><a href="#">Salon &amp; Spa Equipment</a></li>
																								<li><a href="#">Shaving &amp; Hair Removal</a></li>
																								<li><a href="#">Smartphone &amp; Tablets</a></li>
																							</ul></li>
																						<li><a href="#" class="main-menu">Sports &amp; Outdoors</a>
																							<ul>
																								<li><a href="#">Flashlights &amp; Lamps</a></li>
																								<li><a href="#">Fragrances</a></li>
																								<li><a href="#">Fishing</a></li>
																								<li><a href="#">FPV System &amp; Parts</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																			<div class="col-md-4 static-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">More Car Accessories</a>
																							<ul>
																								<li><a href="#">Lighter &amp; Cigar Supplies</a></li>
																								<li><a href="#">Mp3 Players &amp; Accessories</a></li>
																								<li><a href="#">Men Watches</a></li>
																								<li><a href="#">Mobile Accessories</a></li>
																							</ul></li>
																						<li><a href="#" class="main-menu">Gadgets &amp; Auto Parts</a>
																							<ul>
																								<li><a href="#">Gift &amp; Lifestyle Gadgets</a></li>
																								<li><a href="#">Gift for Man</a></li>
																								<li><a href="#">Gift for Woman</a></li>
																								<li><a href="#">Gift for Woman</a></li>
																							</ul></li>
																					</ul>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</li>
													<li class="item-vertical css-menu with-sub-menu hover">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico6.png" alt="icon"> <span>Smartphone &amp; Tablets</span> <b class="fa-angle-right"></b>
													</a>
														<div class="sub-menu" data-subwidth="20">
															<div class="content">
																<div class="row">
																	<div class="col-sm-12">
																		<div class="row">
																			<div class="col-sm-12 hover-menu">
																				<div class="menu">
																					<ul>
																						<li><a href="#" class="main-menu">Headphones, Headsets</a></li>
																						<li><a href="#" class="main-menu">Home Audio</a></li>
																						<li><a href="#" class="main-menu">Health &amp; Beauty</a></li>
																						<li><a href="#" class="main-menu">Helicopters &amp; Parts</a></li>
																						<li><a href="#" class="main-menu">Helicopters &amp; Parts</a></li>
																					</ul>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</li>
													<li class="item-vertical">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico5.png" alt="icon"> <span>Health & Beauty</span>

													</a>
													</li>
													<li class="item-vertical">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico4.png" alt="icon"> <span>Bathroom</span>
													</a>
													</li>
													<li class="item-vertical">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico3.png" alt="icon"> <span>Metallurgy</span>
													</a>
													</li>
													<li class="item-vertical">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico2.png" alt="icon"> <span>Bedroom</span>
													</a>
													</li>
													<li class="item-vertical">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico1.png" alt="icon"> <span>Health &amp; Beauty</span>
													</a>
													</li>
													<li class="item-vertical" style="display: none;">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico11.png" alt="icon"> <span>Toys &amp; Hobbies </span>
													</a>
													</li>
													<li class="item-vertical" style="display: none;">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico12.png" alt="icon"> <span>Jewelry &amp; Watches</span>
													</a>
													</li>
													<li class="item-vertical" style="display: none;">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico9.png" alt="icon"> <span>Home &amp; Lights</span>
													</a>
													</li>
													<li class="item-vertical" style="display: none;">
														<p class="close-menu"></p> <a href="#" class="clearfix"> <img src="image/catalog/menu/icons/ico6.png" alt="icon"> <span>Metallurgy</span>
													</a>
													</li>

													<li class="loadmore"><i class="fa fa-plus-square-o"></i> <span class="more-view">More Categories</span></li> -->

												<!-- </ul> -->
											</div>
										</div>
									</div>
								</div>
							</nav>
						</div>
					</div>

				</div>

				<!-- Main menu -->
				<div class="main-menu-w col-lg-10 col-md-9">
					<div class="responsive so-megamenu megamenu-style-dev">
						<nav class="navbar-default">
							<div class=" container-megamenu  horizontal open ">
								<div class="navbar-header">
									<button type="button" id="show-megamenu" data-toggle="collapse" class="navbar-toggle">
										<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
									</button>
								</div>

								<div class="megamenu-wrapper">
									<span id="remove-megamenu" class="fa fa-times"></span>
									<div class="megamenu-pattern">
										<div class="container-mega">
											<ul class="megamenu" data-transition="slide" data-animationtime="250">
												<li><a href="index">Home</a></li>
												<li >
													<a href="category" id="headerCatagoryId" class="clearfix"> <strong>category</strong> <img class="label-hot" src="image/catalog/menu/new-icon.png" alt="icon items"></a>
												</li>
												<li class="with-sub-menu hover">
													<p class="close-menu"></p> <a href="#" class="clearfix"> <strong>Pages</strong> <b class="caret"></b>
												</a>
													<div class="sub-menu" style="width: 40%;">
														<div class="content">
															<div class="row">
																<div class="col-md-6">
																	<ul class="row-list">
																		<li><a class="subcategory_item" href="faq.html">FAQ</a></li>

																		<li><a class="subcategory_item" href="sitemap.html">Site Map</a></li>
																		<li><a class="subcategory_item" href="contact.html">Contact us</a></li>
																		<li><a class="subcategory_item" href="banner-effect.html">Banner Effect</a></li>
																	</ul>
																</div>
																<div class="col-md-6">
																	<ul class="row-list">
																		<li><a class="subcategory_item" href="about-us.html">About Us 1</a></li>
																		<li><a class="subcategory_item" href="about-us-2.html">About Us 2</a></li>
																		<li><a class="subcategory_item" href="about-us-3.html">About Us 3</a></li>
																		<li><a class="subcategory_item" href="about-us-4.html">About Us 4</a></li>
																	</ul>
																</div>
															</div>
														</div>
													</div>
												</li>
												<li class="with-sub-menu hover">
													<p class="close-menu"></p> <a href="#" class="clearfix"> <strong>Categories</strong> <img class="label-hot" src="image/catalog/menu/hot-icon.png" alt="icon items"> <b class="caret"></b>
												</a>
													<div class="sub-menu" style="width: 100%; display: none;">
														<div class="content">
															<div class="row">
																<div class="col-sm-12">
																	<div class="row">
																		<div class="col-md-3 img img1">
																			<a href="#"><img src="image/catalog/menu/megabanner/image-1.jpg" alt="banner1"></a>
																		</div>
																		<div class="col-md-3 img img2">
																			<a href="#"><img src="image/catalog/menu/megabanner/image-2.jpg" alt="banner2"></a>
																		</div>
																		<div class="col-md-3 img img3">
																			<a href="#"><img src="image/catalog/menu/megabanner/image-3.jpg" alt="banner3"></a>
																		</div>
																		<div class="col-md-3 img img4">
																			<a href="#"><img src="image/catalog/menu/megabanner/image-4.jpg" alt="banner4"></a>
																		</div>
																	</div>
																</div>
															</div>
															<div class="row">
																<div class="col-md-3">
																	<a href="#" class="title-submenu">Automotive</a>
																	<div class="row">
																		<div class="col-md-12 hover-menu">
																			<div class="menu">
																				<ul>
																					<li><a href="#" class="main-menu">Car Alarms and Security</a></li>
																					<li><a href="#" class="main-menu">Car Audio &amp; Speakers</a></li>
																					<li><a href="#" class="main-menu">Gadgets &amp; Auto Parts</a></li>
																					<li><a href="#" class="main-menu">More Car Accessories</a></li>
																				</ul>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="col-md-3">
																	<a href="#" class="title-submenu">Funitures</a>
																	<div class="row">
																		<div class="col-md-12 hover-menu">
																			<div class="menu">
																				<ul>
																					<li><a href="#" class="main-menu">Bathroom</a></li>
																					<li><a href="#" class="main-menu">Bedroom</a></li>
																					<li><a href="#" class="main-menu">Decor</a></li>
																					<li><a href="#" class="main-menu">Living room</a></li>
																				</ul>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="col-md-3">
																	<a href="#" class="title-submenu">Jewelry &amp; Watches</a>
																	<div class="row">
																		<div class="col-md-12 hover-menu">
																			<div class="menu">
																				<ul>
																					<li><a href="#" class="main-menu">Earings</a></li>
																					<li><a href="#" class="main-menu">Wedding Rings</a></li>
																					<li><a href="#" class="main-menu">Men Watches</a></li>
																				</ul>
																			</div>
																		</div>
																	</div>
																</div>
																<div class="col-md-3">
																	<a href="#" class="title-submenu">Electronics</a>
																	<div class="row">
																		<div class="col-md-12 hover-menu">
																			<div class="menu">
																				<ul>
																					<li><a href="#" class="main-menu">Computer</a></li>
																					<li><a href="#" class="main-menu">Smartphone</a></li>
																					<li><a href="#" class="main-menu">Tablets</a></li>
																					<li><a href="#" class="main-menu">Monitors</a></li>
																				</ul>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</li>

												<li class="">
													<p class="close-menu"></p> <a href="#" class="clearfix"> <strong>Accessories</strong>

												</a>

												</li>
												<li class="">
													<p class="close-menu"></p> <a href="blog-page.html" class="clearfix"> <strong>Blog</strong> <span class="label"></span>
												</a>
												</li>


											</ul>

										</div>
									</div>
								</div>
							</div>
						</nav>
					</div>
				</div>
				<!-- //end Main menu -->

				<div class="bottom3">
					<div class="telephone hidden-xs hidden-sm hidden-md">
						<ul class="blank">
							<li><a href="#"><i class="fa fa-truck"></i>track your order</a></li>
							<li><a href="#"><i class="fa fa-phone-square"></i>Hotline (+123)4 567 890</a></li>
						</ul>
					</div>
					<div class="signin-w hidden-md hidden-sm hidden-xs">
						<input type="hidden" value="${sessionScope.loginUser.userName}" id="userLoginName"> <input type="hidden" value="${sessionScope.loginUser.rowId}" id="userLoginRowId">
						<ul class="signin-link blank" id="showLoginUlId">
							<li class="log login"><i class="fa fa-lock"></i> <a class="link-lg" href="login" id="headerLoginId">Login </a> or <a href="register" id="headerRegisterId">Register</a></li>
						</ul>
					</div>
				</div>

			</div>
		</div>

	</div>
</header>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="js/page/header.js"></script>
<!-- //Header Container  -->
