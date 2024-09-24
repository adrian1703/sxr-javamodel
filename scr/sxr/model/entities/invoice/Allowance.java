package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AllowanceCharge", btRef = "null", type = Allowance.class, order = -1, min = 0, max = 1 )
public class Allowance extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ChargeIndicator", btRef = "null", type = Boolean.class, order = 0, min = 1, max = 1 )
	public boolean ChargeIndicator2;
	@XmlElement(term = "cbc:Amount", btRef = "BT-147", type = Float.class, order = 1, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float itemPriceDiscount;
	@XmlElement(term = "cbc:BaseAmount", btRef = "BT-148", type = Float.class, order = 2, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float itemGrossPrice;

	/* =========== Complex Properties =========== */

}
