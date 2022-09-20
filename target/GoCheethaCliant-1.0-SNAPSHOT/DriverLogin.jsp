<%-- 
    Document   : DriverLogin
    Created on : Sep 20, 2022, 3:46:49 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="DriverLoginStyle.css"> 
    </head>
    <body>
        <section class="contact">
        <h1 class="heading">
            <span>D</span>
            <span>R</span>
            <span>I</span>
            <span>V</span>
            <span>E</span>
            <span>R</span>
            <br>
            <br>
            <span>L</span>
            <span>O</span>
            <span>G</span>
            <span>I</span>
            <span>N</span>
        </h1>
         <br> <br> <br> <br> <br> <br>
        <div class="row">
            <div class="image">
                <img src="images/driverLogin.jpg" alt="">
            </div>
    
            <form action="DriverLoginServlt" method="Post">
                <div class="inputBox">
                    <input type="text" placeholder="driver name" name="name" style="margin: auto" required >
                </div>
                 <br>
               <div class="inputBox">
                <input type="text" placeholder="Phone" name="phone" style="margin: auto" required>
                </div>
                <input style="margin-left:16.5rem " type="submit" class="btnB" value="Login"  >
            </form>
    
        </div>
    
    </section> 
    </body>
</html>
