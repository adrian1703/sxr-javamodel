package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ReceiptDocumentReference", btRef = "null", type = ReceiptAdviceReference.class, order = 16, min = 0, max = 1 )
public class ReceiptAdviceReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-15", type = String.class, order = 0, min = 1, max = 1 )
	public String receivingAdviceReference;

	/* =========== Complex Properties =========== */

}
