$(document).ready(function(){
	$('body').on('click','.editarProducto',function(){
		//$('#id').val($(this).attr('id'));
		document.getElementById("categoria.id").value = $(this).attr('param1');
		$('#id').val($(this).attr('id'));
		$('#nombre').val($(this).attr('param2'));
		$('#precio').val($(this).attr('param3'));
	})
	
});