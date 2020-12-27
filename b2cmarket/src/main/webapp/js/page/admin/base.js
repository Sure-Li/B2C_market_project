$(document).ready(function(){
	var addIndex = null;
	var baseUrl = $('#urlHidden').val();
	//页面加载完成之后直接加载文件的数据
	initListData();
	//绑定查询数据
	$('#btn_search').off('click').on('click',function(){
		initListData();
	});
	$('#btn-add').off('click').on('click',function(){
		$.ajax({
			url:baseUrl+'/form',
			success:function(htmlData){
			addIndex = layer.open({
                    type:1,
                    title:"用户新增",
                    area:['500px','500px'],
                    content:htmlData,
					success:function(layero,index){
						bindFileUpload();
						bindSubmit();
					}
                }); 
			}
		});
	});
	function bindFileUpload(){
		//绑定异步上传文件 在外面直接绑定无法绑定
		$('#uploadFile').uploadifive({
	        'auto': true,
			'buttonText':'用户头像',
	        'fileObjName'     : 'userFile', 
	        'uploadScript'     : 'user/upload',//上传的url
	        'onUploadComplete' : function(file, data) {//上传成功后的回调
	        	console.log(data);
	        	$('#avatar').val(data);
	        	}
	    });
	}
	function bindSubmit(){
		$('#btn-add-submit').off('click').on('click',function(){
			$.ajax({
				type:'post',
				url:baseUrl,
				data:$('#form_add').serialize(),
				success:function(data){
					console.log(data);
					if(data){
						layer.close(addIndex);
						initListData();
					}
				}
			})
		});
		return false;
	}
	function initListData(){
		$.ajax({
			url:baseUrl+'/list',
			type:'get',
			dataType:'html',
			data:$('#searchForm').serialize(),//将多条件查询表单
			success:function(data){
				$('#tbody_container').html(data);
			}
		});
	}
	var editIndex = null;
	function bindEditSubmit(){
		$('#btn-edit-submit').off('click').on('click',function(){
			$.ajax({
				type:'post',
				url:baseUrl+'/doedit',
				data:$('#form_edit').serialize(),
				success:function(data){
					console.log(data);
					if(data){
						layer.close(editIndex);
						initListData();
					}
				}
			})
		});
		return false;
	}
	$(document).off('click','#btn-edit').on('click','#btn-edit',function(){
		console.log("btn-edit");
		var href = $(this).attr('href');
		console.log(href);
		$.ajax({
			url:href,
			type:'GET',
			success:function(result){
			editIndex=layer.open({
                    type:1,
                    title:"用户修改",
                    area:['500px','500px'],
                    content:result,
					success:function(data){
						bindFileUpload();
						console.log("bindEditSubmit();");
						bindEditSubmit();
					}
                }); 
			}
		});
		return false;
	});
	$(document).off('click','#btn-delete').on('click','#btn-delete',function(){
		console.log("btn-delete");
		var href = $(this).attr('href');
		console.log(href);
		layer.alert('',{
                icon:2,
                area:['200px','200px'],
                title:'退出删除',
                content:'您确定要删除吗？',
                closeBtn:1},
                function(index){
					$.ajax({
						url:href,
						method:'get',
						success:function(data){
							if(data==1){
								/*location.href="admin";*/
								initListData();
							}
						}
					});
                    layer.close(index);
                }); 
		return false;
	});
});