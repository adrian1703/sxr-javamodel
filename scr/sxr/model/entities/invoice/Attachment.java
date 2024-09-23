package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Attachment", btRef = "null", type = Attachment.class, order = 3, min = 0, max = 1 )
public class Attachment extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:EmbeddedDocumentBinaryObject", btRef = "BT-125", type = byte[].class, order = 0, min = 0, max = 1 )
	@XmlAttribute( term = "mimeCode" )
	@XmlAttribute( term = "filename" )
	public byte[] attachedDocument;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:ExternalReference", btRef = "null", type = ExternalReference.class, order = 1, min = 0, max = 1 )
	public ExternalReference externalReference;

}
