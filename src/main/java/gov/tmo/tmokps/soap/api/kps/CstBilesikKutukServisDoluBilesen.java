//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.12 at 08:04:01 PM TRT 
//


package gov.tmo.tmokps.soap.api.kps;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CstBilesikKutukServisDoluBilesen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CstBilesikKutukServisDoluBilesen"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TCKisiBilgisi"/&gt;
 *     &lt;enumeration value="TCKKGeciciKimlikBilgisi"/&gt;
 *     &lt;enumeration value="TCKKBilgisi"/&gt;
 *     &lt;enumeration value="TCKKFotoBilgisi"/&gt;
 *     &lt;enumeration value="NufusCuzdaniBilgisi"/&gt;
 *     &lt;enumeration value="MaviKartliKisiBilgisi"/&gt;
 *     &lt;enumeration value="MaviKartBilgisi"/&gt;
 *     &lt;enumeration value="YabanciKisiBilgisi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CstBilesikKutukServisDoluBilesen", namespace = "http://schemas.datacontract.org/2004/07/Common.Types.Constants")
@XmlEnum
public enum CstBilesikKutukServisDoluBilesen {

    @XmlEnumValue("TCKisiBilgisi")
    TC_KISI_BILGISI("TCKisiBilgisi"),
    @XmlEnumValue("TCKKGeciciKimlikBilgisi")
    TCKK_GECICI_KIMLIK_BILGISI("TCKKGeciciKimlikBilgisi"),
    @XmlEnumValue("TCKKBilgisi")
    TCKK_BILGISI("TCKKBilgisi"),
    @XmlEnumValue("TCKKFotoBilgisi")
    TCKK_FOTO_BILGISI("TCKKFotoBilgisi"),
    @XmlEnumValue("NufusCuzdaniBilgisi")
    NUFUS_CUZDANI_BILGISI("NufusCuzdaniBilgisi"),
    @XmlEnumValue("MaviKartliKisiBilgisi")
    MAVI_KARTLI_KISI_BILGISI("MaviKartliKisiBilgisi"),
    @XmlEnumValue("MaviKartBilgisi")
    MAVI_KART_BILGISI("MaviKartBilgisi"),
    @XmlEnumValue("YabanciKisiBilgisi")
    YABANCI_KISI_BILGISI("YabanciKisiBilgisi");
    private final String value;

    CstBilesikKutukServisDoluBilesen(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CstBilesikKutukServisDoluBilesen fromValue(String v) {
        for (CstBilesikKutukServisDoluBilesen c: CstBilesikKutukServisDoluBilesen.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}