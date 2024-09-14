package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PayeeFinancialAccount", btRef = "BG-17", order = 3, min = 0, max = 1 )
public class CreditTransfer extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-84", order = 0, min = 1, max = 1 )
	public String paymentAccountIdentifier;
	@XmlElement(term = "cbc:Name", btRef = "BT-85", order = 1, min = 0, max = 1 )
	public String paymentAccountName;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:FinancialInstitutionBranch", btRef = "null", order = 2, min = 0, max = 1 )
	public FinancialInstitutionBranch financialInstitutionBranch;

}
