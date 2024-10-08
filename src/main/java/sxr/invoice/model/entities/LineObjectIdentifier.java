/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:DocumentReference", btRef = "null", type = LineObjectIdentifier.class, order = -1, min = 0, max = 1 )
public class LineObjectIdentifier extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "invoiceLineObjectIdentifier")
	public String invoiceLineObjectIdentifier_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-128", type = String.class, order = 0, min = 1, max = 1 )
	public String invoiceLineObjectIdentifier;
	@XmlElement(term = "cbc:DocumentTypeCode", btRef = "BT-128", type = String.class, order = 1, min = 1, max = 1 )
	public String documentTypeCode1;

	/* =========== Complex Properties =========== */

}
