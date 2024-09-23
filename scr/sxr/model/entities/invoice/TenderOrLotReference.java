package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:OriginatorDocumentReference", btRef = "null", type = TenderOrLotReference.class, order = 17, min = 0, max = 1 )
public class TenderOrLotReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-17", type = String.class, order = 0, min = 1, max = 1 )
	public String tenderOrLotReference;

	/* =========== Complex Properties =========== */

}
