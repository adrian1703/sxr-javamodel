/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxCategory", btRef = "null", type = TaxCategory.class, order = -1, min = 1, max = 1 )
public class TaxCategory extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-95,BT-102", type = Uncl5305.class, order = 0, min = 1, max = 1 )
	public Uncl5305 documentLevelAllowanceOrChargeVatCategoryCode;
	@XmlElement(term = "cbc:Percent", btRef = "BT-96,BT-103", type = Integer.class, order = 1, min = 0, max = 1 )
	public int documentLevelAllowanceOrChargeVatRate;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", type = TaxScheme3.class, order = 2, min = 1, max = 1 )
	public TaxScheme3 taxScheme3;

}
