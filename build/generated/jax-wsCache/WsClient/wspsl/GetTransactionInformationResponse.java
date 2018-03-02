
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
 *         &lt;element name="getTransactionInformationResult" type="{https://placetopay.com/soap/pse}TransactionInformation"/&gt;
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
    "getTransactionInformationResult"
})
@XmlRootElement(name = "getTransactionInformationResponse")
public class GetTransactionInformationResponse {

    @XmlElement(required = true)
    protected TransactionInformation getTransactionInformationResult;

    /**
     * Obtiene el valor de la propiedad getTransactionInformationResult.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformation }
     *     
     */
    public TransactionInformation getGetTransactionInformationResult() {
        return getTransactionInformationResult;
    }

    /**
     * Define el valor de la propiedad getTransactionInformationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformation }
     *     
     */
    public void setGetTransactionInformationResult(TransactionInformation value) {
        this.getTransactionInformationResult = value;
    }

}
