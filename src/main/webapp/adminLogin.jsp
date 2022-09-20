<%-- 
    Document   : adminLogin
    Created on : Sep 15, 2022, 12:05:30 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="adminLoginStyle.css"> 
    </head>
    <body>
        <div class="login-form">
    <form action="AdminLoginServlet" method="Post">
    <h1>Admin Login</h1>
    <div class="content">
      <div class="input-field">
        <input type="text" placeholder="Username" name="username" required>
      </div>
      <div class="input-field">
        <input type="password" placeholder="Password" name="password" required>
      </div>
      <a href="#" class="link">Forgot Your Password?</a>
    </div>
    <div class="action">
      <button>Login</button>

    </div>
  </form>
</div>
    </body>
</html>
