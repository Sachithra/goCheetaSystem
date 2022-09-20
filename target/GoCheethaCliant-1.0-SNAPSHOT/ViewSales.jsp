<%-- 
    Document   : ViewSales
    Created on : Sep 18, 2022, 8:30:20 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="ViewSalesStyle.css"> 
    </head>
    <body>
      <section class="search" id="section--3">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
      
            
            <form class="formbooking" action="SalesServlet" method="post">
                    <div class="searchHead">
                    <h3>VIEW SALES </h3>
                    </div>
                    <div>
                        <input type="text" placeholder="SEARCH BRANCH"  class="srchinput" name="branch" value="${sale.branch}" required> 
                    </div>  
                    <br>
                    <div class="btn">
                    <button type="submit" class="searchbtn"> Search</button>
                    </div>
                       
    <div class="table-wrapper">
    <table class="fl-table" action="SalesServlet">
        <thead>
        <tr>
            <th>SALES</th>
            <th>BRANCH</th>
          
        </tr>
        </thead>
        <tbody>
        <tr>
            <td name="pick">${sale.pick}</td>
            <td name="branch">${sale.branch}</td>
        </tr>
        <tr>
            <td name="pick">${sale.pick}</td>
            <td name="brnch">${sale.branch}</td>
           
        </tr> 
    </table>
</div>                   
 </form>  
 </section>
    </body>
</html>
