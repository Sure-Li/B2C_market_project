//建议写成文件 可以使用浏览器缓存
$(document).ready(function() {
	/*给页面左侧绑定点击事件*/
	$('.left').off('click', 'a').on('click', 'a', function() {
		var href = $(this).attr('href');
		console.log(href);
		/*ajax get data*/
		var layer_index = null;
		$.ajax({
			url: href,
			type: 'get',
			datetype: 'html',/*异步请求期望返回的数据格式 如果不写 ajax会自适应*/
			beforeSend: function() {/*请求完成之前*/
				layer_index = layer.load(1, {
					shade: [0.1, '#fff'] //0.1透明度的白色背景
				});
			},
			success: function(data) {
				/*console.log(data);*/
				$('#maindiv').html(data);
			},
			complete: function() {/*请求完成之后*/
				layer.close(layer_index);
			}
		});
		return false;
	});
	$('.left').find('a').get(0).click();//自动点击*/
	$('#btn_loginOut').off('click').on('click', function() {
		
		layer.alert('',{
                icon:2,
                area:['200px','200px'],
                title:'退出确认',
                content:'您确定要退出登陆吗？',
                closeBtn:2},
                function(index){
					$.ajax({
						url:'admindologinout',
						success:function(data){
							if(data==1){
								location.href="admin";
							}
						}
					});
                    layer.close(index);
                }); 
	});
	$(document).off('change','#chooseParentId').on('change','#chooseParentId',function(){
		var rowId = $(this).val();
		$('#catalogueParentId').val(rowId);
		console.log(rowId);
		$.ajax({
			url:'catalogue/makeChild/'+rowId,
			method:'get',
			success:function(data){
					if(data){
						$('.childContainer').html(data);
					}
				}
		})
	});
	$(document).off('change','#childSelectId').on('change','#childSelectId',function(){
		var rowId = $(this).val();
		var childContainer = '#childContainer'+rowId;
		console.log(childContainer);
		console.log(rowId);
		$(this).next('span').html("");
		$('.childContainerInfoClass').text('');
		$('#catalogueParentId').val(rowId);
		$.ajax({
			url:'catalogue/makeChild/'+rowId,
			method:'get',
			success:function(data){
				console.log($('.childContainerTest').size());
				console.log('data'+!data.match(".*已经是最底部目录.*"));
					if(!data.match(".*已经是最底部目录.*")){
						/*console.log('tset----------'+$(this).next('span'));*/
						/*$(this).next('span[class=childContainerTest]').html(data);*/
						/*console.log($(this).find('.class=childContainerTest'));*/
						$('span[class=childContainerTest]:last').html(data);
					}else{
						$('#childContainerInfoId').text('已经是最底部目录');
					}
				}
		})
	});
	
	$(document).off('click','#catalogueAddResetId').on('click','#catalogueAddResetId',function(){
		console.log("ysysysysy");
		$('.childContainer').html("");
		/*return false;*/
	});
});