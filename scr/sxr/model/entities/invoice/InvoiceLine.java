package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoiceLine", btRef = "BG-25", order = 31, min = 1, max = -1 )
public class InvoiceLine extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-126", order = 0, min = 1, max = 1 )
	public String invoiceLineIdentifier;
	@XmlElement(term = "cbc:Note", btRef = "BT-127", order = 1, min = 0, max = 1 )
	public String invoiceLineNote;
	@XmlElement(term = "cbc:InvoicedQuantity", btRef = "BT-129", order = 2, min = 1, max = 1 )
	@XmlAttribute( term = "unitCode" )
	public int invoicedQuantity;
	@XmlElement(term = "cbc:LineExtensionAmount", btRef = "BT-131", order = 3, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float invoiceLineNetAmount;
	@XmlElement(term = "cbc:AccountingCost", btRef = "BT-133", order = 4, min = 0, max = 1 )
	public String invoiceLineBuyerAccountingReference;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-26", order = 5, min = 0, max = 1 )
	public InvoiceLinePeriod invoiceLinePeriod;
	@XmlElement(term = "cac:OrderLineReference", btRef = "null", order = 6, min = 0, max = 1 )
	public OrderLineReference orderLineReference;
	@XmlElement(term = "cac:DocumentReference", btRef = "null", order = 7, min = 0, max = 1 )
	public LineObjectIdentifier lineObjectIdentifier;
	@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-27, BG-28", order = 8, min = 0, max = -1 )
	public List<InvoiceLineAllowancesOrCharges> invoiceLineAllowancesOrCharges;
	@XmlElement(term = "cac:Item", btRef = "BG-31", order = 9, min = 1, max = 1 )
	public ItemInformation itemInformation;
	@XmlElement(term = "cac:Price", btRef = "BG-29", order = 10, min = 1, max = 1 )
	public PriceDetails priceDetails;

}
