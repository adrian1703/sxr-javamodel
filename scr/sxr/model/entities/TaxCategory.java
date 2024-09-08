package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxCategory", btRef = "null", order = 6, min = 1, max = 1 )
public class TaxCategory {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-95,BT-102", order = 0, min = 1, max = 1 )
	public Uncl5305 documentLevelAllowanceOrChargeVatCategoryCode;
	@XmlElement(term = "cbc:Percent", btRef = "BT-96,BT-103", order = 1, min = 0, max = 1 )
	public int documentLevelAllowanceOrChargeVatRate;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", order = 2, min = 1, max = 1 )
	public TaxScheme taxScheme;

}
