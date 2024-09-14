package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", order = 2, min = 0, max = 1 )
public class PartyLegalEntity extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-61", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String payeeLegalRegistrationIdentifier;

	/* =========== Complex Properties =========== */

}
