<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>行业列表</title>
	</head>
	<body> 	
		行业列表：
		<table width="100%" border=1>
		<tr>
			<td>序号</td>
			<td>行业id</td>
			<td>行业名称</td>
			<td>操作</td>
		</tr>
			<c:forEach items="${list}" var="item" varStatus="v">
				<tr>
					<td>${v.count}</td>
					<td>${item.industryId }</td>
					<td>${item.industryName }</td>
					<td><a href="${pageContext.request.contextPath }/queryIndustryList.action?id=${item.industryId}">修改</a></td>
				</tr>
			</c:forEach>
	
	</table>
	
	</body>
</html>