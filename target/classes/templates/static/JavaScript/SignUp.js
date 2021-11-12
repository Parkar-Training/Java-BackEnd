//const form = document.getElementById('SignUpForm');
//form.addEventListener('submit',userReg);
//console.log("Inside Script");
  function userReg() {
	var name=document.getElementById('Name').value;
	console.log("1");
	var mob = document.getElementById('mobilenumber').value;
	console.log("2"+mob);
	var email = document.getElementById('Emailid').value;
	console.log("3");
	var pass = document.getElementById('inputpassword').value;
	console.log("4"+pass);
	var confpass = document.getElementById('ConfirmPassword').value;
	console.log("5");
	
	if(name=="")
	{
		console.log("6");
		alert("enter name");
	}
	else if(mob=="")
	{
		console.log("7");
		alert("enter mob_no.");
	}
	else if(email=="")
	{
		console.log("8");
		alert("enter email.");
	}
	else if(pass=="")
	{
		console.log("9");
		alert("enter pass.");
	}
	else if(confpass!= pass)
	{
		console.log("10");
		alert("password doesn't match'.");
	}
	else
	{
		console.log("11");
		var params={
			"name":name,
			"email" :email,
			"mob" : mob,
		   	"password" : pass,
		   	"created_at": "",
		   	"is_Private" : "0"
		   };
		var urlString = "http://127.0.0.1:8080/process_register";
    console.log("12");
		console.log(params);
    $.ajax({method:"POST" , url: urlString, data:JSON.stringify(params) , contentType:"application/json" ,timeout:6000, dataType : 'json', mode:"no-cors",success:
    function (data) {// success callback function
    console.log(data);
            	window.location = "/SignUp_OTP";
			
    },
    error: function (data,status) {// success callback function
            //alert(JSON.stringify(data)+" -> "+status);
    			window.location = "/SignUp_OTP";
	
            /*if(data.responseText=="Success")
            {
				window.location.url = "SignUp_OTP";
			}*/
    }
    });
    //console.log("14");	
	}
	function successFunction(response)
	{
		console.log(response);
		
      alert(JSON.stringify(response));
	}
    
      
  }
  
  
  function onlyNumberKey(evt){
		var code = (evt.which) ? evt.which : evt.keyCode
			if(code>31 && (code<48 || code>57))
				return false;
			return true;
}
