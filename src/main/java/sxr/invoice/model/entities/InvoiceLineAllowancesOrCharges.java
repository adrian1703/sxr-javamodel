/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.codes.Uncl5189;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-27, BG-28", type = InvoiceLineAllowancesOrCharges.class, order = -1, min = 0, max = -1 )
public class InvoiceLineAllowancesOrCharges extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ChargeIndicator", btRef = "null", type = Boolean.class, order = 0, min = 1, max = 1 )
	public boolean ChargeIndicator1;
	@XmlElement(term = "cbc:AllowanceChargeReasonCode", btRef = "BT-140, BT-145", type = Uncl5189.class, order = 1, min = 0, max = 1 )
	public Uncl5189 lineLevelAllowanceOrChargeReasonCode;
	@XmlElement(term = "cbc:AllowanceChargeReason", btRef = "BT-139, BT-144", type = String.class, order = 2, min = 0, max = 1 )
	public String lineLevelAllowanceOrChargeReason;
	@XmlElement(term = "cbc:MultiplierFactorNumeric", btRef = "BT-138,BT-143", type = Integer.class, order = 3, min = 0, max = 1 )
	public int lineLevelAllowanceOrChargePercentage;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "lineLevelAllowanceOrChargeAmount")
	public String lineLevelAllowanceOrChargeAmount_currencyID;
	@XmlElement(term = "cbc:Amount", btRef = "BT-136,BT-141", type = Float.class, order = 4, min = 1, max = 1 )
	public float lineLevelAllowanceOrChargeAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "lineLevelAllowanceOrChargeBaseAmount")
	public String lineLevelAllowanceOrChargeBaseAmount_currencyID;
	@XmlElement(term = "cbc:BaseAmount", btRef = "BT-137,BT-142", type = Float.class, order = 5, min = 0, max = 1 )
	public float lineLevelAllowanceOrChargeBaseAmount;

	/* =========== Complex Properties =========== */

}
