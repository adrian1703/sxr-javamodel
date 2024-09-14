package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AccountingCustomerParty", btRef = "BG-7", order = 22, min = 1, max = 1 )
public class Buyer extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Party", btRef = "null", order = 0, min = 1, max = 1 )
	public Party party;

}
