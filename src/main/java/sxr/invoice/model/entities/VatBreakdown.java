/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:TaxSubtotal", btRef = "BG-23", type = VatBreakdown.class, order = -1, min = 0, max = -1 )
public class VatBreakdown extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "vatCategoryTaxableAmount")
	public String vatCategoryTaxableAmount_currencyID;
	@XmlElement(term = "cbc:TaxableAmount", btRef = "BT-116", type = Float.class, order = 0, min = 1, max = 1 )
	public float vatCategoryTaxableAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "vatCategoryTaxAmount")
	public String vatCategoryTaxAmount_currencyID;
	@XmlElement(term = "cbc:TaxAmount", btRef = "BT-117", type = Float.class, order = 1, min = 1, max = 1 )
	public float vatCategoryTaxAmount;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxCategory", btRef = "null", type = VatCategory.class, order = 2, min = 1, max = 1 )
	public VatCategory vatCategory;

}
