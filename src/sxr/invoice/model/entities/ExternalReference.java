/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:ExternalReference", btRef = "null", type = ExternalReference.class, order = -1, min = 0, max = 1 )
public class ExternalReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:URI", btRef = "BT-124", type = String.class, order = 0, min = 1, max = 1 )
	public String externalDocumentLocation;

	/* =========== Complex Properties =========== */

}
