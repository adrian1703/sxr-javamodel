package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyIdentification", btRef = "null", order = 0, min = 0, max = 1 )
public class PartyIdentification {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-60, BT-90", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String payeeIdentifierOrBankAssignedCreditorIdentifier;

	/* =========== Complex Properties =========== */

}
