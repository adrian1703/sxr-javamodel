/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:FinancialInstitutionBranch", btRef = "null", type = FinancialInstitutionBranch.class, order = -1, min = 0, max = 1 )
public class FinancialInstitutionBranch extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-86", type = String.class, order = 0, min = 1, max = 1 )
	public String paymentServiceProviderIdentifier;

	/* =========== Complex Properties =========== */

}
