package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ReceiptDocumentReference", btRef = "null", order = 16, min = 0, max = 1 )
public class ReceiptAdviceReference {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-15", order = 0, min = 1, max = 1 )
	public String receivingAdviceReference;

	/* =========== Complex Properties =========== */

}
