/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:Party", btRef = "null", type = Party1.class, order = -1, min = 1, max = 1 )
public class Party1 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = String.class, parent = "buyerElectronicAddress")
	public String buyerElectronicAddress_schemeID;
	@XmlElement(term = "cbc:EndpointID", btRef = "BT-49", type = String.class, order = 0, min = 1, max = 1 )
	public String buyerElectronicAddress;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification1.class, order = 1, min = 0, max = 1 )
	public PartyIdentification1 partyIdentification1;
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName1.class, order = 2, min = 0, max = 1 )
	public PartyName1 partyName1;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-8", type = BuyerPostalAddress.class, order = 3, min = 1, max = 1 )
	public BuyerPostalAddress buyerPostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatIdentifier.class, order = 4, min = 0, max = 1 )
	public PartyVatIdentifier partyVatIdentifier;
	@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity1.class, order = 5, min = 1, max = 1 )
	public PartyLegalEntity1 partyLegalEntity1;
	@XmlElement(term = "cac:Contact", btRef = "BG-9", type = BuyerContact.class, order = 6, min = 0, max = 1 )
	public BuyerContact buyerContact;

}
