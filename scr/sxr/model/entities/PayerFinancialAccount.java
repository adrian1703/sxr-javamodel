package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PayerFinancialAccount", btRef = "null", order = 1, min = 0, max = 1 )
public class PayerFinancialAccount {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-91", order = 0, min = 1, max = 1 )
	public String debitedAccountIdentifier;

	/* =========== Complex Properties =========== */

}
