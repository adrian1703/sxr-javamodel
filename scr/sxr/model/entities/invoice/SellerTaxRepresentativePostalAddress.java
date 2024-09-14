package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PostalAddress", btRef = "BG-12", order = 1, min = 1, max = 1 )
public class SellerTaxRepresentativePostalAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-64", order = 0, min = 0, max = 1 )
	public String taxRepresentativeAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-65", order = 1, min = 0, max = 1 )
	public String taxRepresentativeAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-66", order = 2, min = 0, max = 1 )
	public String taxRepresentativeCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-67", order = 3, min = 0, max = 1 )
	public String taxRepresentativePostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-68", order = 4, min = 0, max = 1 )
	public String taxRepresentativeCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", order = 5, min = 0, max = 1 )
	public AddressLine addressLine;
	@XmlElement(term = "cac:Country", btRef = "null", order = 6, min = 1, max = 1 )
	public Country country;

}
