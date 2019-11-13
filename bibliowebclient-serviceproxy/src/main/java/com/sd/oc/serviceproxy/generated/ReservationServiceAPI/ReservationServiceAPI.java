
package com.sd.oc.serviceproxy.generated.ReservationServiceAPI;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationServiceAPI", targetNamespace = "http://API.oc.sd.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationServiceAPI {


    /**
     * 
     * @param userId
     * @param bookId
     */
    @WebMethod
    @RequestWrapper(localName = "addReservation", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.AddBorrowing")
    @ResponseWrapper(localName = "addReservationResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.AddBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/ReservationServiceAPI/addReservationRequest", output = "http://API.oc.sd.com/ReservationServiceAPI/addReservationResponse")
    public void addReservation(
        @WebParam(name = "book_id", targetNamespace = "")
        int bookId,
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @param bookId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllReservationOfBookOrderByDate", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.FindAllReservationOfBookOrderByDate")
    @ResponseWrapper(localName = "findAllReservationOfBookOrderByDateResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.FindAllReservationOfBookOrderByDateResponse")
    @Action(input = "http://API.oc.sd.com/ReservationServiceAPI/findAllReservationOfBookOrderByDateRequest", output = "http://API.oc.sd.com/ReservationServiceAPI/findAllReservationOfBookOrderByDateResponse")
    public List<Reservation> findAllReservationOfBookOrderByDate(
        @WebParam(name = "book_id", targetNamespace = "")
        int bookId);

    /**
     * 
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllReservations", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.FindAllBooks")
    @ResponseWrapper(localName = "findAllReservationsResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.FindAllBooksResponse")
    @Action(input = "http://API.oc.sd.com/ReservationServiceAPI/findAllReservationsRequest", output = "http://API.oc.sd.com/ReservationServiceAPI/findAllReservationsResponse")
    public List<Book> findAllReservations();

    /**
     * 
     * @param reservationId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteReservation", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.DeleteReservation")
    @ResponseWrapper(localName = "deleteReservationResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.DeleteReservationResponse")
    @Action(input = "http://API.oc.sd.com/ReservationServiceAPI/deleteReservationRequest", output = "http://API.oc.sd.com/ReservationServiceAPI/deleteReservationResponse")
    public void deleteReservation(
        @WebParam(name = "reservation_id", targetNamespace = "")
        int reservationId);

    /**
     * 
     * @param reservationId
     */
    @WebMethod
    @RequestWrapper(localName = "setStartDateMailingOfReservation", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.SetStartDateMailingOfReservation")
    @ResponseWrapper(localName = "setStartDateMailingOfReservationResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.SetStartDateMailingOfReservationResponse")
    @Action(input = "http://API.oc.sd.com/ReservationServiceAPI/setStartDateMailingOfReservationRequest", output = "http://API.oc.sd.com/ReservationServiceAPI/setStartDateMailingOfReservationResponse")
    public void setStartDateMailingOfReservation(
        @WebParam(name = "reservation_id", targetNamespace = "")
        int reservationId);

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllReservationOfUser", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.FindAllReservationOfUser")
    @ResponseWrapper(localName = "findAllReservationOfUserResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.ReservationServiceAPI.FindAllReservationOfUserResponse")
    @Action(input = "http://API.oc.sd.com/ReservationServiceAPI/findAllReservationOfUserRequest", output = "http://API.oc.sd.com/ReservationServiceAPI/findAllReservationOfUserResponse")
    public List<Reservation> findAllReservationOfUser(
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

}
