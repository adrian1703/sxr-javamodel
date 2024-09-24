package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:DocumentReference", btRef = "null", type = LineObjectIdentifier.class, order = -1, min = 0, max = 1 )
public class LineObjectIdentifier extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-128", type = String.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String invoiceLineObjectIdentifier;
	@XmlElement(term = "cbc:DocumentTypeCode", btRef = "BT-128", type = String.class, order = 1, min = 1, max = 1 )
	public String documentTypeCode1;

	/* =========== Complex Properties =========== */

}
