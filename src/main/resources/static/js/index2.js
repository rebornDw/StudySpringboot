function submitForm() {
    var formData = {
        textInput: $('#textInput').val(),
        dropdown: $('#dropdown').val() 
    };
    console.log(JSON.stringify(formData)); 
    var imageInput = document.getElementById("imageInput");
    var imageContainer = document.getElementById("imageContainer");

    // 获取上传的图片文件
    var file = imageInput.files[0];

    // 使用FileReader读取文件内容
    var reader = new FileReader();

    reader.onload = function (e) {
        // 创建一个图片元素
        var img = document.createElement("img");
        
        // 设置图片的源为读取到的DataURL
        img.src = e.target.result;

        // 将图片添加到页面上
        imageContainer.innerHTML = "";
        imageContainer.appendChild(img);
    };
    // 以DataURL形式读取图片内容
    reader.readAsDataURL(file); 
    $.ajax({
        type: 'POST',
        url: '/demo/submit',
        contentType: 'application/json',
        data: JSON.stringify(formData),
        success: function(response) {
            console.log(response);
        },
        error: function(error) {
            console.error(error);
        }
    });
}


