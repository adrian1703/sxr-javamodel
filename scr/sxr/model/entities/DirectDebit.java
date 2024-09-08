package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PaymentMandate", btRef = "BG-19", order = 4, min = 0, max = 1 )
public class DirectDebit {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-89", order = 0, min = 0, max = 1 )
	public String mandateReferenceIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PayerFinancialAccount", btRef = "null", order = 1, min = 0, max = 1 )
	public PayerFinancialAccount payerFinancialAccount;

}
