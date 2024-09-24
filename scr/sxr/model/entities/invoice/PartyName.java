package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName.class, order = -1, min = 0, max = 1 )
public class PartyName extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-28", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerTradingName;

	/* =========== Complex Properties =========== */

}
