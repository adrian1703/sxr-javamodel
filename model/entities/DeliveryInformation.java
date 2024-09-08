package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Delivery", btRef = "BG-13", order = 25, min = 0, max = 1 )
public class DeliveryInformation {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ActualDeliveryDate", btRef = "BT-72", order = 0, min = 0, max = 1 )
	public java.util.Date actualDeliveryDate;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:DeliveryLocation", btRef = "null", order = 1, min = 0, max = 1 )
	public DeliveryLocation DeliveryLocation;
	@XmlElement(term = "cac:DeliveryParty", btRef = "null", order = 2, min = 0, max = 1 )
	public DeliverParty deliverParty;

}
