function fnsignin() {
    var oUname = document.getElementById("uname")
    var oUpass = document.getElementById("upass")
    var oError = document.getElementById("error_box")
    var isError = true;
    if (oUname.value.length > 20 || oUname.value.length < 6) {
        oError.innerHTML = "Please enter 6 to 20 length of Username";
        isError = false;
  return;
 }
    else if((oUname.value.charCodeAt(0)>=48) && (oUname.value.charCodeAt(0)<=57)){
        oError.innerHTML = "It should be uppercase";
  return;
 }
    else for(var i=0;i<oUname.value.charCodeAt(i);i++){
  
        if((oUname.value.charCodeAt(i)<48)||(oUname.value.charCodeAt(i)>57) && (oUname.value.charCodeAt(i)<97)||(oUname.value.charCodeAt(i)>122)){
        oError.innerHTML = "Must be numbers and letters";
   return;
  }
 }
    if (oUpass.value.length > 20 || oUpass.value.length < 6) {
        oError.innerHTML = " Please enter 6 to 20 numbers and letters"
        isError = false;
        return;
 }
    window.alert("Success!")
}
