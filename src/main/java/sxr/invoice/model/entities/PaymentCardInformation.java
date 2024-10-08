/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:CardAccount", btRef = "BG-18", type = PaymentCardInformation.class, order = -1, min = 0, max = 1 )
public class PaymentCardInformation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:PrimaryAccountNumberID", btRef = "BT-87", type = String.class, order = 0, min = 1, max = 1 )
	public String paymentCardPrimaryAccountNumber;
	@XmlElement(term = "cbc:NetworkID", btRef = "null", type = String.class, order = 1, min = 1, max = 1 )
	public String NetworkID;
	@XmlElement(term = "cbc:HolderName", btRef = "BT-88", type = String.class, order = 2, min = 0, max = 1 )
	public String paymentCardHolderName;

	/* =========== Complex Properties =========== */

}
