//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.23 at 03:02:25 PM CET 
//


package dummy.calc.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="term1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="term2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="response" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "generic-response")
public class GenericResponse {

    @XmlAttribute
    protected String term1;
    @XmlAttribute
    protected String term2;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String response;

    /**
     * Gets the value of the term1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm1() {
        return term1;
    }

    /**
     * Sets the value of the term1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm1(String value) {
        this.term1 = value;
    }

    /**
     * Gets the value of the term2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm2() {
        return term2;
    }

    /**
     * Sets the value of the term2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm2(String value) {
        this.term2 = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

}
