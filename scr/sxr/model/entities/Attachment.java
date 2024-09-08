package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Attachment", btRef = "null", order = 3, min = 0, max = 1 )
public class Attachment {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:EmbeddedDocumentBinaryObject", btRef = "BT-125", order = 0, min = 0, max = 1 )
	@XmlAttribute( term = "mimeCode" )
	@XmlAttribute( term = "filename" )
	public byte[] attachedDocument;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:ExternalReference", btRef = "null", order = 1, min = 0, max = 1 )
	public ExternalReference externalReference;

}
