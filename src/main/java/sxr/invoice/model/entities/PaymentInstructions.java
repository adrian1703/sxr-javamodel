/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.codes.Uncl4461;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:PaymentMeans", btRef = "BG-16", type = PaymentInstructions.class, order = -1, min = 0, max = -1 )
public class PaymentInstructions extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "name", btRef = "null", type = String.class, parent = "paymentMeansTypeCode")
	public String paymentMeansTypeCode_name;
	@XmlElement(term = "cbc:PaymentMeansCode", btRef = "BT-81", type = Uncl4461.class, order = 0, min = 1, max = 1 )
	public Uncl4461 paymentMeansTypeCode;
	@XmlElement(term = "cbc:PaymentID", btRef = "BT-83", type = String.class, order = 1, min = 0, max = 1 )
	public String remittanceInformation;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:CardAccount", btRef = "BG-18", type = PaymentCardInformation.class, order = 2, min = 0, max = 1 )
	public PaymentCardInformation paymentCardInformation;
	@XmlElement(term = "cac:PayeeFinancialAccount", btRef = "BG-17", type = CreditTransfer.class, order = 3, min = 0, max = 1 )
	public CreditTransfer creditTransfer;
	@XmlElement(term = "cac:PaymentMandate", btRef = "BG-19", type = DirectDebit.class, order = 4, min = 0, max = 1 )
	public DirectDebit directDebit;

}
