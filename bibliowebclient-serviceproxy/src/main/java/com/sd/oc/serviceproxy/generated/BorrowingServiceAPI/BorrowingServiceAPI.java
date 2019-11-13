
package com.sd.oc.serviceproxy.generated.BorrowingServiceAPI;

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
@WebService(name = "BorrowingServiceAPI", targetNamespace = "http://API.oc.sd.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BorrowingServiceAPI {


    /**
     * 
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowing")
    @ResponseWrapper(localName = "findAllBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingResponse")
    public List<Borrowing> findAllBorrowing();

    /**
     * 
     * @param borrowingId
     */
    @WebMethod
    @RequestWrapper(localName = "extendBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.ExtendBorrowing")
    @ResponseWrapper(localName = "extendBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.ExtendBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/extendBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/extendBorrowingResponse")
    public void extendBorrowing(
        @WebParam(name = "borrowing_id", targetNamespace = "")
        int borrowingId);

    /**
     * 
     * @param borrowingId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.DeleteBorrowing")
    @ResponseWrapper(localName = "deleteBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.DeleteBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/deleteBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/deleteBorrowingResponse")
    public void deleteBorrowing(
        @WebParam(name = "borrowing_id", targetNamespace = "")
        int borrowingId);

    /**
     * 
     * @param userId
     * @param bookId
     */
    @WebMethod
    @RequestWrapper(localName = "addBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.AddBorrowing")
    @ResponseWrapper(localName = "addBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.AddBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/addBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/addBorrowingResponse")
    public void addBorrowing(
        @WebParam(name = "book_id", targetNamespace = "")
        int bookId,
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @param bookId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOfBookOrderByReturnDate", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOfBookOrderByReturnDate")
    @ResponseWrapper(localName = "findAllBorrowingOfBookOrderByReturnDateResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOfBookOrderByReturnDateResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOfBookOrderByReturnDateRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOfBookOrderByReturnDateResponse")
    public List<Borrowing> findAllBorrowingOfBookOrderByReturnDate(
        @WebParam(name = "book_id", targetNamespace = "")
        int bookId);

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOutOfTimeOfUser", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOutOfTimeOfUser")
    @ResponseWrapper(localName = "findAllBorrowingOutOfTimeOfUserResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOutOfTimeOfUserResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeOfUserRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeOfUserResponse")
    public List<Borrowing> findAllBorrowingOutOfTimeOfUser(
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOfUser", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOfUser")
    @ResponseWrapper(localName = "findAllBorrowingOfUserResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOfUserResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOfUserRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOfUserResponse")
    public List<Borrowing> findAllBorrowingOfUser(
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOutOfTime", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOutOfTime")
    @ResponseWrapper(localName = "findAllBorrowingOutOfTimeResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.FindAllBorrowingOutOfTimeResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeResponse")
    public List<Borrowing> findAllBorrowingOutOfTime();

}
