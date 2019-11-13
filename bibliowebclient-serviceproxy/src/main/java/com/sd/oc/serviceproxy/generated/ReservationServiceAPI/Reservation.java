
package com.sd.oc.serviceproxy.generated.ReservationServiceAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book" type="{http://API.oc.sd.com/}book" minOccurs="0"/>
 *         &lt;element name="dateReservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateStartMailing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reservation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user" type="{http://API.oc.sd.com/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "book",
    "dateReservation",
    "dateStartMailing",
    "reservationId",
    "user"
})
public class Reservation {

    protected Book book;
    protected String dateReservation;
    protected String dateStartMailing;
    @XmlElement(name = "reservation_id")
    protected int reservationId;
    protected User user;

    /**
     * Obtient la valeur de la propri�t� book.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getBook() {
        return book;
    }

    /**
     * D�finit la valeur de la propri�t� book.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setBook(Book value) {
        this.book = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateReservation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReservation() {
        return dateReservation;
    }

    /**
     * D�finit la valeur de la propri�t� dateReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReservation(String value) {
        this.dateReservation = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateStartMailing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateStartMailing() {
        return dateStartMailing;
    }

    /**
     * D�finit la valeur de la propri�t� dateStartMailing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateStartMailing(String value) {
        this.dateStartMailing = value;
    }

    /**
     * Obtient la valeur de la propri�t� reservationId.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * D�finit la valeur de la propri�t� reservationId.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
