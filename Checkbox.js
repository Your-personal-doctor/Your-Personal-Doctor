function checkbox(){
		$("#form1").submit(function(){
			var username=$("#username").val();//get the value 
			if(username.length==0){// to check the name is not null
				$("#usernameError").html("Please enter the username");
				return false;
			}
			
			//password cannot be null
			var password=$("#password").val();//get the password value 
			if(password.length==0){
				$("#passwordError").html("Please enter the password");
				return false;
			}
			
			//check the password
			var repasswd=$("#repasswd").val();//get the password value 
			if(repasswd.length==0){
				$("#repasswdError").html("Please re-type the password");
				return false;
			}
			
			if(password!=repasswd){
				$("#repasswdError").html("The password is different");
				return false;
			}
		});
	
	};

