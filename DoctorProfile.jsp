<%-- 
    Document   : DoctorProfile
    Created on : 2018-10-6, 16:26:42
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
        <div class="mainMenu">		
	<ul >
 	<li><a href="account">Account</a></li>		
 	<li><a href="profile">Profile</a></li>	
 	<li><a href="payment">Payment</a></li>		
 	<li><a href="setting">Setting</a></li>	
	<div class= "backfromAcc" onclick="window.open('index.jsp')">Back</div>
	</ul>
	</div>
	<div class="Content-Main">        
	<form  action="" method="post">     
	<h1>Profile</h1>                       
	<div class="upload-img">
    <input id="img-upload" type="file" name="img" accept="image/*">
    <img id="img-show" src="" class="img-polaroid" width="150" height="150" alt="upload-img"> 
    </div>
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
	<span>Your inaugural hospital:</span>    
	<input type="text" name="place" >     
	</label>
	<label>      
	<span>Your Position:</span>    
	<input type="text" name="position" >  
	</label>
	<label>      
	<span>Good At:</span>    
	<input type="text" name="Well" >  
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

