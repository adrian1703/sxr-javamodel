/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:PostalAddress", btRef = "BG-12", type = SellerTaxRepresentativePostalAddress.class, order = -1, min = 1, max = 1 )
public class SellerTaxRepresentativePostalAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-64", type = String.class, order = 0, min = 0, max = 1 )
	public String taxRepresentativeAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-65", type = String.class, order = 1, min = 0, max = 1 )
	public String taxRepresentativeAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-66", type = String.class, order = 2, min = 0, max = 1 )
	public String taxRepresentativeCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-67", type = String.class, order = 3, min = 0, max = 1 )
	public String taxRepresentativePostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-68", type = String.class, order = 4, min = 0, max = 1 )
	public String taxRepresentativeCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine2.class, order = 5, min = 0, max = 1 )
	public AddressLine2 addressLine2;
	@XmlElement(term = "cac:Country", btRef = "null", type = Country2.class, order = 6, min = 1, max = 1 )
	public Country2 country2;

}
