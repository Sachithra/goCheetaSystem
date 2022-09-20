/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheethacliant;

import com.mycompany.gocheethaserver.BookingDetailss;
import com.mycompany.gocheethaserver.Vehicle;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "searchServlet", urlPatterns = {"/searchServlet"})
public class searchServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String Name = request.getParameter("name");
        String Branch=request.getParameter("branch");
        String Type=request.getParameter("type");
       
        
       CustomerConnector service=new CustomerConnector();
       BookingDetailss bd=service.getVehicle(Type);
       Name =bd.getName();
       Branch=  bd.getBranch();
       Type =  bd.getType();
    
       
       request.setAttribute("bd", bd); 
       request.getRequestDispatcher("placeBooking.jsp").forward(request, response);
    }
        
 }

    

   