/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:PayerFinancialAccount", btRef = "null", type = PayerFinancialAccount.class, order = -1, min = 0, max = 1 )
public class PayerFinancialAccount extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-91", type = String.class, order = 0, min = 1, max = 1 )
	public String debitedAccountIdentifier;

	/* =========== Complex Properties =========== */

}
