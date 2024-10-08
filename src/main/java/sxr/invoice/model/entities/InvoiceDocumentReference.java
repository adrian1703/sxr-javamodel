/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:InvoiceDocumentReference", btRef = "null", type = InvoiceDocumentReference.class, order = -1, min = 1, max = 1 )
public class InvoiceDocumentReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-25", type = String.class, order = 0, min = 1, max = 1 )
	public String precedingInvoiceNumber;
	@XmlElement(term = "cbc:IssueDate", btRef = "BT-26", type = java.util.Date.class, order = 1, min = 0, max = 1 )
	public java.util.Date precedingInvoiceIssueDate;

	/* =========== Complex Properties =========== */

}
