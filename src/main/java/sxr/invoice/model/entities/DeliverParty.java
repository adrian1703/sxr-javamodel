/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:DeliveryParty", btRef = "null", type = DeliverParty.class, order = -1, min = 0, max = 1 )
public class DeliverParty extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName4.class, order = 0, min = 1, max = 1 )
	public PartyName4 partyName4;

}
