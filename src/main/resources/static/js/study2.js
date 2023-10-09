$(function(){

$("#query").click(function(){
	var stuNianji = $("#stuNianji").val();
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/study09",
		data:{nianji:stuNianji},
		success:function(res){
			$("#stuTable tbody").empty();
			$("#stuTable tbody").append('<th>ID</th><th>姓名</th><th>性别</th><th>年龄</th><th>年级</th>');
		    $.each(res,function(index,obj){
		  	    $("#stuTable").append('<tr><td>'+obj.id+'</td>'+'<td>'+obj.name+'</td>'+'<td>'+obj.sex+'</td>'+'<td>'+obj.age+'</td>'+'<td>'+obj.nianji+'</td></tr>');
		    });
		},
		error:function(){
			alert("NG")
		}
	})

});


$("#delete").click(function(){
	var stuNianji = $("#stuNianji").val();
	var stuName = $("#stuName").val();
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/study10",
		data:{name:stuName,nianji:stuNianji},
		success:function(res){
			$("#stuTable tbody").empty();
			$("#stuTable tbody").append('<th>ID</th><th>姓名</th><th>性别</th><th>年龄</th><th>年级</th>');
		    $.each(res,function(index,obj){
		  	    $("#stuTable").append('<tr><td>'+obj.id+'</td>'+'<td>'+obj.name+'</td>'+'<td>'+obj.sex+'</td>'+'<td>'+obj.age+'</td>'+'<td>'+obj.nianji+'</td></tr>');
		    });
		},
		error:function(){
			alert("NG")
		}
	})

});


})
