package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxTotal", btRef = "null", order = 29, min = 1, max = 2 )
public class TaxTotal {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:TaxAmount", btRef = "BT-110, BT-111", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float invoiceTotalVatAmountInvoiceTotalVatAmountInAccountingCurrency;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxSubtotal", btRef = "BG-23", order = 1, min = 0, max = -1 )
	public List<VatBreakdown> vatBreakdown;

}
