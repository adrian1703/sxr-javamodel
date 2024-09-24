package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxTotal", btRef = "null", type = TaxTotal.class, order = -1, min = 1, max = 2 )
public class TaxTotal extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:TaxAmount", btRef = "BT-110, BT-111", type = Float.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float invoiceTotalVatAmountInvoiceTotalVatAmountInAccountingCurrency;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxSubtotal", btRef = "BG-23", type = VatBreakdown.class, order = 1, min = 0, max = -1 )
	public List<VatBreakdown> vatBreakdown;

}
