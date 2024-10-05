/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:BillingReference", btRef = "BG-3", type = PrecedingInvoiceReference.class, order = -1, min = 0, max = -1 )
public class PrecedingInvoiceReference extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:InvoiceDocumentReference", btRef = "null", type = InvoiceDocumentReference.class, order = 0, min = 1, max = 1 )
	public InvoiceDocumentReference invoiceDocumentReference;

}
