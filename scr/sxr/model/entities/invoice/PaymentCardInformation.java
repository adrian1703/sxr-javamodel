package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:CardAccount", btRef = "BG-18", order = 2, min = 0, max = 1 )
public class PaymentCardInformation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:PrimaryAccountNumberID", btRef = "BT-87", order = 0, min = 1, max = 1 )
	public String paymentCardPrimaryAccountNumber;
	@XmlElement(term = "cbc:NetworkID", btRef = "null", order = 1, min = 1, max = 1 )
	public String NetworkID;
	@XmlElement(term = "cbc:HolderName", btRef = "BT-88", order = 2, min = 0, max = 1 )
	public String paymentCardHolderName;

	/* =========== Complex Properties =========== */

}
