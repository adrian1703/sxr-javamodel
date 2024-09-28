package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:LegalMonetaryTotal", btRef = "BG-22", type = DocumentTotals.class, order = -1, min = 1, max = 1 )
public class DocumentTotals extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "sumOfInvoiceLineNetAmount")
	public Object sumOfInvoiceLineNetAmount_currencyID;
	@XmlElement(term = "cbc:LineExtensionAmount", btRef = "BT-106", type = Float.class, order = 0, min = 1, max = 1 )
	public float sumOfInvoiceLineNetAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "invoiceTotalAmountWithoutVat")
	public Object invoiceTotalAmountWithoutVat_currencyID;
	@XmlElement(term = "cbc:TaxExclusiveAmount", btRef = "BT-109", type = Float.class, order = 1, min = 1, max = 1 )
	public float invoiceTotalAmountWithoutVat;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "invoiceTotalAmountWithVat")
	public Object invoiceTotalAmountWithVat_currencyID;
	@XmlElement(term = "cbc:TaxInclusiveAmount", btRef = "BT-112", type = Float.class, order = 2, min = 1, max = 1 )
	public float invoiceTotalAmountWithVat;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "sumOfAllowancesOnDocumentLevel")
	public Object sumOfAllowancesOnDocumentLevel_currencyID;
	@XmlElement(term = "cbc:AllowanceTotalAmount", btRef = "BT-107", type = Float.class, order = 3, min = 0, max = 1 )
	public float sumOfAllowancesOnDocumentLevel;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "sumOfChargesOnDocumentLevel")
	public Object sumOfChargesOnDocumentLevel_currencyID;
	@XmlElement(term = "cbc:ChargeTotalAmount", btRef = "BT-108", type = Float.class, order = 4, min = 0, max = 1 )
	public float sumOfChargesOnDocumentLevel;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "paidAmount")
	public Object paidAmount_currencyID;
	@XmlElement(term = "cbc:PrepaidAmount", btRef = "BT-113", type = Float.class, order = 5, min = 0, max = 1 )
	public float paidAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "roundingAmount")
	public Object roundingAmount_currencyID;
	@XmlElement(term = "cbc:PayableRoundingAmount", btRef = "BT-114", type = Float.class, order = 6, min = 0, max = 1 )
	public float roundingAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = Object.class, parent = "amountDueForPayment")
	public Object amountDueForPayment_currencyID;
	@XmlElement(term = "cbc:PayableAmount", btRef = "BT-115", type = Float.class, order = 7, min = 1, max = 1 )
	public float amountDueForPayment;

	/* =========== Complex Properties =========== */

}
