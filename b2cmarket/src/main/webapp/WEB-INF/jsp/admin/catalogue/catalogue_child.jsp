<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${!empty getListByParent}">
	<br>
		子标签ID：
		<select id="${childSelectId}">

		<option value="-2">请选择父标签ID</option>
		<c:forEach items="${getListByParent}" var="catalogue">
			<c:if test="${catalogue.activeFlag==1}">
				<option value="${catalogue.rowId}">${catalogue.catalogueName}</option>
			</c:if>
		</c:forEach>
	</select>
	<span class="childContainerTest"></span>
	<font id="childContainerInfoId" class="childContainerInfoClass"></font>
</c:if>
<c:if test="${empty getListByParent}">
已经是最底部目录
</c:if>