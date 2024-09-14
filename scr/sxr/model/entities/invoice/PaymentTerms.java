package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PaymentTerms", btRef = "null", order = 27, min = 0, max = 1 )
public class PaymentTerms extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Note", btRef = "BT-20", order = 0, min = 1, max = 1 )
	public String paymentTerms;

	/* =========== Complex Properties =========== */

}
