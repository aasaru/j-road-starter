
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tegevusala_tahis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "padevustunnistusega_isiku_otsing_parameetrid")
public class PadevustunnistusegaIsikuOtsingParameetrid {

    @XmlElement(required = true)
    protected String isikukood;
    @XmlElement(name = "tegevusala_tahis")
    protected String tegevusalaTahis;

    /**
     * Gets the value of the isikukood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsikukood() {
        return isikukood;
    }

    /**
     * Sets the value of the isikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsikukood(String value) {
        this.isikukood = value;
    }

    /**
     * Gets the value of the tegevusalaTahis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTegevusalaTahis() {
        return tegevusalaTahis;
    }

    /**
     * Sets the value of the tegevusalaTahis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTegevusalaTahis(String value) {
        this.tegevusalaTahis = value;
    }

}
