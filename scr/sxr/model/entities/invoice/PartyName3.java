package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName3.class, order = -1, min = 1, max = 1 )
public class PartyName3 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-62", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerTaxRepresentativeName;

	/* =========== Complex Properties =========== */

}
