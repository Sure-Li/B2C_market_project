<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<input type="hidden" class="orderDateCount-key-class" value=" ${keyString}">
<input type="hidden" class="orderDateCount-value-class" value=" ${valueString}">
<input type="hidden" class="orderDateCount-label-class" value=" ${labelString}">
<canvas id="myChart" style="width: 50%; height: 80%; float: right"></canvas>
<script type="text/javascript">
$(document).ready(function(){
	var keyArray = $('.orderDateCount-key-class').val().split(",");
	console.log($('.orderDateCount-key-class').val());
	var valueArray = $('.orderDateCount-value-class').val().split(",");
	var ctx = document.getElementById('myChart').getContext('2d');

	var test_chart = new Chart(
			ctx,
			{
				// 要创建的图表类型
				type : 'line',

				// 数据集
				data : {
					labels : keyArray/* ["January", "February", "March", "April", "May", "June", "July"] */,
					datasets : [ {
						label : $('.orderDateCount-label-class').val(),
						backgroundColor : 'rgb(255, 99, 132)',
						borderColor : 'rgb(255, 99, 132)',
						data : valueArray
					} ]
				},

				// 配置选项
				options : {}
			});
	$('#myChart').attr('style', "width: 80%;height: 90%");
	$('#year-data-id').off('change').on('change',function(){
		var year = $(this).val();
		$.ajax({
			url:'orderdatecount/getmonth',
			type:'get',
			data:{year:year},
			success:function(htmldata){
				$('#month-data-id').html(htmldata);
			}
		});
	});
});	
</script>