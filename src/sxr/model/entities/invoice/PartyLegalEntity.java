package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity.class, order = -1, min = 1, max = 1 )
public class PartyLegalEntity extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:RegistrationName", btRef = "BT-27", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerName;
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "sellerLegalRegistrationIdentifier")
	public String sellerLegalRegistrationIdentifier_schemeID;
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-30", type = String.class, order = 1, min = 0, max = 1 )
	public String sellerLegalRegistrationIdentifier;
	@XmlElement(term = "cbc:CompanyLegalForm", btRef = "BT-33", type = String.class, order = 2, min = 0, max = 1 )
	public String sellerAdditionalLegalInformation;

	/* =========== Complex Properties =========== */

}
