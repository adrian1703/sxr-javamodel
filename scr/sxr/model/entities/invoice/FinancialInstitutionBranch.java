package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:FinancialInstitutionBranch", btRef = "null", type = FinancialInstitutionBranch.class, order = 2, min = 0, max = 1 )
public class FinancialInstitutionBranch extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-86", type = String.class, order = 0, min = 1, max = 1 )
	public String paymentServiceProviderIdentifier;

	/* =========== Complex Properties =========== */

}
