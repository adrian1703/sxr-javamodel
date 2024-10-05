/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:Price", btRef = "BG-29", type = PriceDetails.class, order = -1, min = 1, max = 1 )
public class PriceDetails extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "itemNetPrice")
	public String itemNetPrice_currencyID;
	@XmlElement(term = "cbc:PriceAmount", btRef = "BT-146", type = Float.class, order = 0, min = 1, max = 1 )
	public float itemNetPrice;
	@XmlAttribute( term = "unitCode", btRef = "null", type = String.class, parent = "itemPriceBaseQuantity")
	public String itemPriceBaseQuantity_unitCode;
	@XmlElement(term = "cbc:BaseQuantity", btRef = "BT-149", type = Integer.class, order = 1, min = 0, max = 1 )
	public int itemPriceBaseQuantity;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AllowanceCharge", btRef = "null", type = Allowance.class, order = 2, min = 0, max = 1 )
	public Allowance allowance;

}
