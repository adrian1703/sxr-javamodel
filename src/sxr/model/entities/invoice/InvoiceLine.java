package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:InvoiceLine", btRef = "BG-25", type = InvoiceLine.class, order = -1, min = 1, max = -1 )
public class InvoiceLine extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-126", type = String.class, order = 0, min = 1, max = 1 )
	public String invoiceLineIdentifier;
	@XmlElement(term = "cbc:Note", btRef = "BT-127", type = String.class, order = 1, min = 0, max = 1 )
	public String invoiceLineNote;
	@XmlAttribute( term = "unitCode", btRef = "null", type = Unecerec20.class, parent = "invoicedQuantity")
	public Unecerec20 invoicedQuantity_unitCode;
	@XmlElement(term = "cbc:InvoicedQuantity", btRef = "BT-129", type = Integer.class, order = 2, min = 1, max = 1 )
	public int invoicedQuantity;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "invoiceLineNetAmount")
	public String invoiceLineNetAmount_currencyID;
	@XmlElement(term = "cbc:LineExtensionAmount", btRef = "BT-131", type = Float.class, order = 3, min = 1, max = 1 )
	public float invoiceLineNetAmount;
	@XmlElement(term = "cbc:AccountingCost", btRef = "BT-133", type = String.class, order = 4, min = 0, max = 1 )
	public String invoiceLineBuyerAccountingReference;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-26", type = InvoiceLinePeriod.class, order = 5, min = 0, max = 1 )
	public InvoiceLinePeriod invoiceLinePeriod;
	@XmlElement(term = "cac:OrderLineReference", btRef = "null", type = OrderLineReference.class, order = 6, min = 0, max = 1 )
	public OrderLineReference orderLineReference;
	@XmlElement(term = "cac:DocumentReference", btRef = "null", type = LineObjectIdentifier.class, order = 7, min = 0, max = 1 )
	public LineObjectIdentifier lineObjectIdentifier;
	@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-27, BG-28", type = InvoiceLineAllowancesOrCharges.class, order = 8, min = 0, max = -1 )
	public List<InvoiceLineAllowancesOrCharges> invoiceLineAllowancesOrCharges;
	@XmlElement(term = "cac:Item", btRef = "BG-31", type = ItemInformation.class, order = 9, min = 1, max = 1 )
	public ItemInformation itemInformation;
	@XmlElement(term = "cac:Price", btRef = "BG-29", type = PriceDetails.class, order = 10, min = 1, max = 1 )
	public PriceDetails priceDetails;

}
