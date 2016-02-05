<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.error {
	background: url(http://img.517na.com/common/automation/img/eorr.jpg)
		no-repeat;
	height: 250px;
	width: 450px;
	margin: 50px auto;
}

.error div {
	padding-left: 120px;
	padding-top: 35px;
	font-family: "微软雅黑";
	font-size: 14px;
}

.error div b {
	font-size: 32px;
	color: #42D9FF;
	font-weight: normal;
}

.error div em {
	font-size: 10px;
	color: #999;
	font-style: normal;
}
</style>
<title>出错啦！</title>
</head>
<body>
	<div class="error">
		<div>
			<b>风速过大，出错啦！</b><br /> <span>错误信息 ${error}</span><br /> <em>${exceptionID}</em><br />
			<em>${trackID}</em>
		</div>
	</div>
</body>
</html>