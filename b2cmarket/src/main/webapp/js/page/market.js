$(document).ready(function() {
	$(document).off('click','#headerRegisterId,#loginContinueId').on('click','#headerRegisterId,#loginContinueId',function(){
		console.log('headerRegisterId');
		$.ajax({
			url:'register',
			type:'get',
			success:function(data){
				if(data){
					$('#marketMainContainerId').html(data);
				}
			}
		});
		return false;
	});
	$('#headerLoginId').off('click').on('click',function(){
		console.log('hreaderLoginId');
		$.ajax({
			url:'login',
			type:'get',
			success:function(data){
				if(data){
					$('#marketMainContainerId').html(data);
				}
			}
		});
		return false;
	});
	$('#header-wishlist-id').off('click').on('click',function(){
		console.log("header-wishlist-id");	
		$.ajax({
			url:$(this).attr('href'),
			type:'get',
			success:function(data){
				if(data){
					$('#marketMainContainerId').html(data);
				}
			}
		});
		return false;
	});
	$('#userLoginStateNameId').off('click').on('click',function(){
		console.log('userLoginStateNameId');
		console.log($('#userLoginRowId').val());
		$.ajax({
			url:'myAccount',
			type:'get',
			data:{rowId:$('#userLoginRowId').val()},
			success:function(data){
				if(data){
					$('#marketMainContainerId').html(data);
				}
			}
		});
		return false;
	});
	$('#headerCatagoryId').off('click').on('click',function(){
		console.log('headerCatagoryId');
		$.ajax({
			url:'category',
			type:'get',
			success:function(data){
				if(data){
					$('#marketMainContainerId').html(data);
				}
			}
		});
		return false;
	});
	
	$(document).off('click','#goProductId').on('click','#goProductId',function(){
		console.log('goProductId'+href);
		var href=$(this).attr('href');
		$.ajax({
			url:href,
			type:'get',
			success:function(data){
				if(data){
					$('#marketMainContainerId').html(data);
				}
			}
		});
		return false;
	});
	$('#megamenuId').attr("style","display:none");
	$('#HeaderAllCatalogueId,#megamenuId').off('mouseout').on('mouseout',function(){
		$('#megamenuId').attr("style","display:none");
	});
	$('#HeaderAllCatalogueId,#megamenuId').off('mouseover').on('mouseover',function(){
		$('#megamenuId').attr("style","display:true");
	});
	
	
});	