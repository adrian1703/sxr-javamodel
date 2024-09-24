package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxSubtotal", btRef = "BG-23", type = VatBreakdown.class, order = -1, min = 0, max = -1 )
public class VatBreakdown extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:TaxableAmount", btRef = "BT-116", type = Float.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float vatCategoryTaxableAmount;
	@XmlElement(term = "cbc:TaxAmount", btRef = "BT-117", type = Float.class, order = 1, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float vatCategoryTaxAmount;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxCategory", btRef = "null", type = VatCategory.class, order = 2, min = 1, max = 1 )
	public VatCategory vatCategory;

}
