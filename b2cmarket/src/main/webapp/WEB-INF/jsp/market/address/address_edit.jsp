<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form class="form-horizontal account-register clearfix" id="form_edit">
	<input type="hidden" name="rowId" value="${getAddress.rowId}">
	<input type="hidden" name="userId" value="${getAddress.userId}">
	<input type="hidden"  value="${getAddress.addressProvinceCode}" id="form_edit_province_id">
	<input type="hidden"  value="${getAddress.addressCityCode}" id="form_edit_city_id">
	<input type="hidden"  value="${getAddress.addressReginCode}" id="form_edit_regin_id">
	
	<legend>Your Address</legend>
	<div class="form-group required">
		<label class="col-sm-2 control-label" for="input-country">Province</label>
		<div class="col-sm-10">
			<select name="addressProvinceCode"  id="input-addressProviceCode" class="form-control" >
				<option value="">--- Please Select ---</option>
				<c:if test="${!empty provinceList}">
					<c:forEach items="${provinceList}" var="province">
						<c:if test="${province.activeFlag==1}">
							<option value="${province.areaCode}">${province.areaName}</option>
						</c:if>
					</c:forEach>
				</c:if>
			</select>
		</div>
	</div>
	<div class="form-group required">
		<label class="col-sm-2 control-label" for="input-country">City</label>
		<div class="col-sm-10">
			<select name="addressCityCode" id="input-addressCityCode" class="form-control">
				<option value="">--- Please Select ---</option>
			</select>
		</div>
	</div>
	<div class="form-group required">
		<label class="col-sm-2 control-label" for="input-zone">Region</label>
		<div class="col-sm-10">
			<select name="addressReginCode" id="input-addressReginCode" class="form-control">
				<option value="">--- Please Select ---</option>
			</select>
		</div>
	</div>
	<div class="form-group required">
		<label class="col-sm-2 control-label" for="input-city">Address Detail</label>
		<div class="col-sm-10">
			<input type="text" name="addressDetail" value="${getAddress.addressDetail}" placeholder="Address Detail" id="input-addressDetail" class="form-control">
		</div>
	</div>
	<div class="form-group required">
		<label class="col-sm-2 control-label" for="input-postcode">Post Code</label>
		<div class="col-sm-10">
			<input type="text" name="addressPostCode" value="${getAddress.addressPostCode}" placeholder="Post Code" id="input-postcode" class="form-control">
		</div>
	</div>
	<div class="form-group required">
		<label class="col-sm-2 control-label" for="input-postcode">Phone</label>
		<div class="col-sm-10">
			<input type="text" name="addressPhone" value="${getAddress.addressPhone}" placeholder="Phone" id="input-postcode" class="form-control">
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label">Is Default Address</label>
		<div class="col-sm-10">
			<label class="radio-inline"> <input type="radio" name="addressIsDefault" value="1" ${getAddress.addressIsDefault == '1'?'checked="checked"':''}> Yes
			</label> <label class="radio-inline"> <input type="radio" name="addressIsDefault" value="0" ${getAddress.addressIsDefault == '0'?'checked="checked"':''}> No
			</label>
		</div>
	</div>
	<input type="submit" style="float: right;" value="提交" class="btn btn-primary" id="btn-edit-submit">
	<input type="reset" style="float: right;" class="btn btn-primary">
</form>
<script type="text/javascript">
$(document).ready(function(){
	$('#input-addressProviceCode').val($('#form_edit_province_id').val()); 
});
</script>
