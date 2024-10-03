package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ContractDocumentReference", btRef = "null", type = ContractReference.class, order = -1, min = 0, max = 1 )
public class ContractReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-12", type = String.class, order = 0, min = 1, max = 1 )
	public String contractReference;

	/* =========== Complex Properties =========== */

}
