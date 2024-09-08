package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:BuyersItemIdentification", btRef = "null", order = 2, min = 0, max = 1 )
public class BuyersItemIdentification {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-156", order = 0, min = 1, max = 1 )
	public String itemBuyersIdentifier;

	/* =========== Complex Properties =========== */

}
