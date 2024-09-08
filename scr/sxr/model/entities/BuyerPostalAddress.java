package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PostalAddress", btRef = "BG-8", order = 3, min = 1, max = 1 )
public class BuyerPostalAddress {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-50", order = 0, min = 0, max = 1 )
	public String buyerAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-51", order = 1, min = 0, max = 1 )
	public String buyerAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-52", order = 2, min = 0, max = 1 )
	public String buyerCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-53", order = 3, min = 0, max = 1 )
	public String buyerPostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-54", order = 4, min = 0, max = 1 )
	public String buyerCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", order = 5, min = 0, max = 1 )
	public AddressLine addressLine;
	@XmlElement(term = "cac:Country", btRef = "null", order = 6, min = 1, max = 1 )
	public Country country;

}
