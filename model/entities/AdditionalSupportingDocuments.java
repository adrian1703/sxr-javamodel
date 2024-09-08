package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AdditionalDocumentReference", btRef = "BG-24", order = 19, min = 0, max = -1 )
public class AdditionalSupportingDocuments {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-18, BT-122", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String invoicedObjectIdentifierSupportingDocumentReference;
	@XmlElement(term = "cbc:DocumentTypeCode", btRef = "BT-18", order = 1, min = 0, max = 1 )
	public String documentTypeCode;
	@XmlElement(term = "cbc:DocumentDescription", btRef = "BT-123", order = 2, min = 0, max = 1 )
	public String supportingDocumentDescription;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Attachment", btRef = "null", order = 3, min = 0, max = 1 )
	public Attachment attachment;

}
