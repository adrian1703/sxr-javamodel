/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:ReceiptDocumentReference", btRef = "null", type = ReceiptAdviceReference.class, order = -1, min = 0, max = 1 )
public class ReceiptAdviceReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-15", type = String.class, order = 0, min = 1, max = 1 )
	public String receivingAdviceReference;

	/* =========== Complex Properties =========== */

}
