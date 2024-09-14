package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AllowanceCharge", btRef = "null", order = 2, min = 0, max = 1 )
public class Allowance extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ChargeIndicator", btRef = "null", order = 0, min = 1, max = 1 )
	public boolean ChargeIndicator;
	@XmlElement(term = "cbc:Amount", btRef = "BT-147", order = 1, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float itemPriceDiscount;
	@XmlElement(term = "cbc:BaseAmount", btRef = "BT-148", order = 2, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float itemGrossPrice;

	/* =========== Complex Properties =========== */

}
