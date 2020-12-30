$(document).ready(function() {
	$('#headerRegisterId').off('click').on('click',function(){
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
	$('#HeaderAllCatalogueId,#megamenuId').off('mouseout').on('mouseout',function(){
		$('#megamenuId').attr("style","display:none");
	});
	$('#HeaderAllCatalogueId,#megamenuId').off('mouseover').on('mouseover',function(){
		$('#megamenuId').attr("style","display:true");
	});
});	