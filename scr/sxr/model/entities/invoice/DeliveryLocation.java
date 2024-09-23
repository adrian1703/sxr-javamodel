package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:DeliveryLocation", btRef = "null", type = DeliveryLocation.class, order = 1, min = 0, max = 1 )
public class DeliveryLocation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-71", type = String.class, order = 0, min = 0, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String deliverToLocationIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Address", btRef = "BG-15", type = DeliverToAddress.class, order = 1, min = 0, max = 1 )
	public DeliverToAddress deliverToAddress;

}
