<%-- 
    Document   : login_doctor
    Created on : 2018-9-29, 15:26:56
    Author     : Yi Qiu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to YPD--</title>
        <jsp:include page="sub_elements/common_source.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="sub_elements/header.jsp"></jsp:include>
            <div class="Main">
                <div class="login-theme">
                    <div class="login-warpper">
                        <!--SignIn-->
                        <input type="radio" name="tab-signIn" class="tab-tab" id="tab-tab-1" checked>
                        <label for="tab-tab-1" class="tab-label-SI">Sign In</label>
                        <div class="tab-content-SU">
                            
                        </div>
                        <!--SignUp-->
                        <input type="radio" name="tab-signUp" class="tab-tab" id="tab-tab-2" checked>
                        <label for="tab-tab-2" class="tab-label-SU">Sign Up</label>
                        <div class="tab-content-SU">
                            
                        </div>
                    </div>    
                </div>
            </div>
        <jsp:include page="sub_elements/footer.jsp"></jsp:include>
    </body>
</html>
