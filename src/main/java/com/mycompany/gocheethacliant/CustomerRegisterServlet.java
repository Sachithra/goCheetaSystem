/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheethacliant;

import com.mycompany.gocheethaserver.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "CustomerRegisterServlet", urlPatterns = {"/CustomerRegisterServlet"})
public class CustomerRegisterServlet extends HttpServlet {

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
        
        
         CustomerConnector service=new CustomerConnector();
        
         
       
        String ID=request.getParameter("id");
        int Id= Integer.parseInt(ID);
        String Name = request.getParameter("name");
        String Phone=  request.getParameter("phone");
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");
       
        Customer customer =new Customer();
        
         customer.setId(Id);
         customer.setName(Name);
         customer.setPhone(Phone);
         customer.setUsername(Username);
         customer.setPassword(Password);
        
        
        try {
            service.registerCustomer(customer);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("cutomerRegister.jsp");
    }

      
 }
    

    
