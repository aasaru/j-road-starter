
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadGlobalGroupIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRoadGlobalGroupIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}xRoadInstance"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}groupCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required" fixed="GLOBALGROUP""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadGlobalGroupIdentifierType", namespace = "http://x-road.eu/xsd/identifiers")
public class XRoadGlobalGroupIdentifierType
    extends XRoadIdentifierType
{


}
