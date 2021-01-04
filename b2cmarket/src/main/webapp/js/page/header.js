$(document).ready(function() {
	initUserLoginState();
	function initUserLoginState() {
		var userLoginName = $('#userLoginName').val();
		if (userLoginName != "") {
			$('#showLoginUlId').html("<li class='log login'><i class='fa fa-lock'></i><a class='link-lg' href='JavaScript:;' id='userLoginStateNameId'>" + "\t" + userLoginName + "\t" + "</a><a class='link-lg' href='JavaScript:;' id='userLoginStateExitId'>退出</a></li>");
		} else {
			console.log("2222")
		}
	};
	/*initCatalogue();
	function initCatalogue(){
		$.ajax({
			url:'index',
			type:'get',
			success:function(date){
				
			}
		});
	};*/
	$('#showLoginUlId').off('click', '#userLoginStateExitId').on('click', '#userLoginStateExitId', function() {
		console.log("('click','userLoginStateExitId')");
		$.ajax({
			url: 'user/exit',
			type: 'get',
			success: function(date) {
				if (date) {
					location.href = 'index';
				}
			}
		});
	});
	$('#btn-view-cart-id').off('click').on('click', function() {
		var href = $(this).attr('href');
		console.log(href);
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
	
	$('#btn-checkout-id').off('click').on('click', function() {
		var href = $(this).attr('href');
		console.log(href);
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

});	