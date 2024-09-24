package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:OrderLineReference", btRef = "null", type = OrderLineReference.class, order = -1, min = 0, max = 1 )
public class OrderLineReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:LineID", btRef = "BT-132", type = String.class, order = 0, min = 1, max = 1 )
	public String referencedPurchaseOrderLineReference;

	/* =========== Complex Properties =========== */

}
