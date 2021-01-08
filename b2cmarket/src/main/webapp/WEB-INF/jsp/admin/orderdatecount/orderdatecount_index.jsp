<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="searchForm">
<input type="hidden" id="urlHidden" value="orderdatecount">
年：<select name="yearData" id="year-data-id">
<option value="">请选择年</option>
<c:if test="${!empty yearDataList}">
	<c:forEach items="${yearDataList}" var="yearData">
	<option value="${yearData}">${yearData}</option>
	</c:forEach>
	</c:if>

</select>
月：<select name="monthData" id="month-data-id">
<option value="">请选择月</option>
</select>
<input type="button" value="查询" id="btn_search">
<input type="reset" >
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
				console.log(data);
				$('#tbody_container').html(data);
			}
		})
	}
});

</script>