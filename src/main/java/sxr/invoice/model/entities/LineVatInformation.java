/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.codes.Uncl5305;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:ClassifiedTaxCategory", btRef = "BG-30", type = LineVatInformation.class, order = -1, min = 1, max = 1 )
public class LineVatInformation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-151", type = Uncl5305.class, order = 0, min = 1, max = 1 )
	public Uncl5305 invoicedItemVatCategoryCode;
	@XmlElement(term = "cbc:Percent", btRef = "BT-152", type = Integer.class, order = 1, min = 0, max = 1 )
	public int invoicedItemVatRate;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", type = TaxScheme5.class, order = 2, min = 1, max = 1 )
	public TaxScheme5 taxScheme5;

}
