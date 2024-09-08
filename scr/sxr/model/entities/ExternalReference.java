package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ExternalReference", btRef = "null", order = 1, min = 0, max = 1 )
public class ExternalReference {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:URI", btRef = "BT-124", order = 0, min = 1, max = 1 )
	public String externalDocumentLocation;

	/* =========== Complex Properties =========== */

}
