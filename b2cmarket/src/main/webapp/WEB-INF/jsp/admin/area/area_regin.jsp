<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${!empty reginList}">
	<option value="">--- Please Select ---</option>
	<c:forEach items="${reginList}" var="regin">
		<c:if test="${regin.activeFlag==1}">
			<option value="${regin.areaCode}">${regin.areaName}</option>
		</c:if>
	</c:forEach>
</c:if>