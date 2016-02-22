$(document).ready(function() {

	$('.loginmodal-submit').click(function() {

		var data = {},
			email = $('#email').val(),
		    password = $('#password').val();

		if (Validate(email) && Validate(password)) {

				data.email = email;
                data.password = password;

              jQuery.ajax({
                    type: "GET",
                    url: "../users",
                    data: data,
                    success: function(data) {     
                    	alert(data);
                        document.getElementById("loginForm").reset();
                    },
                });       
		}});

	var Validate = function(input) {
		return (input !== null && input !== '');
	};
});