package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:FinancialInstitutionBranch", btRef = "null", order = 2, min = 0, max = 1 )
public class FinancialInstitutionBranch {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-86", order = 0, min = 1, max = 1 )
	public String paymentServiceProviderIdentifier;

	/* =========== Complex Properties =========== */

}
