package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AdditionalDocumentReference", btRef = "BG-24", type = AdditionalSupportingDocuments.class, order = -1, min = 0, max = -1 )
public class AdditionalSupportingDocuments extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "invoicedObjectIdentifierSupportingDocumentReference")
	public String invoicedObjectIdentifierSupportingDocumentReference_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-18, BT-122", type = String.class, order = 0, min = 1, max = 1 )
	public String invoicedObjectIdentifierSupportingDocumentReference;
	@XmlElement(term = "cbc:DocumentTypeCode", btRef = "BT-18", type = String.class, order = 1, min = 0, max = 1 )
	public String documentTypeCode;
	@XmlElement(term = "cbc:DocumentDescription", btRef = "BT-123", type = String.class, order = 2, min = 0, max = 1 )
	public String supportingDocumentDescription;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Attachment", btRef = "null", type = Attachment.class, order = 3, min = 0, max = 1 )
	public Attachment attachment;

}
