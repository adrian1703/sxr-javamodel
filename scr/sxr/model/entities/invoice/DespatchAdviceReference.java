package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:DespatchDocumentReference", btRef = "null", order = 15, min = 0, max = 1 )
public class DespatchAdviceReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-16", order = 0, min = 1, max = 1 )
	public String despatchAdviceReference;

	/* =========== Complex Properties =========== */

}
