package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:LegalMonetaryTotal", btRef = "BG-22", type = DocumentTotals.class, order = -1, min = 1, max = 1 )
public class DocumentTotals extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:LineExtensionAmount", btRef = "BT-106", type = Float.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float sumOfInvoiceLineNetAmount;
	@XmlElement(term = "cbc:TaxExclusiveAmount", btRef = "BT-109", type = Float.class, order = 1, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float invoiceTotalAmountWithoutVat;
	@XmlElement(term = "cbc:TaxInclusiveAmount", btRef = "BT-112", type = Float.class, order = 2, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float invoiceTotalAmountWithVat;
	@XmlElement(term = "cbc:AllowanceTotalAmount", btRef = "BT-107", type = Float.class, order = 3, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float sumOfAllowancesOnDocumentLevel;
	@XmlElement(term = "cbc:ChargeTotalAmount", btRef = "BT-108", type = Float.class, order = 4, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float sumOfChargesOnDocumentLevel;
	@XmlElement(term = "cbc:PrepaidAmount", btRef = "BT-113", type = Float.class, order = 5, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float paidAmount;
	@XmlElement(term = "cbc:PayableRoundingAmount", btRef = "BT-114", type = Float.class, order = 6, min = 0, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float roundingAmount;
	@XmlElement(term = "cbc:PayableAmount", btRef = "BT-115", type = Float.class, order = 7, min = 1, max = 1 )
	@XmlAttribute( term = "currencyID" )
	public float amountDueForPayment;

	/* =========== Complex Properties =========== */

}
