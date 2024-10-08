/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity1.class, order = -1, min = 1, max = 1 )
public class PartyLegalEntity1 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:RegistrationName", btRef = "BT-44", type = String.class, order = 0, min = 1, max = 1 )
	public String buyerName;
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "buyerLegalRegistrationIdentifier")
	public String buyerLegalRegistrationIdentifier_schemeID;
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-47", type = String.class, order = 1, min = 0, max = 1 )
	public String buyerLegalRegistrationIdentifier;

	/* =========== Complex Properties =========== */

}
