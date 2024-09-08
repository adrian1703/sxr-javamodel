package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-26", order = 5, min = 0, max = 1 )
public class InvoiceLinePeriod {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StartDate", btRef = "BT-134", order = 0, min = 0, max = 1 )
	public java.util.Date invoiceLinePeriodStartDate;
	@XmlElement(term = "cbc:EndDate", btRef = "BT-135", order = 1, min = 0, max = 1 )
	public java.util.Date invoiceLinePeriodEndDate;

	/* =========== Complex Properties =========== */

}
