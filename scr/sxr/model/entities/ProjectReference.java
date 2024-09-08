package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ProjectReference", btRef = "null", order = 20, min = 0, max = 1 )
public class ProjectReference {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-11", order = 0, min = 1, max = 1 )
	public String projectReference;

	/* =========== Complex Properties =========== */

}
