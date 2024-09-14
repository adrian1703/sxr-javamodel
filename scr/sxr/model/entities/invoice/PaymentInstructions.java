package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PaymentMeans", btRef = "BG-16", order = 26, min = 0, max = -1 )
public class PaymentInstructions extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:PaymentMeansCode", btRef = "BT-81", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "name" )
	public Uncl4461 paymentMeansTypeCode;
	@XmlElement(term = "cbc:PaymentID", btRef = "BT-83", order = 1, min = 0, max = 1 )
	public String remittanceInformation;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:CardAccount", btRef = "BG-18", order = 2, min = 0, max = 1 )
	public PaymentCardInformation paymentCardInformation;
	@XmlElement(term = "cac:PayeeFinancialAccount", btRef = "BG-17", order = 3, min = 0, max = 1 )
	public CreditTransfer creditTransfer;
	@XmlElement(term = "cac:PaymentMandate", btRef = "BG-19", order = 4, min = 0, max = 1 )
	public DirectDebit directDebit;

}
