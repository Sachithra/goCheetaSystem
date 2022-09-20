/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethacliant;


import com.mycompany.gocheethaserver.BookingDetailss;
import com.mycompany.gocheethaserver.Customer;
import com.mycompany.gocheethaserver.CustomerService;
import com.mycompany.gocheethaserver.CustomerService_Service;
import com.mycompany.gocheethaserver.Drivers;
import com.mycompany.gocheethaserver.Placebookings;


/**
 *
 * @author User
 */
public class CustomerConnector {
    
    public Customer loginCustomer(String username, String password) {
	 CustomerService_Service service=new CustomerService_Service ();
         CustomerService proxy=service.getCustomerServicePort();
        return proxy.loginCustomer(username, password);
    }
    
    
     public boolean registerCustomer(Customer customer){
        CustomerService_Service service=new CustomerService_Service ();
        CustomerService proxy=service.getCustomerServicePort();
        return proxy.registerCustomer(customer);
    }
   public BookingDetailss getVehicle(String type){
     CustomerService_Service service=new CustomerService_Service ();
     CustomerService proxy=service.getCustomerServicePort();
    return proxy.getVehicle(type);
   
    }
    public boolean cusBooking(Placebookings place){
        CustomerService_Service service=new CustomerService_Service ();
        CustomerService proxy=service.getCustomerServicePort();
        return proxy.cuBookings(place);
 
    }
     public boolean feedbackes(Drivers driver){
        CustomerService_Service service=new CustomerService_Service ();
        CustomerService proxy=service.getCustomerServicePort();
        return proxy.feedBackes(driver);
 
    }
}
