
package wspsl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{https://placetopay.com/soap/pse}Authentication"/&gt;
 *         &lt;element name="transaction" type="{https://placetopay.com/soap/pse}PSETransactionMultiCreditRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auth",
    "transaction"
})
@XmlRootElement(name = "createTransactionMultiCredit")
public class CreateTransactionMultiCredit {

    @XmlElement(required = true)
    protected Authentication auth;
    @XmlElement(required = true)
    protected PSETransactionMultiCreditRequest transaction;

    /**
     * Obtiene el valor de la propiedad auth.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuth() {
        return auth;
    }

    /**
     * Define el valor de la propiedad auth.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuth(Authentication value) {
        this.auth = value;
    }

    /**
     * Obtiene el valor de la propiedad transaction.
     * 
     * @return
     *     possible object is
     *     {@link PSETransactionMultiCreditRequest }
     *     
     */
    public PSETransactionMultiCreditRequest getTransaction() {
        return transaction;
    }

    /**
     * Define el valor de la propiedad transaction.
     * 
     * @param value
     *     allowed object is
     *     {@link PSETransactionMultiCreditRequest }
     *     
     */
    public void setTransaction(PSETransactionMultiCreditRequest value) {
        this.transaction = value;
    }

}
