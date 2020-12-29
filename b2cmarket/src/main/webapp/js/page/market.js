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
	$('#HeaderAllCatalogueId').off('mouseout').on('mouseout',function(){
		$('.item-vertical').attr("style","display:none");
	});
	$('#HeaderAllCatalogueId').off('mouseover').on('mouseover',function(){
		$('.item-vertical').attr("style","display:true");
	});
});	