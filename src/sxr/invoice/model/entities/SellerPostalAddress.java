/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:PostalAddress", btRef = "BG-5", type = SellerPostalAddress.class, order = -1, min = 1, max = 1 )
public class SellerPostalAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-35", type = String.class, order = 0, min = 0, max = 1 )
	public String sellerAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-36", type = String.class, order = 1, min = 0, max = 1 )
	public String sellerAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-37", type = String.class, order = 2, min = 0, max = 1 )
	public String sellerCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-38", type = String.class, order = 3, min = 0, max = 1 )
	public String sellerPostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-39", type = String.class, order = 4, min = 0, max = 1 )
	public String sellerCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine.class, order = 5, min = 0, max = 1 )
	public AddressLine addressLine;
	@XmlElement(term = "cac:Country", btRef = "null", type = Country.class, order = 6, min = 1, max = 1 )
	public Country country;

}
