<%-- 
    Document   : addVehicle
    Created on : Sep 15, 2022, 1:57:06 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="MangeVehicle.css"> 
    </head>
    <body>
        <h1 class="heading">
            <span>M</span>
            <span>A</span>
            <span>N</span>
            <span>A</span>
            <span>G</span>
            <span>E</span>
            <span>V</span>
            <span>E</span>
            <span>H</span>
            <span>I</span>
            <span>C</span>
            <span>L</span>
            <span>E</span>
        </h1>
         <div id="container">
        <div class="form-wrap">
            <h1>Manage Vehicle</h1>
         
            <form method="post">
                <div class="form-group">
                    <label for="id">Vehicle Id</label>
                    <input type="text" name="id" id="id" >
                </div>
                <div class="form-group">
                    <label for="vehicle-No">Vehicle No</label>
                    <input type="text" name="vno" id="No" >
                </div>
                <div class="form-group">
                    <label for="Vtype">Vehicle Type</label>
                    <input type="text" name="type" id="Type" >
                </div>
                
                <button type="submit" formaction="addVehicleServlet">Add Vehicle</button>
                <button type="submit" formaction="updateVehicleServlet">Update Vehicle</button>
                <button type="submit" formaction="deleteVehicleServlet">Delete Vehicle</button>
 
            </form>
        </div>

    </div>
    </body>
</html>
