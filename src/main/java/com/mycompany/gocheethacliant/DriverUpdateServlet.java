/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.gocheethacliant;

import com.mycompany.gocheethaserver.Drivers;
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
@WebServlet(name = "DriverUpdateServlet", urlPatterns = {"/DriverUpdateServlet"})
public class DriverUpdateServlet extends HttpServlet {

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
        
        String ID=request.getParameter("id");
        int Id= Integer.parseInt(ID);
        String Name= request.getParameter("name");
        String Age = request.getParameter("age");
        String Branch = request.getParameter("branch");
        String Phone = request.getParameter("phone");

        AdminConnector service=new AdminConnector();
        
        Drivers driver =new Drivers();
        
         driver.setId(Id);
         driver.setName(Name);
         driver.setAge(Age);
         driver.setBranch(Branch);
         driver.setPhone(Phone);
          
        
      
        service.UpdatteDriver(driver);
        response.sendRedirect("manageDriver.jsp");
    }
}
    

   