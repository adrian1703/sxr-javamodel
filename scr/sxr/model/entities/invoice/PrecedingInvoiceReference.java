package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:BillingReference", btRef = "BG-3", type = PrecedingInvoiceReference.class, order = 14, min = 0, max = -1 )
public class PrecedingInvoiceReference extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:InvoiceDocumentReference", btRef = "null", type = InvoiceDocumentReference.class, order = 0, min = 1, max = 1 )
	public InvoiceDocumentReference invoiceDocumentReference;

}
