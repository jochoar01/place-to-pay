
package wspsl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PlacetoPay_PSEPort", targetNamespace = "https://placetopay.com/soap/pse")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PlacetoPayPSEPort {


    /**
     * Obtiene la lista de bancos
     * 
     * @param auth
     * @return
     *     returns wspsl.ArrayOfBank
     */
    @WebMethod(action = "https://placetopay.com/soap/pse#getBankList")
    @WebResult(name = "getBankListResult", targetNamespace = "")
    @RequestWrapper(localName = "getBankList", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.GetBankList")
    @ResponseWrapper(localName = "getBankListResponse", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.GetBankListResponse")
    public ArrayOfBank getBankList(
        @WebParam(name = "auth", targetNamespace = "")
        Authentication auth);

    /**
     * Solicita la creación de una transacción
     * 
     * @param auth
     * @param transaction
     * @return
     *     returns wspsl.PSETransactionResponse
     */
    @WebMethod(action = "https://placetopay.com/soap/pse#createTransaction")
    @WebResult(name = "createTransactionResult", targetNamespace = "")
    @RequestWrapper(localName = "createTransaction", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.CreateTransaction")
    @ResponseWrapper(localName = "createTransactionResponse", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.CreateTransactionResponse")
    public PSETransactionResponse createTransaction(
        @WebParam(name = "auth", targetNamespace = "")
        Authentication auth,
        @WebParam(name = "transaction", targetNamespace = "")
        PSETransactionRequest transaction);

    /**
     * Solicita la creación de una transacción con dispersión de fondos
     * 
     * @param auth
     * @param transaction
     * @return
     *     returns wspsl.PSETransactionResponse
     */
    @WebMethod(action = "https://placetopay.com/soap/pse#createTransactionMultiCredit")
    @WebResult(name = "createTransactionMultiCreditResult", targetNamespace = "")
    @RequestWrapper(localName = "createTransactionMultiCredit", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.CreateTransactionMultiCredit")
    @ResponseWrapper(localName = "createTransactionMultiCreditResponse", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.CreateTransactionMultiCreditResponse")
    public PSETransactionResponse createTransactionMultiCredit(
        @WebParam(name = "auth", targetNamespace = "")
        Authentication auth,
        @WebParam(name = "transaction", targetNamespace = "")
        PSETransactionMultiCreditRequest transaction);

    /**
     * Obtiene la información de una transacción
     * 
     * @param auth
     * @param transactionID
     * @return
     *     returns wspsl.TransactionInformation
     */
    @WebMethod(action = "https://placetopay.com/soap/pse#getTransactionInformation")
    @WebResult(name = "getTransactionInformationResult", targetNamespace = "")
    @RequestWrapper(localName = "getTransactionInformation", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.GetTransactionInformation")
    @ResponseWrapper(localName = "getTransactionInformationResponse", targetNamespace = "https://placetopay.com/soap/pse", className = "wspsl.GetTransactionInformationResponse")
    public TransactionInformation getTransactionInformation(
        @WebParam(name = "auth", targetNamespace = "")
        Authentication auth,
        @WebParam(name = "transactionID", targetNamespace = "")
        int transactionID);

}
