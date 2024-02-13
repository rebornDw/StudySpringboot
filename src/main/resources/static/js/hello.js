$(function () {
    btnEvent();
    inputSubmit();
})

//增删改查按钮事件
function btnEvent() {
    //添加数据
    $("#submitBtn").click(function () {
        var name = $("#name").val();
        var age = $("#age option:selected").val();
        var interest = $("input[name='interest']:checked");
        var iList = [];
        for (var i = 0; i < interest.length; i++) {
            iList.push(interest[i].value);
        }
        var data = {
            name: name,
            age: Number(age),
            interest: iList
        }
        ajaxForm(data, "sumitData");
    });

    //删除数据
    $("#idDelBtn").click(function () {
        var sid = $("#idDel").val();
        ajaxForm({ sid: sid }, "deleteData");
    });

    //修改姓名
    $("#nameUpdateBtn").click(function () {
        var sid = $("#idUpdate").val();
        var name = $("#nameUpdate").val();
        ajaxForm({ sid: sid, name: name }, "changeData");
    });

    //查询数据
    $("#nameSelectBtn").click(function () {
        var name = $("#nameSelect").val();
        ajaxForm({ name: name }, "searchData");
    });

}


function inputSubmit() {
    $("#submit1").click(function () {
        var data1 = $("#input1").val();
        ajaxForm({ data: data1 }, "hello1");
    });

    $("#submit2").click(function () {
        var data2 = $("#dropdown option:selected").val();
        ajaxForm({ data: data2 }, "hello1");
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
            ajaxForm({ data: this.result }, "hello1");
        }
    })
}

function ajaxForm(data, url) {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/" + url,
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