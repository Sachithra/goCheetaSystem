/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheethacliant;

import com.mycompany.gocheethaserver.Admin;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "AdminLoginServlet", urlPatterns = {"/AdminLoginServlet"})
public class AdminLoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String username=null;
    private String password=null;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
                username = request.getParameter("username");
		password = request.getParameter("password");
		
		if((username != null && !username.isEmpty()) && (password != null && !password.isEmpty())) {
			
			
		AdminConnector adminLogin = new AdminConnector();	
		Admin admin = adminLogin.loginAdmin(username, password);
			
			
		if(admin != null && admin.isIsvalid()) {				
		HttpSession session = request.getSession();
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("AdminHome.jsp");
		session.setAttribute("admin", admin);		
		dispatcher.forward(request, response);
						
		} else {
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminLogin.jsp");
        	request.setAttribute("errorMessage", "you have given invalid username or password :( ");
		dispatcher.forward(request, response);
				
	   }			
	}
        
      }
   }

