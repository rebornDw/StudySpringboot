$(function(){



$("#query").click(function(){
	var stuName = $("#stuName").val();
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/test6",
		data:{name:stuName},
		success:function(res){
			alert("OK");
			$("#stuTable tbody").empty();
			$("#stuTable tbody").append('<th>ID</th><th>姓名</th><th>年级</th>');
		    $.each(res,function(index,obj){
		  	    $("#stuTable").append('<tr><td>'+obj.id+'</td>'+'<td>'+obj.name+'</td>'+'<td>'+obj.nianji+'</td></tr>');
		    });
		},
		error:function(){
			alert("NG")
		}
	})

});

})
