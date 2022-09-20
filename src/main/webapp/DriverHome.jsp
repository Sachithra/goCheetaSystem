<%-- 
    Document   : DriverHome
    Created on : Sep 20, 2022, 4:54:14 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="DriverHomeStyle.css"> 
    </head>
    <body >
        
         <h1 class="heading">
            <span>W</span>
            <span>E</span>
            <span>L</span>
            <span>L</span>
            <span>C</span>
            <span>O</span>
            <span>M</span>
            <span>E</span>
        </h1>
        
        
     <form class="formbooking" action="" method="post">
         <div class="searchHead">
        <h3>BOOKINGS </h3>
        </div>            
                       
    <div class="table-wrapper">
          
    <table class="fl-table" action="">
        <thead>
        <tr>
            <th>Pickup Location</th>
            <th>Drop Location</th>
        
        
           
        </tr>
        </thead>
        <tbody>
        <tr>
            <td name="name"></td>
            <td name="branch"></td>
          
           
            <td><a class="bookbtn">Accept</a></td>
        </tr>
        <tr>
            <td name="pickup"></td>
            <td name="drop"></td>
          
                      
            <td><a class="bookbtn">Accept</a></td>
        </tr> 
    </table>
</div>                   
 </form>  
    </body>
</html>
