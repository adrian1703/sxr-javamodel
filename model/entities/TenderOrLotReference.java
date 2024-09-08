package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:OriginatorDocumentReference", btRef = "null", order = 17, min = 0, max = 1 )
public class TenderOrLotReference {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-17", order = 0, min = 1, max = 1 )
	public String tenderOrLotReference;

	/* =========== Complex Properties =========== */

}
