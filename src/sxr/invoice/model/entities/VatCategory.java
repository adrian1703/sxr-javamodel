/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.*;
import sxr.core.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxCategory", btRef = "null", type = VatCategory.class, order = -1, min = 1, max = 1 )
public class VatCategory extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-118", type = Uncl5305.class, order = 0, min = 1, max = 1 )
	public Uncl5305 vatCategoryCode;
	@XmlElement(term = "cbc:Percent", btRef = "BT-119", type = Integer.class, order = 1, min = 0, max = 1 )
	public int vatCategoryRate;
	@XmlElement(term = "cbc:TaxExemptionReasonCode", btRef = "BT-121", type = String.class, order = 2, min = 0, max = 1 )
	public String vatExemptionReasonCode;
	@XmlElement(term = "cbc:TaxExemptionReason", btRef = "BT-120", type = String.class, order = 3, min = 0, max = 1 )
	public String vatExemptionReasonText;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", type = TaxScheme4.class, order = 4, min = 1, max = 1 )
	public TaxScheme4 taxScheme4;

}
