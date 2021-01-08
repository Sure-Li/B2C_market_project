<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<option value="">请选择月</option>
<c:if test="${!empty monthDataList}">
	<c:forEach items="${monthDataList}" var="monthData">
	<option value="${monthData}">${monthData}</option>
	</c:forEach>
	</c:if>