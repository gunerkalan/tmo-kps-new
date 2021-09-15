//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.14 at 05:40:44 PM EET 
//


package gov.tmo.tmokps.soap.api.yerlesim;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KimlikNoileKisiAdresBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KimlikNoileKisiAdresBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DigerAdresBilgileri" type="{http://kps.nvi.gov.tr/2018/04/01}ArrayOfKimlikNoileKisiAdresBilgisi" minOccurs="0"/&gt;
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/&gt;
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="YerlesimYeriAdresi" type="{http://kps.nvi.gov.tr/2018/04/01}KimlikNoileKisiAdresBilgisi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KimlikNoileKisiAdresBilgileri", propOrder = {
    "digerAdresBilgileri",
    "hataBilgisi",
    "kimlikNo",
    "yerlesimYeriAdresi"
})
public class KimlikNoileKisiAdresBilgileri {

    @XmlElementRef(name = "DigerAdresBilgileri", namespace = "http://kps.nvi.gov.tr/2018/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKimlikNoileKisiAdresBilgisi> digerAdresBilgileri;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2018/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KimlikNo", namespace = "http://kps.nvi.gov.tr/2018/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> kimlikNo;
    @XmlElementRef(name = "YerlesimYeriAdresi", namespace = "http://kps.nvi.gov.tr/2018/04/01", type = JAXBElement.class, required = false)
    protected JAXBElement<KimlikNoileKisiAdresBilgisi> yerlesimYeriAdresi;

    /**
     * Gets the value of the digerAdresBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKimlikNoileKisiAdresBilgisi }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKimlikNoileKisiAdresBilgisi> getDigerAdresBilgileri() {
        return digerAdresBilgileri;
    }

    /**
     * Sets the value of the digerAdresBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKimlikNoileKisiAdresBilgisi }{@code >}
     *     
     */
    public void setDigerAdresBilgileri(JAXBElement<ArrayOfKimlikNoileKisiAdresBilgisi> value) {
        this.digerAdresBilgileri = value;
    }

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setHataBilgisi(JAXBElement<Parametre> value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the kimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKimlikNo() {
        return kimlikNo;
    }

    /**
     * Sets the value of the kimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKimlikNo(JAXBElement<Long> value) {
        this.kimlikNo = value;
    }

    /**
     * Gets the value of the yerlesimYeriAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KimlikNoileKisiAdresBilgisi }{@code >}
     *     
     */
    public JAXBElement<KimlikNoileKisiAdresBilgisi> getYerlesimYeriAdresi() {
        return yerlesimYeriAdresi;
    }

    /**
     * Sets the value of the yerlesimYeriAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KimlikNoileKisiAdresBilgisi }{@code >}
     *     
     */
    public void setYerlesimYeriAdresi(JAXBElement<KimlikNoileKisiAdresBilgisi> value) {
        this.yerlesimYeriAdresi = value;
    }

}
