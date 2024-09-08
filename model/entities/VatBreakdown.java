package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxSubtotal", btRef = "BG-23", order = 1, min = 0, max = -1 )
public class VatBreakdown {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:TaxableAmount", btRef = "BT-116", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float vatCategoryTaxableAmount;
	@XmlElement(term = "cbc:TaxAmount", btRef = "BT-117", order = 1, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float vatCategoryTaxAmount;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxCategory", btRef = "null", order = 2, min = 1, max = 1 )
	public VatCategory vatCategory;

}
