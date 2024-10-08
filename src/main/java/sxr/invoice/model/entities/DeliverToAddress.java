/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:Address", btRef = "BG-15", type = DeliverToAddress.class, order = -1, min = 0, max = 1 )
public class DeliverToAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-75", type = String.class, order = 0, min = 0, max = 1 )
	public String deliverToAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-76", type = String.class, order = 1, min = 0, max = 1 )
	public String deliverToAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-77", type = String.class, order = 2, min = 0, max = 1 )
	public String deliverToCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-78", type = String.class, order = 3, min = 0, max = 1 )
	public String deliverToPostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-79", type = String.class, order = 4, min = 0, max = 1 )
	public String deliverToCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine3.class, order = 5, min = 0, max = 1 )
	public AddressLine3 addressLine3;
	@XmlElement(term = "cac:Country", btRef = "null", type = Country3.class, order = 6, min = 1, max = 1 )
	public Country3 country3;

}
