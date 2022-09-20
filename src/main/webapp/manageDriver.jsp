<%-- 
    Document   : manageDriver
    Created on : Sep 15, 2022, 1:32:38 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="manageDriver.css"> 
    </head>
    <body>
        <h1 class="heading">
            <span>M</span>
            <span>A</span>
            <span>N</span>
            <span>A</span>
            <span>G</span>
            <span>E</span>
            <span>D</span>
            <span>R</span>
            <span>I</span>
            <span>V</span>
            <span>E</span>
            <span>R</span>
        </h1>
       <div id="container">
        <div class="form-wrap">
            <h1>Manage Driver</h1>
         
            <form method="post" name="form">
                <div class="form-group">
                    <label for="id">Id</label>
                    <input type="text" name="id" >
                </div>
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" name="name" >
                </div>
                <div class="form-group">
                    <label for="age">Age</label>
                    <input type="text" name="age" >
                </div>
                <div class="form-group">
                    <label for="branch">Branch</label>
                    <input type="text" name="branch" >
                </div>
                <div class="form-group">
                    <label for="phone">Phone Number</label>
                    <input type="text" name="phone"  >
                </div>
              
                
                <button type="submit" formaction="DriverRegister">Add Driver</button>
               
                 <button type="submit" formaction="DriverUpdateServlet">Update Driver</button>
                 <button type="submit" formaction="deleteDriverServlet">Delete Driver</button>
        
                 
            </form>
    

            
        </div>

    </div>
                
        
    </body>
</html>
