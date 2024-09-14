package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-27, BG-28", order = 8, min = 0, max = -1 )
public class InvoiceLineAllowancesOrCharges extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ChargeIndicator", btRef = "null", order = 0, min = 1, max = 1 )
	public boolean ChargeIndicator;
	@XmlElement(term = "cbc:AllowanceChargeReasonCode", btRef = "BT-140, BT-145", order = 1, min = 0, max = 1 )
	public Uncl5189 lineLevelAllowanceOrChargeReasonCode;
	@XmlElement(term = "cbc:AllowanceChargeReason", btRef = "BT-139, BT-144", order = 2, min = 0, max = 1 )
	public String lineLevelAllowanceOrChargeReason;
	@XmlElement(term = "cbc:MultiplierFactorNumeric", btRef = "BT-138,BT-143", order = 3, min = 0, max = 1 )
	public int lineLevelAllowanceOrChargePercentage;
	@XmlElement(term = "cbc:Amount", btRef = "BT-136,BT-141", order = 4, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float lineLevelAllowanceOrChargeAmount;
	@XmlElement(term = "cbc:BaseAmount", btRef = "BT-137,BT-142", order = 5, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float lineLevelAllowanceOrChargeBaseAmount;

	/* =========== Complex Properties =========== */

}
