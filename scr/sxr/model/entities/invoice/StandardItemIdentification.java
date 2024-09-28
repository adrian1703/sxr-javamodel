package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:StandardItemIdentification", btRef = "null", type = StandardItemIdentification.class, order = -1, min = 0, max = 1 )
public class StandardItemIdentification extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "itemStandardIdentifier")
	public String itemStandardIdentifier_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-157", type = String.class, order = 0, min = 1, max = 1 )
	public String itemStandardIdentifier;

	/* =========== Complex Properties =========== */

}
