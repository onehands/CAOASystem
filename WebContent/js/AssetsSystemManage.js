$(document).ready(function() {

	$("#import").click(function() {
		var filePath = $("#file").val();
		var dotNdx = filePath.lastIndexOf('.');
		var extendName = filePath.slice(dotNdx + 1).toLowerCase();

		if (filePath === "" || filePath === null) {
			layer.alert("请选择上传文件");
			return false;
		}

		if ([ "xls", "xlsx", "csv" ].indexOf(extendName) === -1) {
			layer.alert("请选择正确格式的文件上传");
			return false;
		}
		layer.load(0, 2, true, "导入文件中...");
		$("#uploadForm").submit();
		return false;
	});

	$("#importButon").click(function() {
		layer.open({
		    type: 1,
		    area: ['360px', '250px'],
		    skin: 'layui-layer-rim', //加上边框
		    content: $("#formDiv")
		});
	});


});
