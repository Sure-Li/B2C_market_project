<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:if test="${!empty orderList}">
<input type="hidden" value="${orderList}" id="order-data-count-data-id">
	<c:forEach items="${orderList}" var="order">
		<c:if test="${order.activeFlag==1}">
			<tr>
				<td>${order.orderCode}</td>
				<td>${order.userId}</td>
				<td>${order.priceSum}</td>
				<td>${order.addressId}</td>
				<td><c:if test="${order.orderState==1}">
													代付款
											        </c:if>
												<c:if test="${order.orderState==2}">
													待发货
												</c:if>
												<c:if test="${order.orderState==3}">
											                        待收货
												</c:if>
												<c:if test="${order.orderState==4}">
													待评价
												</c:if>
												<c:if test="${order.orderState==5}">
													订单完成
												</c:if>
												</td>
				<td>${order.orderPayMethod}</td>
				<td>
				<c:if test="${order.orderState==2}">
				<a href="order/delivergoods/${order.rowId}" id="btn-order-delivergoods">发货</a>
				</c:if>
				<%-- <c:if test="${order.orderState==5}">
				<a href="order/evaluateuser/${order.rowId}" id="btn-order-evaluateuser">评价用户</a>
				</c:if> --%>
				<a href="order/edit/${order.rowId}" id="btn-edit">修改</a>
				<a href="order/delete/${order.rowId}" id="btn-delete">删除</a></td>
			</tr>
		</c:if>
	</c:forEach>
</c:if>
<c:if test="${empty orderList}">
<h1 style="color: red;">暂无数据</h1>
</c:if>
<script type="text/javascript">
$(document).ready(function(){
	console.log('123213123');
	$(document).off('click','#btn-order-delivergoods').on('click','#btn-order-delivergoods',function(){
		console.log($(this).attr('href'));
		$.ajax({
			type : 'post',
			url : $(this).attr('href'),
			success : function(data) {
				console.log(data);
				if (data) {
					initListData();
				}
			}
		});
		return false;
	});
	/* $('#btn-order-evaluateuser').off('click').on('click',function(){
		console.log($(this).attr('href'));
		$.ajax({
			type : 'post',
			url : $(this).attr('href'),
			success : function(data) {
				console.log(data);
				if (data) {
					initListData();
				}
			}
		});
		return false;
	}); */
	function initListData(){
		$.ajax({
			url:$('#urlHidden').val()+'/list',
			type:'get',
			dataType:'html',
			data:$('#searchForm').serialize(),//将多条件查询表单
			success:function(data){
				$('#tbody_container').html(data);
			}
		});
	}
});
</script>
<script type="text/javascript" src="js/chartjs/dist/Chart.min.js"></script>
<script type="text/javascript">
var ctx = document.getElementById('myChart').getContext('2d');
var test_chart = new Chart(ctx, {
    // 要创建的图表类型
    type: 'line',

    // 数据集
    data: {
        labels: $('#order-data-count-data-id').val()/* ["January", "February", "March", "April", "May", "June", "July"] */,
        datasets: [{
            label: "My First dataset",
            backgroundColor: 'rgb(255, 99, 132)',
            borderColor: 'rgb(255, 99, 132)',
            /* data: [0, 10, 5, 2, 20, 30, 45], */
        }]
    },

    // 配置选项
    options: {}
});
var datas = [23,10,5,22,20,30,1000,5,6,6,7,8,9];
$.each(datas,function(index,obj){
	console.log(obj);
	test_chart.data.datasets[0].data[index] = obj;
});
test_chart.update();
$('#myChart').attr('style',"width: 50%;height: 80%;float: right")

</script>