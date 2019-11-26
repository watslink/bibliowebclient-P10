
package com.sd.oc.serviceproxy.generated.ReservationServiceAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteReservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteReservation", propOrder = {
    "reservationId"
})
public class DeleteReservation {

    @XmlElement(name = "reservation_id")
    protected int reservationId;

    /**
     * Obtient la valeur de la propriété reservationId.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Définit la valeur de la propriété reservationId.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

}
