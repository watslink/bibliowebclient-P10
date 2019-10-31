
package com.sd.oc.serviceproxy.generated.borrowingAPI;

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
     * @param userId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.borrowingAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOutOfTimeOfUser", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingOutOfTimeOfUser")
    @ResponseWrapper(localName = "findAllBorrowingOutOfTimeOfUserResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingOutOfTimeOfUserResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeOfUserRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeOfUserResponse")
    public List<Borrowing> findAllBorrowingOutOfTimeOfUser(
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.borrowingAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOutOfTime", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingOutOfTime")
    @ResponseWrapper(localName = "findAllBorrowingOutOfTimeResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingOutOfTimeResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOutOfTimeResponse")
    public List<Borrowing> findAllBorrowingOutOfTime();

    /**
     * 
     * @param userId
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.borrowingAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowingOfUser", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingOfUser")
    @ResponseWrapper(localName = "findAllBorrowingOfUserResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingOfUserResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOfUserRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingOfUserResponse")
    public List<Borrowing> findAllBorrowingOfUser(
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @param userId
     * @param bookId
     */
    @WebMethod
    @RequestWrapper(localName = "addBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.AddBorrowing")
    @ResponseWrapper(localName = "addBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.AddBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/addBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/addBorrowingResponse")
    public void addBorrowing(
        @WebParam(name = "book_id", targetNamespace = "")
        int bookId,
        @WebParam(name = "user_id", targetNamespace = "")
        int userId);

    /**
     * 
     * @param borrowingId
     */
    @WebMethod
    @RequestWrapper(localName = "extendBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.ExtendBorrowing")
    @ResponseWrapper(localName = "extendBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.ExtendBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/extendBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/extendBorrowingResponse")
    public void extendBorrowing(
        @WebParam(name = "borrowing_id", targetNamespace = "")
        int borrowingId);

    /**
     * 
     * @param borrowingId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.DeleteBorrowing")
    @ResponseWrapper(localName = "deleteBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.DeleteBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/deleteBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/deleteBorrowingResponse")
    public void deleteBorrowing(
        @WebParam(name = "borrowing_id", targetNamespace = "")
        int borrowingId);

    /**
     * 
     * @return
     *     returns java.util.List<com.sd.oc.serviceproxy.generated.borrowingAPI.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBorrowing", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowing")
    @ResponseWrapper(localName = "findAllBorrowingResponse", targetNamespace = "http://API.oc.sd.com/", className = "com.sd.oc.serviceproxy.generated.borrowingAPI.FindAllBorrowingResponse")
    @Action(input = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingRequest", output = "http://API.oc.sd.com/BorrowingServiceAPI/findAllBorrowingResponse")
    public List<Borrowing> findAllBorrowing();

}
