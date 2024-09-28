package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification2.class, order = -1, min = 0, max = 1 )
public class PartyIdentification2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = Object.class, parent = "payeeIdentifierOrBankAssignedCreditorIdentifier")
	public Object payeeIdentifierOrBankAssignedCreditorIdentifier_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-60, BT-90", type = String.class, order = 0, min = 1, max = 1 )
	public String payeeIdentifierOrBankAssignedCreditorIdentifier;

	/* =========== Complex Properties =========== */

}
