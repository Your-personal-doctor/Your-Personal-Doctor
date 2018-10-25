<%-- 
    Document   : ChoiceDoct
    Created on : 2018-10-6, 21:27:12
    Author     : mengmeng liu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/ChoiceDoc.css" type="text/css">
        <jsp:include page="sub_elements/common_source.jsp"></jsp:include>
        <title>DisplayDoctor</title>
    </head>
    <body>
        <div class="mainDisplay">	
	<img class="displayimg" scr="显示图片从数据库">
	<div class="name">
 </div>
 <div class="personalInfor">
 </div>
 <form>
 <button type="submit">Connect</button>
 out.print(
 <%--$(document).ready(function(){ $(#id).load(.jsp); });--%>
 </form>
  </div>
    </body>
</html>
