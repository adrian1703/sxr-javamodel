package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-14", order = 12, min = 0, max = 1 )
public class DeliveryOrInvoicePeriod {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StartDate", btRef = "BT-73", order = 0, min = 0, max = 1 )
	public java.util.Date invoicingPeriodStartDate;
	@XmlElement(term = "cbc:EndDate", btRef = "BT-74", order = 1, min = 0, max = 1 )
	public java.util.Date invoicingPeriodEndDate;
	@XmlElement(term = "cbc:DescriptionCode", btRef = "BT-8", order = 2, min = 0, max = 1 )
	public Uncl2005 valueAddedTaxPointDateCode;

	/* =========== Complex Properties =========== */

}
