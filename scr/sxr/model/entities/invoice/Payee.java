package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PayeeParty", btRef = "BG-10", type = Payee.class, order = 23, min = 0, max = 1 )
public class Payee extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification.class, order = 0, min = 0, max = 1 )
	public PartyIdentification partyIdentification;
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName.class, order = 1, min = 1, max = 1 )
	public PartyName partyName;
	@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity.class, order = 2, min = 0, max = 1 )
	public PartyLegalEntity partyLegalEntity;

}
