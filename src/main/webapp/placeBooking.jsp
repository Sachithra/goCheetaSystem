<%-- 
    Document   : placeBooking
    Created on : Sep 18, 2022, 12:52:48 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="bookingStyle.css"> 

    </head>
    <body>
          <body>
        <section class="search" id="section--3">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
      
            
            <form class="formbooking" action="searchServlet" method="post">
                    <div class="searchHead">
                    <h3>SEARCH VEHICLE </h3>
                    </div>
                    <div>
                        <input type="text" placeholder="SEARCH"  class="srchinput" name="type" value="${bd.type}"> 
                    </div>  
                    <br>
                    <div class="btn">
                    <button type="submit" class="searchbtn"> Search</button>
                    </div>
                       
    <div class="table-wrapper">
    <table class="fl-table" action="searchServlet">
        <thead>
        <tr>
            <th>Driver</th>
            <th>Branch</th>
            <th>Type</th>
        
           
        </tr>
        </thead>
        <tbody>
        <tr>
            <td name="name">${bd.name}</td>
            <td name="branch">${bd.branch}</td>
            <td name="type">${bd.type}</td>
           
            <td><a class="bookbtn"  href="#section--2">Book</a></td>
        </tr>
        <tr>
            <td name="name">${bd.name}</td>
            <td name="branch">${bd.branch}</td>
            <td name="type">${bd.type}</td>
                      
            <td><a class="bookbtn"  href="#section--2">Book</a></td>
        </tr> 
    </table>
</div>                   
 </form>  
 </section>
            <br>  <br>  <br>   <br>  <br>  <br>
         <section class="book" id="BOOK">
        <h1 class="heading">
            <span>B</span>
            <span>O</span>
            <span>O</span>
            <span>K</span>
            <span class="space"></span>
            <span>N</span>
            <span>O</span>
            <span>W</span>
        </h1>
        <div class="row">
            <div class="image">
                <img src="images/book.jpg" alt="">
            </div>
            <form action="bookingServlet" method="post">
                <div class="inputBox">
                    <h3>Pick Up</h3>
                    <input type="text" placeholder="place name"name="pick" required>
                </div>
                <div class="inputBox">
                    <h3>Drop </h3>
                  <input type="text" placeholder="place name"name="drop" required >
                </div>
    
        <input type="submit" class="btnB" value="book now">
        </form>
        </div>
    
    </section>
    </body>
</html>
