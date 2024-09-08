package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoiceDocumentReference", btRef = "null", order = 0, min = 1, max = 1 )
public class InvoiceDocumentReference {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-25", order = 0, min = 1, max = 1 )
	public String precedingInvoiceNumber;
	@XmlElement(term = "cbc:IssueDate", btRef = "BT-26", order = 1, min = 0, max = 1 )
	public java.util.Date precedingInvoiceIssueDate;

	/* =========== Complex Properties =========== */

}
