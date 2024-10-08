/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:PaymentTerms", btRef = "null", type = PaymentTerms.class, order = -1, min = 0, max = 1 )
public class PaymentTerms extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Note", btRef = "BT-20", type = String.class, order = 0, min = 1, max = 1 )
	public String paymentTerms;

	/* =========== Complex Properties =========== */

}
