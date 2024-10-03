/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:PostalAddress", btRef = "BG-8", type = BuyerPostalAddress.class, order = -1, min = 1, max = 1 )
public class BuyerPostalAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-50", type = String.class, order = 0, min = 0, max = 1 )
	public String buyerAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-51", type = String.class, order = 1, min = 0, max = 1 )
	public String buyerAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-52", type = String.class, order = 2, min = 0, max = 1 )
	public String buyerCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-53", type = String.class, order = 3, min = 0, max = 1 )
	public String buyerPostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-54", type = String.class, order = 4, min = 0, max = 1 )
	public String buyerCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine1.class, order = 5, min = 0, max = 1 )
	public AddressLine1 addressLine1;
	@XmlElement(term = "cac:Country", btRef = "null", type = Country1.class, order = 6, min = 1, max = 1 )
	public Country1 country1;

}
