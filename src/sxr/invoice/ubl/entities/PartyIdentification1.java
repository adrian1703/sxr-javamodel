/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification1.class, order = -1, min = 0, max = 1 )
public class PartyIdentification1 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "buyerIdentifier")
	public String buyerIdentifier_schemeID;
	@XmlElement(term = "cbc:ID", btRef = "BT-46", type = String.class, order = 0, min = 1, max = 1 )
	public String buyerIdentifier;

	/* =========== Complex Properties =========== */

}
