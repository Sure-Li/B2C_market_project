<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<canvas id="myChart"></canvas>
</body>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="js/chartjs/dist/Chart.min.js"></script>
<script type="text/javascript">
var ctx = document.getElementById('myChart').getContext('2d');
var test_chart = new Chart(ctx, {
    // 要创建的图表类型
    type: 'line',

    // 数据集
    data: {
        labels: ["January", "February", "March", "April", "May", "June", "July"],
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
var datas = [23,10,5,22,20,30,1000];
$.each(datas,function(index,obj){
	console.log(obj);
	test_chart.data.datasets[0].data[index] = obj;
});
test_chart.update();


</script>
</html>