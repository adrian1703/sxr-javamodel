package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-14", type = DeliveryOrInvoicePeriod.class, order = 12, min = 0, max = 1 )
public class DeliveryOrInvoicePeriod extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:StartDate", btRef = "BT-73", type = java.util.Date.class, order = 0, min = 0, max = 1 )
	public java.util.Date invoicingPeriodStartDate;
	@XmlElement(term = "cbc:EndDate", btRef = "BT-74", type = java.util.Date.class, order = 1, min = 0, max = 1 )
	public java.util.Date invoicingPeriodEndDate;
	@XmlElement(term = "cbc:DescriptionCode", btRef = "BT-8", type = Uncl2005.class, order = 2, min = 0, max = 1 )
	public Uncl2005 valueAddedTaxPointDateCode;

	/* =========== Complex Properties =========== */

}
