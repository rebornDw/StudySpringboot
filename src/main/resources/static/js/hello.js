$(function () {
    inputSubmit();
})

function inputSubmit() {
    $("#submit1").click(function () {
        var data1 = $("#input1").val();
        ajaxForm({ data: data1 });
    });

    $("#submit2").click(function () {
        var data2 = $("#dropdown option:selected").val();
        ajaxForm({ data: data2 });
    });

    $("#submit3").click(function () {
        var data3 = $("input[name='number1']:checked");
        var data4 = [];
        for (var i = 0; i < data3.length; i++) {
            data4.push(data3[i].value);
        }
        ajaxJson({ data: data4 });
    });

    $("#upload").click(function () {
        var image = $("#imageFile")[0].files[0];
        var reader = new FileReader();
        reader.readAsDataURL(image);
        reader.onload = function (e) {
            $("img").attr("src", this.result);
            ajaxForm({ data: this.result });
        }
    })
}

function ajaxForm(data) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/hello1",
        data: data,
        success: function (res) {
            console.log(res);
            alert(res);
        },
        error: function () {
            alert("NG");
        }
    })
}

function ajaxJson(data) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/hello2",
        data: JSON.stringify(data),
        dataType: 'json',
        contentType: "application/json;charset=UTF-8",
        success: function (res) {
            console.log(res);
            alert(res);
        },
        error: function () {
            alert("NG");
        }
    })
}