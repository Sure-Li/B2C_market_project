$(document).ready(function() {
	initUserLoginState();
	function initUserLoginState() {
		var userLoginName = $('#userLoginName').val();
		if (userLoginName != "") {
			$('#showLoginUlId').html("<li class='log login'><i class='fa fa-lock'></i><a class='link-lg' href='JavaScript:;' id='userLoginStateNameId'>" + "\t" + userLoginName + "\t" + "</a><a class='link-lg' href='JavaScript:;' id='userLoginStateExitId'>退出</a></li>");
		} else {
			console.log("2222")
		}
	}
	$('#showLoginUlId').off('click', '#userLoginStateExitId').on('click', '#userLoginStateExitId', function() {
		console.log("('click','userLoginStateExitId')");
		$.ajax({
			url:'user/exit',
			type:'get',
			success:function(date){
				if(date){
					location.href='index';
				}
			}
		});
	});
});	