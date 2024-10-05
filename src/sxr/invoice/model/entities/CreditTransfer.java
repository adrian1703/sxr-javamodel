/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:PayeeFinancialAccount", btRef = "BG-17", type = CreditTransfer.class, order = -1, min = 0, max = 1 )
public class CreditTransfer extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-84", type = String.class, order = 0, min = 1, max = 1 )
	public String paymentAccountIdentifier;
	@XmlElement(term = "cbc:Name", btRef = "BT-85", type = String.class, order = 1, min = 0, max = 1 )
	public String paymentAccountName;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:FinancialInstitutionBranch", btRef = "null", type = FinancialInstitutionBranch.class, order = 2, min = 0, max = 1 )
	public FinancialInstitutionBranch financialInstitutionBranch;

}
