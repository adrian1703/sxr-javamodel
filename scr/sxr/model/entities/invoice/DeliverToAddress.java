package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Address", btRef = "BG-15", order = 1, min = 0, max = 1 )
public class DeliverToAddress extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StreetName", btRef = "BT-75", order = 0, min = 0, max = 1 )
	public String deliverToAddressLine1;
	@XmlElement(term = "cbc:AdditionalStreetName", btRef = "BT-76", order = 1, min = 0, max = 1 )
	public String deliverToAddressLine2;
	@XmlElement(term = "cbc:CityName", btRef = "BT-77", order = 2, min = 0, max = 1 )
	public String deliverToCity;
	@XmlElement(term = "cbc:PostalZone", btRef = "BT-78", order = 3, min = 0, max = 1 )
	public String deliverToPostCode;
	@XmlElement(term = "cbc:CountrySubentity", btRef = "BT-79", order = 4, min = 0, max = 1 )
	public String deliverToCountrySubdivision;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AddressLine", btRef = "null", order = 5, min = 0, max = 1 )
	public AddressLine addressLine;
	@XmlElement(term = "cac:Country", btRef = "null", order = 6, min = 1, max = 1 )
	public Country country;

}
