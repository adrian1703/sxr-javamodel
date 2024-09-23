package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PaymentMandate", btRef = "BG-19", type = DirectDebit.class, order = 4, min = 0, max = 1 )
public class DirectDebit extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-89", type = String.class, order = 0, min = 0, max = 1 )
	public String mandateReferenceIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PayerFinancialAccount", btRef = "null", type = PayerFinancialAccount.class, order = 1, min = 0, max = 1 )
	public PayerFinancialAccount payerFinancialAccount;

}
