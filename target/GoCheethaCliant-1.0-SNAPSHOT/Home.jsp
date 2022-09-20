<%-- 
    Document   : Home
    Created on : Sep 12, 2022, 11:14:17 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="homeStyles.css"> 
    </head>
    <body>
  <header class="header">
      
     
 
  <div class="topnav">
    
   <ul class="nav__links">
  <a class="active" href="Home.jsp">Home</a>
  <a class="nav__link" href="#sectionAbout">About</a>
  <a class="nav__link" href="#section---2">Vehicles</a>
  </ul> 
  <a  href="adminLogin.jsp">Admin</a>
  <a class="nav__link" href="#contact">Driver</a>
</div>
            


      
          
 <div class="login-form">
     <form action="CustomerLoginServlet" method="post">
    <h1>Login</h1>
    <div class="content">
      <div class="input-field">
        <input type="text" placeholder="Username" name="username" required>
      </div>
      <div class="input-field">
          <input type="password" placeholder="Password" name="password" required>
      </div>
      <a href="cutomerRegister.jsp" class="link">Register</a>
    </div>
    <div class="action">
      <a href="#section---2"></a>
      <button>Sign in</button>
    </div>
  </form>
</div>
            
 </header>
        <br>
        <br>
        <br>
         <section class="section--2" id="section---2">
            
            <img class="imgV" src="images/1.jpg " />
            <img class="imgV" src=" images/2.png " />
            <img class="imgV"src=" images/3.png " />
            <img class="imgV"src=" images/4.jpg " />
            <img class="imgV"src=" images/5.jpg " />
            <img class="imgV"src=" images/6.jpg " /> 
            <div class="Mainhead--V">
                <h1 class="head--V" >VIEW 
                <span>VEHICLE TYPES</span></h1>
            </div>
            
            
        </section>
        <br>
        <br>
        <br>
        <section class="section--3" id="sectionAbout">
          <div class="about-section">
              <div class="about" >
       <h1 >ABOUT US </h1>
              </div>
  <p>Go Cheetha is a registered private limited Taxi Company in Sri Lanka.
                We provide our Cab service and Tour Service all around Sri Lanka
                with over 1000 vehicles. We are capable of providing transport 
                services to our customers at affordable prices.
                Go Cheetha offers a well-maintained and safe fleet of vehicles
                from Luxury Cars to Budget Cars, Vans, Busses, Lorries for all 
                your transport needs. Our responsibility is to 
                ensure that you receive a comfortable, safe, and friendly ride 
                to your destinations. With our Cab service, We ensure that we
                provide good service to our customers and we
                appreciate the feedback from our customer’s </p>
  <p>Resize the browser window to see that this page is responsive by the way.</p>
</div>

<h2 style="text-align:center">OUR TEAM</h2>
<div class="row">
  <div class="column">
    <div class="card">
      <img src="images/team2.jpg" alt="Jane" style="width:100%">
      <div class="container">
        <h2>Jane Doe</h2>
        <p class="title">CEO & Founder</p>
        <p class="para">Maintaining and analysing business.</p>
        <p class="para">jane@example.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="images/team1.jpg" alt="Mike" style="width:100%" >
      <div class="container">
        <h2>Chalani</h2>
        <p class="title">Area Manager</p>
        <p class="para">Handle the all sales and providing new services.<p>
        <p class="para">chalani@example.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="images/SE.jpg" alt="John" style="width:100%">
      <div class="container">
        <h2>Sachithra</h2>
        <p class="title">Software Engineer</p>
        <p class="para">Developing and bug fixing,Designing</p>
        <p class="para">sachithra@gmail.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
</div>
    </section>
      <script src="script.js"></script>    
        
    </body>
</html>
