/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.*;
import sxr.core.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification.class, order = -1, min = 0, max = -1 )
public class PartyIdentification extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "sellerIdentifierOrBankAssignedCreditorIdentifier")
	public String sellerIdentifierOrBankAssignedCreditorIdentifier_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-29, BT-90", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerIdentifierOrBankAssignedCreditorIdentifier;

	/* =========== Complex Properties =========== */

}
