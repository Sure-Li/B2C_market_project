<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${!empty cityList}">
	<option value="">--- Please Select ---</option>
	<c:forEach items="${cityList}" var="city">
		<c:if test="${city.activeFlag==1}">
			<option value="${city.areaCode}">${city.areaName}</option>
		</c:if>
	</c:forEach>
</c:if>