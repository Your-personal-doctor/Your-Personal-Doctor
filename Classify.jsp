<%-- 
    Document   : Classify
    Created on : 2018-10-6, 15:54:25
    Author     : mengmeng liu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/Classifycss.css" type="text/css">
        <jsp:include page="sub_elements/common_source.jsp"></jsp:include>
            <title>JSP Page</title>
        </head>
        <body>
        <jsp:include page="sub_elements/header.jsp"></jsp:include>
            <div class="headslider">
                <div class ="head" onclick="window.open('brain.html')">
                    <div class="headT" >Brain</div>
                    <span class="img1" style="background: url(PIC/brain-and-head.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('ent.html')">
                    <div class="headT">ENT</div>
                    <span class="img1" style="background: url( PIC/big-nose.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('internalmedicine.html')">
                    <div class="headT">Internal Medicine</div>
                    <span class="img1" style="background: url( PIC/oxygenation-of-lungs.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('surgery/html')">
                    <div class="headT">Surgery</div>
                    <span class="img1" style="background: url( PIC/scalpel.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('pediatrics.html')">
                    <div class="headT">Pediatrics</div>
                    <span class="img1" style="background: url( PIC/baby.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('infectiousdiseases.html')">
                    <div class="headT">Infectious Diseases</div>
                    <span class="img1" style="background: url( PIC/virus-molecule.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('obstetrics.html')">
                    <div class="headT">Obstetrics And Gynecology</div>
                    <span class="img1" style="background: url( PIC/uterus.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('psychosis.html')">
                    <div class="headT">Psychosis</div>
                    <span class="img1" style="background: url(PIC/brain-in-head.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('dermatology.html')">
                    <div class="headT">Dermatology & STD</div>
                    <span class="img1" style="background: url(PIC/epidermis.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('oncology.html')">
                    <div class="headT">Oncology</div>
                    <span class="img1" style="background: url( PIC/cancer.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('orthopedics.html')">
                    <div class="headT">Orthopedics</div>
                    <span class="img1" style="background: url( PIC/orthopedics.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
                <div class ="head" onclick="window.open('andrology.html')">
                    <div class="headT">Andrology</div>
                    <span class="img1" style="background: url(PIC/standing-up-man-.png)"></span>
                    <div class = "contact">Contact doctor</div>
                </div>
            </div>

        <jsp:include page="sub_elements/footer.jsp"></jsp:include>

    </body>
</html>
