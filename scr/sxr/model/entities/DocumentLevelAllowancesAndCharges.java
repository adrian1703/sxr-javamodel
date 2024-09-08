package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-20, BG-21", order = 28, min = 0, max = -1 )
public class DocumentLevelAllowancesAndCharges {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ChargeIndicator", btRef = "null", order = 0, min = 1, max = 1 )
	public boolean ChargeIndicator;
	@XmlElement(term = "cbc:AllowanceChargeReasonCode", btRef = "BT-98, BT-105", order = 1, min = 0, max = 1 )
	public Uncl5189 documentLevelAllowanceOrChargeReasonCode;
	@XmlElement(term = "cbc:AllowanceChargeReason", btRef = "BT-97, BT-104", order = 2, min = 0, max = 1 )
	public String documentLevelAllowanceOrChargeReason;
	@XmlElement(term = "cbc:MultiplierFactorNumeric", btRef = "BT-94,BT-101", order = 3, min = 0, max = 1 )
	public int documentLevelAllowanceOrChargePercentage;
	@XmlElement(term = "cbc:Amount", btRef = "BT-92,BT-99", order = 4, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float documentLevelAllowanceOrChargeAmount;
	@XmlElement(term = "cbc:BaseAmount", btRef = "BT-93,BT-100", order = 5, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float documentLevelAllowanceOrChargeBaseAmount;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxCategory", btRef = "null", order = 6, min = 1, max = 1 )
	public TaxCategory taxCategory;

}
