package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:BillingReference", btRef = "BG-3", order = 14, min = 0, max = -1 )
public class PrecedingInvoiceReference {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:InvoiceDocumentReference", btRef = "null", order = 0, min = 1, max = 1 )
	public InvoiceDocumentReference invoiceDocumentReference;

}
