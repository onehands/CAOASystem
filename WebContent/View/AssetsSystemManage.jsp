<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AssetsSystemManage</title>
</head>
<body>
	<%@ include file="Common/menu.jsp"%>
	<div>
		<input type="button" class="button button-blue" value="导入" id="importButon" lang="1000"/>
	</div>


	<div id="formDiv" style="display: none">
		<form id="uploadForm" method="post" enctype="multipart/form-data"
			target="hidFrame"
			action="<%=request.getContextPath()%>/AssetsSystemImport/Import">
			<iframe id="hidFrame" name="hidFrame" style='display: none'></iframe>
			<dl class="dl-horizontal " style="position: relative;">
				<dt>
					<b class="red">*</b>上传Excel：
				</dt>
				<dd>
					<input type="file" accept=".xls,.xlsx,.csv" id="file" name="file" class="file"/>
				<dt>&nbsp;</dt>
			</dl>
			<div class="btn-area">
				<button type="button"  id="import" class="button button-blue">确 定</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" onClick="history.back()" class="button button-blue"> 返
					回</button>
			</div>
		</form>
	</div>
	<table>
		<thead>
			<tr>
				<th width="5%" class="text-center">数据日期</th>
				<th width="3%" class="text-center">序号</th>
				<th width="5%" class="text-center">实物编号</th>
				<th width="5%" class="text-center">资产编号</th>
				<th width="5%" class="text-center">设备名称</th>
				<th width="5%" class="text-center">规格型号</th>
				<th width="5%" class="text-center">设备状态</th>
				<th width="5%" class="text-center">采购单位</th>
				<th width="6%" class="text-center">实物负责人</th>
				<th width="7%" class="text-center">实物交付日期</th>
				<th width="5%" class="text-center">采购单价</th>
				<th width="5%" class="text-center">帐面净值</th>
				<th width="3%" class="text-center">残值</th>
				<th width="8%" class="text-center">财务转固日期</th>
				<th width="5%" class="text-center">验货日期</th>
				<th width="8%" class="text-center">资产管理模式</th>
				<th width="2%" class="text-center">品牌</th>
				<th width="3%" class="text-center">序列号</th>
				<th width="4%" class="text-center">制造商</th>
				<th width="5%" class="text-center">存放地点</th>
				<th width="8%" class="text-center">现行实物标签号</th>
				<th width="6%" class="text-center">备注及说明</th>

			</tr>
		</thead>
		<tbody></tbody>
	</table>


</body>

</html>