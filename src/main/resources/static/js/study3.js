$(function(){

$("#query").click(function(){
	var stuId = $("#id").val();
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/study0923",
		data:{id:stuId},
		success:function(res){
			$("#stuTable tbody").empty();
			$("#stuTable tbody").append('<th>ID</th><th>姓名</th><th>性别</th><th>年龄</th><th>年级</th>');
		    $.each(res,function(index,obj){
				console.log(obj);
		  	    $("#stuTable").append('<tr><td>'+obj.id+'</td>'+'<td>'+obj.name+'</td>'+'<td>'+obj.sex+'</td>'+'<td>'+obj.age+'</td>'+'<td>'+obj.nianji+'</td></tr>');
		    });
		},
		error:function(){
			alert("NG")
		}
	})

});


$("#update").click(function(){
	var stuId = $("#id").val();
	var stuNianji = $("#stuNianji").val();              
                                              
	$.ajax({
		type:'POST',
		url:"http://localhost:8080/update0923",
		data:{nianji:stuNianji,id:stuId},
		success:function(res){
			$("#stuTable tbody").empty();
			$("#stuTable tbody").append('<th>ID</th><th>姓名</th><th>性别</th><th>年龄</th><th>年级</th>');
		    $.each(res,function(index,obj){
				console.log(obj);
		  	    $("#stuTable").append('<tr><td>'+obj.id+'</td>'+'<td>'+obj.name+'</td>'+'<td>'+obj.sex+'</td>'+'<td>'+obj.age+'</td>'+'<td>'+obj.nianji+'</td></tr>');
		    });
		},
		error:function(){
			alert("NG")
		}
	})

});


})