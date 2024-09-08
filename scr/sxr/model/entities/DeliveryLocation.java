package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:DeliveryLocation", btRef = "null", order = 1, min = 0, max = 1 )
public class DeliveryLocation {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-71", order = 0, min = 0, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String deliverToLocationIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Address", btRef = "BG-15", order = 1, min = 0, max = 1 )
	public DeliverToAddress deliverToAddress;

}
