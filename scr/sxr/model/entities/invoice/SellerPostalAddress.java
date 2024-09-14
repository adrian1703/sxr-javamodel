package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PostalAddress", btRef = "BG-5", order = 3, min = 1, max = 1 )
public class SellerPostalAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-35", order = 0, min = 0, max = 1 )
	public String sellerAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-36", order = 1, min = 0, max = 1 )
	public String sellerAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-37", order = 2, min = 0, max = 1 )
	public String sellerCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-38", order = 3, min = 0, max = 1 )
	public String sellerPostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-39", order = 4, min = 0, max = 1 )
	public String sellerCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", order = 5, min = 0, max = 1 )
	public AddressLine addressLine;
	@XmlElement(term = "cac:Country", btRef = "null", order = 6, min = 1, max = 1 )
	public Country country;

}
