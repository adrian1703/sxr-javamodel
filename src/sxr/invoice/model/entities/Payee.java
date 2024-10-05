/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:PayeeParty", btRef = "BG-10", type = Payee.class, order = -1, min = 0, max = 1 )
public class Payee extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification2.class, order = 0, min = 0, max = 1 )
	public PartyIdentification2 partyIdentification2;
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName2.class, order = 1, min = 1, max = 1 )
	public PartyName2 partyName2;
	@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity2.class, order = 2, min = 0, max = 1 )
	public PartyLegalEntity2 partyLegalEntity2;

}
