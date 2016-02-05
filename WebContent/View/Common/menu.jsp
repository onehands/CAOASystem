<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%
    ApplicationContext context = WebApplicationContextUtils
					.getWebApplicationContext(request.getSession().getServletContext());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>左侧导航</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/menu.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/button.css" />
</head>
<%@ include file="head.jsp"%>
<body id="bg">

	<div class="main-left">

		<div class="leftsidebar_box">
			<div class="line"></div>
			<dl class="system_log">
				<dt onClick="changeImage()">
					资产系统<img
						src="<%=request.getContextPath()%>/images/left/select_xl01.png" />
				</dt>
				<dd>
					<a
						href="<%=request.getContextPath()%>/AssetsSystemManage/AssetsSystemManage"
						target="_self" class="Over">资产系统查询</a>
				</dd>
			</dl>

		</div>

	</div>

</body>
<%@ include file="footer.jsp"%>
</html>
