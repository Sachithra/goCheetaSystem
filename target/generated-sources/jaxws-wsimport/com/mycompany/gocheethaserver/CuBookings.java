
package com.mycompany.gocheethaserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cuBookings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cuBookings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="place" type="{http://gocheethaserver.mycompany.com/}placebookings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuBookings", propOrder = {
    "place"
})
public class CuBookings {

    protected Placebookings place;

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link Placebookings }
     *     
     */
    public Placebookings getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link Placebookings }
     *     
     */
    public void setPlace(Placebookings value) {
        this.place = value;
    }

}
