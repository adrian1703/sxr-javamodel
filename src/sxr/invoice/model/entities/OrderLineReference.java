/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:OrderLineReference", btRef = "null", type = OrderLineReference.class, order = -1, min = 0, max = 1 )
public class OrderLineReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:LineID", btRef = "BT-132", type = String.class, order = 0, min = 1, max = 1 )
	public String referencedPurchaseOrderLineReference;

	/* =========== Complex Properties =========== */

}
