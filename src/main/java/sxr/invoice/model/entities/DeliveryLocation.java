/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:DeliveryLocation", btRef = "null", type = DeliveryLocation.class, order = -1, min = 0, max = 1 )
public class DeliveryLocation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "deliverToLocationIdentifier")
	public String deliverToLocationIdentifier_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-71", type = String.class, order = 0, min = 0, max = 1 )
	public String deliverToLocationIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Address", btRef = "BG-15", type = DeliverToAddress.class, order = 1, min = 0, max = 1 )
	public DeliverToAddress deliverToAddress;

}
