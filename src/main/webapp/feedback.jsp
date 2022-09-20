<%-- 
    Document   : feedback
    Created on : Sep 14, 2022, 1:34:13 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="feedBacksStyle.css"> 
    </head>
    <body>
     <section class="contact">
        <h1 class="heading">
            <span>F</span>
            <span>E</span>
            <span>E</span>
            <span>D</span>
            <span>B</span>
            <span>A</span>
            <span>C</span>
            <span>K</span>
        </h1>
         <br> <br> <br> <br> <br> <br>
        <div class="row">
            <div class="image">
                <img src="images/feedback.jpg" alt="">
            </div>
    
            <form action="feedBackServlet" method="post">
                <div class="inputBox">
                    <input type="text" placeholder="driver name" name="name" required>
                </div>
                <textarea placeholder="message"  id="" cols="30" rows="10" name="msg" required></textarea>
                <input type="submit" class="btnB" value="send feedback">
    
    
            </form>
    
        </div>
    
    
    </section> 
        
       

    </body>
</html>
