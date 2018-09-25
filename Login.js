/* data:9/25/2018 
author:jimmy 
login function
*/
function login() {
 
    var username = document.getElementById("username");
    var pass = document.getElementById("password");
 
    if (username.value == "") {
 
        alert("Enter Username");
 
    } else if (pass.value  == "") {
 
        alert("Enter the password");
 
    } else if(username.value == "ojbk" && pass.value == "123456"){
 
        window.location.href="pp.html";
 
    } else {
 
        alert("Incorrect Password or Username")
 
    }
}
function signin(){
    window.location.href="signin.html";
}
function cancel(){
    window.location.href="welcome.html";
}
