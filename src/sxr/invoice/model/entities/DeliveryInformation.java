/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:Delivery", btRef = "BG-13", type = DeliveryInformation.class, order = -1, min = 0, max = 1 )
public class DeliveryInformation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ActualDeliveryDate", btRef = "BT-72", type = java.util.Date.class, order = 0, min = 0, max = 1 )
	public java.util.Date actualDeliveryDate;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:DeliveryLocation", btRef = "null", type = DeliveryLocation.class, order = 1, min = 0, max = 1 )
	public DeliveryLocation DeliveryLocation;
	@XmlElement(term = "cac:DeliveryParty", btRef = "null", type = DeliverParty.class, order = 2, min = 0, max = 1 )
	public DeliverParty deliverParty;

}
