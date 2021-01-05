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
	$(document).off('click','#btn-view-cart-id').on('click','#btn-view-cart-id', function() {
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
	
	$(document).off('click','#btn-checkout-id').on('click','#btn-checkout-id', function() {
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
	
	$('#span-cart-incon-id').off('mouseenter').on('mouseenter', function() {
		$.ajax({
			url:'user/showUserCart',
			type:'get',
			success:function(data){
				$('#tbody-cart-show-id').html(data);
			}
		});
	});

});	