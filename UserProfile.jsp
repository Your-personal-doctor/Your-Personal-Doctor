<%-- 
    Document   : UserProfile
    Created on : 2018-10-6, 16:17:41
    Author     : mengmeng liu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/Profile.css" type="text/css">
        
            <title>Account</title>
        </head>
        <body>
      <div class="mainMenu">	
	<ul>
 	<li><a href="account">Account</a></li>		
 	<li><a href="profile">Profile</a></li>	
 	<li><a href="payment">Payment</a></li>		
 	<li><a href="setting">Setting</a></li>	
	<div class= "backfromAcc" onclick="window.open('index.jsp')">Back</div>
	</ul>
	</div>
	<div class="Content-Main">        
	<form  action="UpdateInfo" method="post">     
	<h1>Profile</h1>                       
	<div class="upload-img">
    <input id="img-upload" type="file" name="img" accept="image/*">
    <img id="img-show" src="PIC/baby.png" class="img-polaroid" width="150" height="150" alt="upload-img">  
    </div>
        <label>             
	<span>Your UID:</span>      
	<input type="text" readonly="readonly"   value="">    
	</label>
	<label>             
	<span>Your First Name:</span>      
	<input type="text"  name="Fname" >    
	</label>
	<label>             
	<span>Your Middle Name:</span>      
	<input type="text"  name="Mname" >    
	</label>  
	<label>             
	<span>Your Last Name:</span>      
	<input type="text"  name="Lname" >    
	</label>  
	<label>             
	<span>Your Age:</span>      
	<input type="text"  name="age" >    
	</label>
	<label class="Main-sex">      
	<span>Your sex:</span>          
	<input type="checkbox" class="man">male      
	<input type="checkbox" class="women">female          
	</label>               
	<label>                  
	<span>Your email :</span>      
	<input type="email" name="email" >      
	</label>    
	<label>      
	<span>Your phone:</span>    
	<input type="text" name="phone" >     
	</label>     
	<label>                
	<span>Message:</span>       
	<textarea id="message" name="message" ></textarea>      
	</label>         
	<button>Submit</button>
	</form>  
	</div>
    </body>
</html>
