/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:ProjectReference", btRef = "null", type = ProjectReference.class, order = -1, min = 0, max = 1 )
public class ProjectReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-11", type = String.class, order = 0, min = 1, max = 1 )
	public String projectReference;

	/* =========== Complex Properties =========== */

}
