package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-20, BG-21", type = DocumentLevelAllowancesAndCharges.class, order = -1, min = 0, max = -1 )
public class DocumentLevelAllowancesAndCharges extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ChargeIndicator", btRef = "null", type = Boolean.class, order = 0, min = 1, max = 1 )
	public boolean ChargeIndicator;
	@XmlElement(term = "cbc:AllowanceChargeReasonCode", btRef = "BT-98, BT-105", type = Uncl5189.class, order = 1, min = 0, max = 1 )
	public Uncl5189 documentLevelAllowanceOrChargeReasonCode;
	@XmlElement(term = "cbc:AllowanceChargeReason", btRef = "BT-97, BT-104", type = String.class, order = 2, min = 0, max = 1 )
	public String documentLevelAllowanceOrChargeReason;
	@XmlElement(term = "cbc:MultiplierFactorNumeric", btRef = "BT-94,BT-101", type = Integer.class, order = 3, min = 0, max = 1 )
	public int documentLevelAllowanceOrChargePercentage;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "documentLevelAllowanceOrChargeAmount")
	public Object documentLevelAllowanceOrChargeAmount_currencyID;
	@XmlElement(term = "cbc:Amount", btRef = "BT-92,BT-99", type = Float.class, order = 4, min = 1, max = 1 )
	public float documentLevelAllowanceOrChargeAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "documentLevelAllowanceOrChargeBaseAmount")
	public Object documentLevelAllowanceOrChargeBaseAmount_currencyID;
	@XmlElement(term = "cbc:BaseAmount", btRef = "BT-93,BT-100", type = Float.class, order = 5, min = 0, max = 1 )
	public float documentLevelAllowanceOrChargeBaseAmount;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxCategory", btRef = "null", type = TaxCategory.class, order = 6, min = 1, max = 1 )
	public TaxCategory taxCategory;

}
