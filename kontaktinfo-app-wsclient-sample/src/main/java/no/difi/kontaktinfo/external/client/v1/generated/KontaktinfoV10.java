package no.difi.kontaktinfo.external.client.v1.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-03-25T15:19:39.661+01:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://kontaktinfo.difi.no/wsdl/kontaktinfo-v1", name = "kontaktinfo_v1_0")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface KontaktinfoV10 {

    @WebResult(name = "hentKontaktinfolisteResponse", targetNamespace = "http://kontaktinfo.difi.no/xsd/kontaktinfo/201210", partName = "hentKontaktinfolisteResponse")
    @WebMethod
    public HentKontaktinfolisteResponse hentKontaktinfoliste(
        @WebParam(partName = "hentKontaktinfolisteRequest", name = "hentKontaktinfolisteRequest", targetNamespace = "http://kontaktinfo.difi.no/xsd/kontaktinfo/201210")
        HentKontaktinfolisteRequest hentKontaktinfolisteRequest
    );

    @WebResult(name = "hentKontaktinfoResponse", targetNamespace = "http://kontaktinfo.difi.no/xsd/kontaktinfo/201210", partName = "hentKontaktinfoResponse")
    @WebMethod
    public HentKontaktinfoResponse hentKontaktinfo(
        @WebParam(partName = "hentKontaktinfoRequest", name = "hentKontaktinfoRequest", targetNamespace = "http://kontaktinfo.difi.no/xsd/kontaktinfo/201210")
        HentKontaktinfoRequest hentKontaktinfoRequest
    );
}