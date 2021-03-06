
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
 *         &lt;element name="getBankListResult" type="{https://placetopay.com/soap/pse}ArrayOfBank"/&gt;
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
    "getBankListResult"
})
@XmlRootElement(name = "getBankListResponse")
public class GetBankListResponse {

    @XmlElement(required = true)
    protected ArrayOfBank getBankListResult;

    /**
     * Obtiene el valor de la propiedad getBankListResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBank }
     *     
     */
    public ArrayOfBank getGetBankListResult() {
        return getBankListResult;
    }

    /**
     * Define el valor de la propiedad getBankListResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBank }
     *     
     */
    public void setGetBankListResult(ArrayOfBank value) {
        this.getBankListResult = value;
    }

}
