function submitForm() {

	var imageInput = $("#imageInputAjax");
	// 获取上传的图片文件
	var file = imageInput[0].files[0];
	//jquery 获取值
	var formData = new FormData();
	
	formData.append("textInputAjax", $('#textInputAjax').val());
	formData.append("selectAjax", $('#selectAjax').val());
	formData.append("checkboxAjax1", $('#checkboxAjax1').val());
	formData.append("checkboxAjax2", $('#checkboxAjax2').val());
	formData.append("checkboxAjax3", $('#checkboxAjax3').val());
	formData.append("file", file);


	// 以DataURL形式读取图片内容
	$.ajax({
		type: 'POST',
		url: '/demo/submit',
		data: formData,
		processData: false,
		contentType: false,
		success: function(response) {
			console.log(response);
		},
		error: function(error) {
			console.error(error);
		}
	});
}


