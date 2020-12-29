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
					<form action="user/doRegister" id="userRegisterForm"  class="form-horizontal account-register clearfix">
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
									<label class="radio-inline"> <input type="radio" name="addressIsDefault" value="1" checked="checked"> Yes
									</label> <label class="radio-inline"> <input type="radio" name="addressIsDefault" value="0" > No
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
