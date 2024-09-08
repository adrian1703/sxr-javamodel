package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:SellersItemIdentification", btRef = "null", order = 3, min = 0, max = 1 )
public class SellersItemIdentification {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-155", order = 0, min = 1, max = 1 )
	public String itemSellersIdentifier;

	/* =========== Complex Properties =========== */

}
