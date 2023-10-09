$(function(){

$("#query").click(function(){
	var stuNianji = $("#stuNianji").val();
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/xuTest6",
		data:{stuNianji:stuNianji},
		success:function(res){
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

$("#delete").click(function(){
	var stuName = $("#stuName").val();
	var stuNianji = $("#stuNianji").val();
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/xuTest5",
		data:{stuName:stuName,stuNianji:stuNianji},
		success:function(res){
			$("#stuTable tbody").empty();
			$("#stuTable tbody").append('<th>ID</th><th>姓名</th><th>年级</th>');
		    $.each(res,function(index,obj){
		  	    $("#stuTable1").append('<tr><td>'+obj.id+'</td>'+'<td>'+obj.name+'</td>'+'<td>'+obj.nianji+'</td></tr>');
		    });
		},
		error:function(){
			alert("NG")
		}
	})

});

})
