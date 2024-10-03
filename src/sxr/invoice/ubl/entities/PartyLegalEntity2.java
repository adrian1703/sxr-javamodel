/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity2.class, order = -1, min = 0, max = 1 )
public class PartyLegalEntity2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "payeeLegalRegistrationIdentifier")
	public String payeeLegalRegistrationIdentifier_schemeID;
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-61", type = String.class, order = 0, min = 1, max = 1 )
	public String payeeLegalRegistrationIdentifier;

	/* =========== Complex Properties =========== */

}
