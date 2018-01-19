$(document).ready(function() {
	$.ajax({
		url: "http://localhost:8080/test"
	}).then(function(data) {
          $('.result').append(data);
	});
}); 