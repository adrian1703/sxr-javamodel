package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Price", btRef = "BG-29", type = PriceDetails.class, order = -1, min = 1, max = 1 )
public class PriceDetails extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:PriceAmount", btRef = "BT-146", type = Float.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float itemNetPrice;
	@XmlElement(term = "cbc:BaseQuantity", btRef = "BT-149", type = Integer.class, order = 1, min = 0, max = 1 )
	@XmlAttribute( term = "unitCode" )
	public int itemPriceBaseQuantity;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:AllowanceCharge", btRef = "null", type = Allowance.class, order = 2, min = 0, max = 1 )
	public Allowance allowance;

}
