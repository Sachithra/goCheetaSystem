
package com.mycompany.gocheethaserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.gocheethaserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSalesResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "getSalesResponse");
    private final static QName _DeleteVehicleResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "deleteVehicleResponse");
    private final static QName _RegisterDriverResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "registerDriverResponse");
    private final static QName _UpdateVehicle_QNAME = new QName("http://gocheethaserver.mycompany.com/", "updateVehicle");
    private final static QName _UpdateVehicleResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "updateVehicleResponse");
    private final static QName _RegisterDriver_QNAME = new QName("http://gocheethaserver.mycompany.com/", "registerDriver");
    private final static QName _LoginAdminResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "loginAdminResponse");
    private final static QName _GetSales_QNAME = new QName("http://gocheethaserver.mycompany.com/", "getSales");
    private final static QName _AddVehicle_QNAME = new QName("http://gocheethaserver.mycompany.com/", "addVehicle");
    private final static QName _AddVehicleResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "addVehicleResponse");
    private final static QName _DeleteDriver_QNAME = new QName("http://gocheethaserver.mycompany.com/", "deleteDriver");
    private final static QName _UpdateDriver_QNAME = new QName("http://gocheethaserver.mycompany.com/", "updateDriver");
    private final static QName _DeleteVehicle_QNAME = new QName("http://gocheethaserver.mycompany.com/", "deleteVehicle");
    private final static QName _LoginAdmin_QNAME = new QName("http://gocheethaserver.mycompany.com/", "loginAdmin");
    private final static QName _UpdateDriverResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "updateDriverResponse");
    private final static QName _DeleteDriverResponse_QNAME = new QName("http://gocheethaserver.mycompany.com/", "deleteDriverResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.gocheethaserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateDriverResponse }
     * 
     */
    public UpdateDriverResponse createUpdateDriverResponse() {
        return new UpdateDriverResponse();
    }

    /**
     * Create an instance of {@link LoginAdmin }
     * 
     */
    public LoginAdmin createLoginAdmin() {
        return new LoginAdmin();
    }

    /**
     * Create an instance of {@link DeleteDriverResponse }
     * 
     */
    public DeleteDriverResponse createDeleteDriverResponse() {
        return new DeleteDriverResponse();
    }

    /**
     * Create an instance of {@link GetSales }
     * 
     */
    public GetSales createGetSales() {
        return new GetSales();
    }

    /**
     * Create an instance of {@link DeleteDriver }
     * 
     */
    public DeleteDriver createDeleteDriver() {
        return new DeleteDriver();
    }

    /**
     * Create an instance of {@link AddVehicle }
     * 
     */
    public AddVehicle createAddVehicle() {
        return new AddVehicle();
    }

    /**
     * Create an instance of {@link AddVehicleResponse }
     * 
     */
    public AddVehicleResponse createAddVehicleResponse() {
        return new AddVehicleResponse();
    }

    /**
     * Create an instance of {@link UpdateDriver }
     * 
     */
    public UpdateDriver createUpdateDriver() {
        return new UpdateDriver();
    }

    /**
     * Create an instance of {@link DeleteVehicle }
     * 
     */
    public DeleteVehicle createDeleteVehicle() {
        return new DeleteVehicle();
    }

    /**
     * Create an instance of {@link RegisterDriver }
     * 
     */
    public RegisterDriver createRegisterDriver() {
        return new RegisterDriver();
    }

    /**
     * Create an instance of {@link LoginAdminResponse }
     * 
     */
    public LoginAdminResponse createLoginAdminResponse() {
        return new LoginAdminResponse();
    }

    /**
     * Create an instance of {@link GetSalesResponse }
     * 
     */
    public GetSalesResponse createGetSalesResponse() {
        return new GetSalesResponse();
    }

    /**
     * Create an instance of {@link RegisterDriverResponse }
     * 
     */
    public RegisterDriverResponse createRegisterDriverResponse() {
        return new RegisterDriverResponse();
    }

    /**
     * Create an instance of {@link UpdateVehicle }
     * 
     */
    public UpdateVehicle createUpdateVehicle() {
        return new UpdateVehicle();
    }

    /**
     * Create an instance of {@link DeleteVehicleResponse }
     * 
     */
    public DeleteVehicleResponse createDeleteVehicleResponse() {
        return new DeleteVehicleResponse();
    }

    /**
     * Create an instance of {@link UpdateVehicleResponse }
     * 
     */
    public UpdateVehicleResponse createUpdateVehicleResponse() {
        return new UpdateVehicleResponse();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link Drivers }
     * 
     */
    public Drivers createDrivers() {
        return new Drivers();
    }

    /**
     * Create an instance of {@link SalesDetails }
     * 
     */
    public SalesDetails createSalesDetails() {
        return new SalesDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "getSalesResponse")
    public JAXBElement<GetSalesResponse> createGetSalesResponse(GetSalesResponse value) {
        return new JAXBElement<GetSalesResponse>(_GetSalesResponse_QNAME, GetSalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "deleteVehicleResponse")
    public JAXBElement<DeleteVehicleResponse> createDeleteVehicleResponse(DeleteVehicleResponse value) {
        return new JAXBElement<DeleteVehicleResponse>(_DeleteVehicleResponse_QNAME, DeleteVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "registerDriverResponse")
    public JAXBElement<RegisterDriverResponse> createRegisterDriverResponse(RegisterDriverResponse value) {
        return new JAXBElement<RegisterDriverResponse>(_RegisterDriverResponse_QNAME, RegisterDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "updateVehicle")
    public JAXBElement<UpdateVehicle> createUpdateVehicle(UpdateVehicle value) {
        return new JAXBElement<UpdateVehicle>(_UpdateVehicle_QNAME, UpdateVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "updateVehicleResponse")
    public JAXBElement<UpdateVehicleResponse> createUpdateVehicleResponse(UpdateVehicleResponse value) {
        return new JAXBElement<UpdateVehicleResponse>(_UpdateVehicleResponse_QNAME, UpdateVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "registerDriver")
    public JAXBElement<RegisterDriver> createRegisterDriver(RegisterDriver value) {
        return new JAXBElement<RegisterDriver>(_RegisterDriver_QNAME, RegisterDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "loginAdminResponse")
    public JAXBElement<LoginAdminResponse> createLoginAdminResponse(LoginAdminResponse value) {
        return new JAXBElement<LoginAdminResponse>(_LoginAdminResponse_QNAME, LoginAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "getSales")
    public JAXBElement<GetSales> createGetSales(GetSales value) {
        return new JAXBElement<GetSales>(_GetSales_QNAME, GetSales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "addVehicle")
    public JAXBElement<AddVehicle> createAddVehicle(AddVehicle value) {
        return new JAXBElement<AddVehicle>(_AddVehicle_QNAME, AddVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "addVehicleResponse")
    public JAXBElement<AddVehicleResponse> createAddVehicleResponse(AddVehicleResponse value) {
        return new JAXBElement<AddVehicleResponse>(_AddVehicleResponse_QNAME, AddVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "deleteDriver")
    public JAXBElement<DeleteDriver> createDeleteDriver(DeleteDriver value) {
        return new JAXBElement<DeleteDriver>(_DeleteDriver_QNAME, DeleteDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "updateDriver")
    public JAXBElement<UpdateDriver> createUpdateDriver(UpdateDriver value) {
        return new JAXBElement<UpdateDriver>(_UpdateDriver_QNAME, UpdateDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "deleteVehicle")
    public JAXBElement<DeleteVehicle> createDeleteVehicle(DeleteVehicle value) {
        return new JAXBElement<DeleteVehicle>(_DeleteVehicle_QNAME, DeleteVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "loginAdmin")
    public JAXBElement<LoginAdmin> createLoginAdmin(LoginAdmin value) {
        return new JAXBElement<LoginAdmin>(_LoginAdmin_QNAME, LoginAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "updateDriverResponse")
    public JAXBElement<UpdateDriverResponse> createUpdateDriverResponse(UpdateDriverResponse value) {
        return new JAXBElement<UpdateDriverResponse>(_UpdateDriverResponse_QNAME, UpdateDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gocheethaserver.mycompany.com/", name = "deleteDriverResponse")
    public JAXBElement<DeleteDriverResponse> createDeleteDriverResponse(DeleteDriverResponse value) {
        return new JAXBElement<DeleteDriverResponse>(_DeleteDriverResponse_QNAME, DeleteDriverResponse.class, null, value);
    }

}
