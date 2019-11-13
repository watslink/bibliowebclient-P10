
package com.sd.oc.serviceproxy.generated.ReservationServiceAPI;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sd.oc.serviceproxy.generated.ReservationServiceAPI package. 
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

    private final static QName _SetStartDateMailingOfReservation_QNAME = new QName("http://API.oc.sd.com/", "setStartDateMailingOfReservation");
    private final static QName _FindAllBooksResponse_QNAME = new QName("http://API.oc.sd.com/", "findAllBooksResponse");
    private final static QName _DeleteReservation_QNAME = new QName("http://API.oc.sd.com/", "deleteReservation");
    private final static QName _FindAllBooks_QNAME = new QName("http://API.oc.sd.com/", "findAllBooks");
    private final static QName _FindAllReservationOfUserResponse_QNAME = new QName("http://API.oc.sd.com/", "findAllReservationOfUserResponse");
    private final static QName _DeleteReservationResponse_QNAME = new QName("http://API.oc.sd.com/", "deleteReservationResponse");
    private final static QName _FindAllReservationOfBookOrderByDate_QNAME = new QName("http://API.oc.sd.com/", "findAllReservationOfBookOrderByDate");
    private final static QName _FindAllReservationsResponse_QNAME = new QName("http://API.oc.sd.com/", "findAllReservationsResponse");
    private final static QName _SetStartDateMailingOfReservationResponse_QNAME = new QName("http://API.oc.sd.com/", "setStartDateMailingOfReservationResponse");
    private final static QName _FindAllReservationOfBookOrderByDateResponse_QNAME = new QName("http://API.oc.sd.com/", "findAllReservationOfBookOrderByDateResponse");
    private final static QName _Reservation_QNAME = new QName("http://API.oc.sd.com/", "reservation");
    private final static QName _AddReservationResponse_QNAME = new QName("http://API.oc.sd.com/", "addReservationResponse");
    private final static QName _FindAllReservationOfUser_QNAME = new QName("http://API.oc.sd.com/", "findAllReservationOfUser");
    private final static QName _AddBorrowing_QNAME = new QName("http://API.oc.sd.com/", "addBorrowing");
    private final static QName _FindAllReservations_QNAME = new QName("http://API.oc.sd.com/", "findAllReservations");
    private final static QName _AddReservation_QNAME = new QName("http://API.oc.sd.com/", "addReservation");
    private final static QName _AddBorrowingResponse_QNAME = new QName("http://API.oc.sd.com/", "addBorrowingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sd.oc.serviceproxy.generated.ReservationServiceAPI
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link FindAllReservationOfBookOrderByDate }
     * 
     */
    public FindAllReservationOfBookOrderByDate createFindAllReservationOfBookOrderByDate() {
        return new FindAllReservationOfBookOrderByDate();
    }

    /**
     * Create an instance of {@link FindAllReservationOfUserResponse }
     * 
     */
    public FindAllReservationOfUserResponse createFindAllReservationOfUserResponse() {
        return new FindAllReservationOfUserResponse();
    }

    /**
     * Create an instance of {@link SetStartDateMailingOfReservationResponse }
     * 
     */
    public SetStartDateMailingOfReservationResponse createSetStartDateMailingOfReservationResponse() {
        return new SetStartDateMailingOfReservationResponse();
    }

    /**
     * Create an instance of {@link FindAllBooksResponse }
     * 
     */
    public FindAllBooksResponse createFindAllBooksResponse() {
        return new FindAllBooksResponse();
    }

    /**
     * Create an instance of {@link SetStartDateMailingOfReservation }
     * 
     */
    public SetStartDateMailingOfReservation createSetStartDateMailingOfReservation() {
        return new SetStartDateMailingOfReservation();
    }

    /**
     * Create an instance of {@link FindAllBooks }
     * 
     */
    public FindAllBooks createFindAllBooks() {
        return new FindAllBooks();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link AddBorrowing }
     * 
     */
    public AddBorrowing createAddBorrowing() {
        return new AddBorrowing();
    }

    /**
     * Create an instance of {@link AddBorrowingResponse }
     * 
     */
    public AddBorrowingResponse createAddBorrowingResponse() {
        return new AddBorrowingResponse();
    }

    /**
     * Create an instance of {@link FindAllReservationOfBookOrderByDateResponse }
     * 
     */
    public FindAllReservationOfBookOrderByDateResponse createFindAllReservationOfBookOrderByDateResponse() {
        return new FindAllReservationOfBookOrderByDateResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link FindAllReservationOfUser }
     * 
     */
    public FindAllReservationOfUser createFindAllReservationOfUser() {
        return new FindAllReservationOfUser();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStartDateMailingOfReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "setStartDateMailingOfReservation")
    public JAXBElement<SetStartDateMailingOfReservation> createSetStartDateMailingOfReservation(SetStartDateMailingOfReservation value) {
        return new JAXBElement<SetStartDateMailingOfReservation>(_SetStartDateMailingOfReservation_QNAME, SetStartDateMailingOfReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllBooksResponse")
    public JAXBElement<FindAllBooksResponse> createFindAllBooksResponse(FindAllBooksResponse value) {
        return new JAXBElement<FindAllBooksResponse>(_FindAllBooksResponse_QNAME, FindAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllBooks")
    public JAXBElement<FindAllBooks> createFindAllBooks(FindAllBooks value) {
        return new JAXBElement<FindAllBooks>(_FindAllBooks_QNAME, FindAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllReservationOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllReservationOfUserResponse")
    public JAXBElement<FindAllReservationOfUserResponse> createFindAllReservationOfUserResponse(FindAllReservationOfUserResponse value) {
        return new JAXBElement<FindAllReservationOfUserResponse>(_FindAllReservationOfUserResponse_QNAME, FindAllReservationOfUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "deleteReservationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteReservationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteReservationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllReservationOfBookOrderByDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllReservationOfBookOrderByDate")
    public JAXBElement<FindAllReservationOfBookOrderByDate> createFindAllReservationOfBookOrderByDate(FindAllReservationOfBookOrderByDate value) {
        return new JAXBElement<FindAllReservationOfBookOrderByDate>(_FindAllReservationOfBookOrderByDate_QNAME, FindAllReservationOfBookOrderByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllReservationsResponse")
    public JAXBElement<FindAllBooksResponse> createFindAllReservationsResponse(FindAllBooksResponse value) {
        return new JAXBElement<FindAllBooksResponse>(_FindAllReservationsResponse_QNAME, FindAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStartDateMailingOfReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "setStartDateMailingOfReservationResponse")
    public JAXBElement<SetStartDateMailingOfReservationResponse> createSetStartDateMailingOfReservationResponse(SetStartDateMailingOfReservationResponse value) {
        return new JAXBElement<SetStartDateMailingOfReservationResponse>(_SetStartDateMailingOfReservationResponse_QNAME, SetStartDateMailingOfReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllReservationOfBookOrderByDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllReservationOfBookOrderByDateResponse")
    public JAXBElement<FindAllReservationOfBookOrderByDateResponse> createFindAllReservationOfBookOrderByDateResponse(FindAllReservationOfBookOrderByDateResponse value) {
        return new JAXBElement<FindAllReservationOfBookOrderByDateResponse>(_FindAllReservationOfBookOrderByDateResponse_QNAME, FindAllReservationOfBookOrderByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "reservation")
    public JAXBElement<Reservation> createReservation(Reservation value) {
        return new JAXBElement<Reservation>(_Reservation_QNAME, Reservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "addReservationResponse")
    public JAXBElement<AddBorrowingResponse> createAddReservationResponse(AddBorrowingResponse value) {
        return new JAXBElement<AddBorrowingResponse>(_AddReservationResponse_QNAME, AddBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllReservationOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllReservationOfUser")
    public JAXBElement<FindAllReservationOfUser> createFindAllReservationOfUser(FindAllReservationOfUser value) {
        return new JAXBElement<FindAllReservationOfUser>(_FindAllReservationOfUser_QNAME, FindAllReservationOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "addBorrowing")
    public JAXBElement<AddBorrowing> createAddBorrowing(AddBorrowing value) {
        return new JAXBElement<AddBorrowing>(_AddBorrowing_QNAME, AddBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllReservations")
    public JAXBElement<FindAllBooks> createFindAllReservations(FindAllBooks value) {
        return new JAXBElement<FindAllBooks>(_FindAllReservations_QNAME, FindAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "addReservation")
    public JAXBElement<AddBorrowing> createAddReservation(AddBorrowing value) {
        return new JAXBElement<AddBorrowing>(_AddReservation_QNAME, AddBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "addBorrowingResponse")
    public JAXBElement<AddBorrowingResponse> createAddBorrowingResponse(AddBorrowingResponse value) {
        return new JAXBElement<AddBorrowingResponse>(_AddBorrowingResponse_QNAME, AddBorrowingResponse.class, null, value);
    }

}
