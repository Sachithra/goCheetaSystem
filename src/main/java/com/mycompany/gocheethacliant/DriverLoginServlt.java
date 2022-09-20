/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheethacliant;

import com.mycompany.gocheethaserver.Drivers;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DriverLoginServlt", urlPatterns = {"/DriverLoginServlt"})
public class DriverLoginServlt extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String name=null;
    private String phone=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
                name= request.getParameter("name");
		phone = request.getParameter("phone");
		
		if((name != null && !name.isEmpty()) && (phone != null && !phone.isEmpty())) {
			
			
		DriverConnetor driverLogin = new DriverConnetor();	
		Drivers driver = driverLogin.loginDrivers(name, phone);
			
			
		if(driver != null && driver.isIsValidate()) {				
		HttpSession session = request.getSession();
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("DriverHome.jsp");
		session.setAttribute("driver", driver);		
		dispatcher.forward(request, response);
						
		} else {
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("DriverLogin.jsp");
        	request.setAttribute("errorMessage", "you have given invalid username or password :( ");
		dispatcher.forward(request, response);
        
        
        
        }
    }
    }
}

    