package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxCategory", btRef = "null", order = 2, min = 1, max = 1 )
public class VatCategory extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-118", order = 0, min = 1, max = 1 )
	public Uncl5305 vatCategoryCode;
	@XmlElement(term = "cbc:Percent", btRef = "BT-119", order = 1, min = 0, max = 1 )
	public int vatCategoryRate;
	@XmlElement(term = "cbc:TaxExemptionReasonCode", btRef = "BT-121", order = 2, min = 0, max = 1 )
	public String vatExemptionReasonCode;
	@XmlElement(term = "cbc:TaxExemptionReason", btRef = "BT-120", order = 3, min = 0, max = 1 )
	public String vatExemptionReasonText;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", order = 4, min = 1, max = 1 )
	public TaxScheme taxScheme;

}
