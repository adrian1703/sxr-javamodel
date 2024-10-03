/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:LegalMonetaryTotal", btRef = "BG-22", type = DocumentTotals.class, order = -1, min = 1, max = 1 )
public class DocumentTotals extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "sumOfInvoiceLineNetAmount")
	public String sumOfInvoiceLineNetAmount_currencyID;
	@XmlElement(term = "cbc:LineExtensionAmount", btRef = "BT-106", type = Float.class, order = 0, min = 1, max = 1 )
	public float sumOfInvoiceLineNetAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "invoiceTotalAmountWithoutVat")
	public String invoiceTotalAmountWithoutVat_currencyID;
	@XmlElement(term = "cbc:TaxExclusiveAmount", btRef = "BT-109", type = Float.class, order = 1, min = 1, max = 1 )
	public float invoiceTotalAmountWithoutVat;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "invoiceTotalAmountWithVat")
	public String invoiceTotalAmountWithVat_currencyID;
	@XmlElement(term = "cbc:TaxInclusiveAmount", btRef = "BT-112", type = Float.class, order = 2, min = 1, max = 1 )
	public float invoiceTotalAmountWithVat;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "sumOfAllowancesOnDocumentLevel")
	public String sumOfAllowancesOnDocumentLevel_currencyID;
	@XmlElement(term = "cbc:AllowanceTotalAmount", btRef = "BT-107", type = Float.class, order = 3, min = 0, max = 1 )
	public float sumOfAllowancesOnDocumentLevel;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "sumOfChargesOnDocumentLevel")
	public String sumOfChargesOnDocumentLevel_currencyID;
	@XmlElement(term = "cbc:ChargeTotalAmount", btRef = "BT-108", type = Float.class, order = 4, min = 0, max = 1 )
	public float sumOfChargesOnDocumentLevel;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "paidAmount")
	public String paidAmount_currencyID;
	@XmlElement(term = "cbc:PrepaidAmount", btRef = "BT-113", type = Float.class, order = 5, min = 0, max = 1 )
	public float paidAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "roundingAmount")
	public String roundingAmount_currencyID;
	@XmlElement(term = "cbc:PayableRoundingAmount", btRef = "BT-114", type = Float.class, order = 6, min = 0, max = 1 )
	public float roundingAmount;
	@XmlAttribute( term = "currencyID", btRef = "null", type = String.class, parent = "amountDueForPayment")
	public String amountDueForPayment_currencyID;
	@XmlElement(term = "cbc:PayableAmount", btRef = "BT-115", type = Float.class, order = 7, min = 1, max = 1 )
	public float amountDueForPayment;

	/* =========== Complex Properties =========== */

}
