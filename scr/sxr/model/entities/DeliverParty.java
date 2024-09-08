package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:DeliveryParty", btRef = "null", order = 2, min = 0, max = 1 )
public class DeliverParty {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyName", btRef = "null", order = 0, min = 1, max = 1 )
	public PartyName partyName;

}
