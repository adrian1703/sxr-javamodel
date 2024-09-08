package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ClassifiedTaxCategory", btRef = "BG-30", order = 7, min = 1, max = 1 )
public class LineVatInformation {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-151", order = 0, min = 1, max = 1 )
	public Uncl5305 invoicedItemVatCategoryCode;
	@XmlElement(term = "cbc:Percent", btRef = "BT-152", order = 1, min = 0, max = 1 )
	public int invoicedItemVatRate;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", order = 2, min = 1, max = 1 )
	public TaxScheme taxScheme;

}
