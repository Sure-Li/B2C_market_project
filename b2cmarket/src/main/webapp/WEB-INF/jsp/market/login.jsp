		<!-- Main Container  -->
			<ul class="breadcrumb">
				<li><a href="#"><i class="fa fa-home"></i></a></li>
				<li><a href="#">Account</a></li>
				<li><a href="#">Login</a></li>
			</ul>

			<div class="row">
				<div id="content" class="col-sm-12">
					<div class="page-login">

						<div class="account-border">
							<div class="row">
								<div class="col-sm-6 new-customer">
									<div class="well">
										<h2>
											<i class="fa fa-file-o" aria-hidden="true"></i> New Customer
										</h2>
										<p>By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.</p>
									</div>
									<div class="bottom-form">
										<a href="register" class="btn btn-default pull-right" id="loginContinueId">Continue</a>
									</div>
								</div>

								<form action="#" method="post" id="userLoginForm" enctype="multipart/form-data">
									<div class="col-sm-6 customer-login">
										<div class="well">
											<h2>
												<i class="fa fa-file-text-o" aria-hidden="true"></i> Returning Customer
											</h2>
											<p>
												<strong>I am a returning customer</strong>
											</p>
											<p id="loginInfoPId"></p>
											
											<div class="form-group">
												<label class="control-label " for="input-email">User Code</label> <input type="text" name="userCode" value="" id="input-userCode" class="form-control" />
											</div>
											<div class="form-group">
												<label class="control-label " for="input-password">Password</label> <input type="password" name="userPassword" value="" id="input-userPassword" class="form-control" />
											</div>
										</div>
										<div class="bottom-form">
											<a href="#" class="forgot">Forgotten Password</a> <input type="button" value="Login" id="loginFormSubmitId" class="btn btn-default pull-right" />
										</div>
									</div>
								</form>
							</div>
						</div>

					</div>
				</div>
			</div>

	<script type="text/javascript" src="js/page/user/user-login.js"></script>
