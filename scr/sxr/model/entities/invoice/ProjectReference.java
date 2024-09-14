package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ProjectReference", btRef = "null", order = 20, min = 0, max = 1 )
public class ProjectReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-11", order = 0, min = 1, max = 1 )
	public String projectReference;

	/* =========== Complex Properties =========== */

}
