$(document).ready(function() {

	$('.loginmodal-submit').click(function(event) {
		event.preventDefault();
		
		var data = {},
			email = $('#emailform').val(),
		    password = $('#password').val();

		if (Validate(email) && Validate(password)) {

				data.email = email;
                data.password = password;

              jQuery.ajax({
                    type: "GET",
                    url: "user/authenticate",
                    data: data,
                    success: function(data) {   
                    	alert(data);
                        document.getElementById("loginForm").reset();
                    },
                    error : function(e) {
                    	display(e);
                    }
                });       
		}});

	var Validate = function(input) {
		return (input !== null && input !== '');
	};
});