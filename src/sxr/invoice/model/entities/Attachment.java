/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:Attachment", btRef = "null", type = Attachment.class, order = -1, min = 0, max = 1 )
public class Attachment extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "mimeCode", btRef = "null", type = String.class, parent = "attachedDocument")
	public String attachedDocument_mimeCode;
	@XmlAttribute( term = "filename", btRef = "null", type = String.class, parent = "attachedDocument")
	public String attachedDocument_filename;
	@XmlElement(term = "cbc:EmbeddedDocumentBinaryObject", btRef = "BT-125", type = byte[].class, order = 0, min = 0, max = 1 )
	public byte[] attachedDocument;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:ExternalReference", btRef = "null", type = ExternalReference.class, order = 1, min = 0, max = 1 )
	public ExternalReference externalReference;

}
