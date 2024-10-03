/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:SellersItemIdentification", btRef = "null", type = SellersItemIdentification.class, order = -1, min = 0, max = 1 )
public class SellersItemIdentification extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-155", type = String.class, order = 0, min = 1, max = 1 )
	public String itemSellersIdentifier;

	/* =========== Complex Properties =========== */

}
