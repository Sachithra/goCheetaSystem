/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethacliant;


import com.mycompany.gocheethaserver.Drivers;
import com.mycompany.gocheethaserver.DriversService;
import com.mycompany.gocheethaserver.DriversService_Service;

/**
 *
 * @author User
 */
public class DriverConnetor {
 public Drivers loginDrivers(String name, String phone) {
	 DriversService_Service service=new DriversService_Service ();
          DriversService proxy=service.getDriversServicePort();
        return proxy.loginDrivers(name, phone);
    }
}
