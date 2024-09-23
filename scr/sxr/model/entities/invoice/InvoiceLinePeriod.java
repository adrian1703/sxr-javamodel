package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-26", type = InvoiceLinePeriod.class, order = 5, min = 0, max = 1 )
public class InvoiceLinePeriod extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StartDate", btRef = "BT-134", type = java.util.Date.class, order = 0, min = 0, max = 1 )
	public java.util.Date invoiceLinePeriodStartDate;
	@XmlElement(term = "cbc:EndDate", btRef = "BT-135", type = java.util.Date.class, order = 1, min = 0, max = 1 )
	public java.util.Date invoiceLinePeriodEndDate;

	/* =========== Complex Properties =========== */

}
