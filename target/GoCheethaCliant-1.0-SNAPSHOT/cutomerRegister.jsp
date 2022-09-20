<%-- 
    Document   : cutomerRegister
    Created on : Sep 13, 2022, 1:24:19 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CustomerRegiStyle.css"> 
        
    </head>
    <body>
        <h1 class="heading">
            <span>R</span>
            <span>E</span>
            <span>G</span>
            <span>I</span>
            <span>S</span>
            <span>T</span>
            <span>E</span>
            <span>R</span>
        </h1>
        <div id="container">
        <div class="form-wrap">
          
            <p>It's Free and Only takes a minute</p>
            <form action="CustomerRegisterServlet" method="post">
                <div class="form-group">
                    <label for="id">Id</label>
                    <input type="text" name="id" id="Id" required>
                </div>
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" name="name" id="name" required>
                </div>
                <div class="form-group">
                    <label for="Phone">Phone Number</label>
                    <input type="text" name="phone" id="email" required>
                </div>
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" name="username" id="username" required>
                </div>
                <div class="form-group">
                    <label for="cpass">password</label>
                    <input type="password" name="password" id="Password" required>
                </div>
                <button type="submit">Register</button>
                <div class="footer">
                    <p>Already Have an Account? <a href="#">Login Here</a></p>
                </div>
            </form>
        </div>

    </div>
    </body>
</html>
