<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="searchForm">
<input type="hidden" id="urlHidden" value="orderdatecount">
年：<select name="yearData" id="year-data-id">
<option value="-1">全部数据</option>
<c:if test="${!empty yearDataList}">
	<c:forEach items="${yearDataList}" var="yearData">
	<option value="${yearData}">${yearData}</option>
	</c:forEach>
	</c:if>

</select>
月：<select name="monthData" id="month-data-id">
<option value="-1">请先选择年</option>
</select>
</form>
<table style="width: 80%;height: 70%;">
<tbody id="tbody_container" style="display: true"></tbody>
</table>


<script type="text/javascript">
$(document).ready(function(){
	intidata();
	function intidata(){
		$.ajax({
			url:'orderdatecount/list',
			type:'get',
			success:function(data){
				$('#tbody_container').html(data);
			}
		})
	}
	$(document).off('change','#year-data-id').on('change','#year-data-id',function(){
		var year= $(this).val();
		console.log(year);
		if(year!=-1){
			$.ajax({
				url:'orderdatecount/list/'+year,
				type:'get',
				success:function(data){
					$('#tbody_container').html(data);
				}
			})
		}else{
			intidata();
		}
	});
	$(document).off('change','#month-data-id').on('change','#month-data-id',function(){
		var year= $('#year-data-id').val();
		var month= $(this).val();
		console.log(year);	
		if(month!=-1){
			$.ajax({
				url:'orderdatecount/list/'+year+'/'+month,
				type:'get',
				success:function(data){
					$('#tbody_container').html(data);
				}
			})
		}else{
			$.ajax({
				url:'orderdatecount/list/'+year,
				type:'get',
				success:function(data){
					$('#tbody_container').html(data);
				}
			})
		}
	});
});

</script>