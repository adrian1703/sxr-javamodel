package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Party", btRef = "null", type = Party.class, order = 0, min = 1, max = 1 )
public class Party extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:EndpointID", btRef = "BT-49", type = String.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String buyerElectronicAddress;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification.class, order = 1, min = 0, max = 1 )
	public PartyIdentification partyIdentification;
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName.class, order = 2, min = 0, max = 1 )
	public PartyName partyName;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-8", type = BuyerPostalAddress.class, order = 3, min = 1, max = 1 )
	public BuyerPostalAddress buyerPostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatIdentifier.class, order = 4, min = 0, max = 1 )
	public PartyVatIdentifier partyVatIdentifier;
	@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity.class, order = 5, min = 1, max = 1 )
	public PartyLegalEntity partyLegalEntity;
	@XmlElement(term = "cac:Contact", btRef = "BG-9", type = BuyerContact.class, order = 6, min = 0, max = 1 )
	public BuyerContact buyerContact;

}
