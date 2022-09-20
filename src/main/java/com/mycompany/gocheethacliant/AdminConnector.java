/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethacliant;

import com.mycompany.gocheethaserver.Admin;
import com.mycompany.gocheethaserver.AdminService;
import com.mycompany.gocheethaserver.AdminService_Service;
import com.mycompany.gocheethaserver.BookingDetailss;
import com.mycompany.gocheethaserver.CustomerService;
import com.mycompany.gocheethaserver.CustomerService_Service;
import com.mycompany.gocheethaserver.Drivers;
import com.mycompany.gocheethaserver.SalesDetails;
import com.mycompany.gocheethaserver.Vehicle;


/**
 *
 * @author User
 */
public class AdminConnector {
    
     public Admin loginAdmin(String username, String password) {
	 AdminService_Service service=new AdminService_Service ();
         AdminService proxy=service.getAdminServicePort();
         return proxy.loginAdmin(username, password);
    } 
     
     
     public boolean registerDriver(Drivers driver){
        AdminService_Service service=new AdminService_Service ();
        AdminService proxy=service.getAdminServicePort();
        return proxy.registerDriver(driver);
    }
       public boolean addVehicle(Vehicle vehicle){
        AdminService_Service service=new AdminService_Service ();
        AdminService proxy=service.getAdminServicePort();
        return proxy.addVehicle(vehicle);
    }
   
    public boolean UpdatteDriver(Drivers driver){
        AdminService_Service service=new AdminService_Service ();
        AdminService proxy=service.getAdminServicePort();
        return proxy.updateDriver(driver);
    }
    public boolean UpdateVehicle(Vehicle vehicle){
        AdminService_Service service=new AdminService_Service ();
        AdminService proxy=service.getAdminServicePort();
        return proxy.updateVehicle(vehicle);
    }
    public boolean deleteDriver(int id){
        AdminService_Service service=new AdminService_Service ();
        AdminService proxy=service.getAdminServicePort();
        return proxy.deleteDriver(id);
    }
    public boolean deleteVehicle(int id){
        AdminService_Service service=new AdminService_Service ();
        AdminService proxy=service.getAdminServicePort();
        return proxy.deleteVehicle(id);
    }
     public SalesDetails getSales(String branch){
     AdminService_Service service=new AdminService_Service ();
     AdminService proxy=service.getAdminServicePort();
    return proxy.getSales(branch);
   
    }
}
