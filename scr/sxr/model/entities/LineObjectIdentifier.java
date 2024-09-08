package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:DocumentReference", btRef = "null", order = 7, min = 0, max = 1 )
public class LineObjectIdentifier {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-128", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String invoiceLineObjectIdentifier;
	@XmlElement(term = "cbc:DocumentTypeCode", btRef = "BT-128", order = 1, min = 1, max = 1 )
	public String documentTypeCode;

	/* =========== Complex Properties =========== */

}
