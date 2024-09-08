package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Party", btRef = "null", order = 0, min = 1, max = 1 )
public class Party {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:EndpointID", btRef = "BT-49", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String buyerElectronicAddress;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyIdentification", btRef = "null", order = 1, min = 0, max = 1 )
	public PartyIdentification partyIdentification;
	@XmlElement(term = "cac:PartyName", btRef = "null", order = 2, min = 0, max = 1 )
	public PartyName partyName;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-8", order = 3, min = 1, max = 1 )
	public BuyerPostalAddress buyerPostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", order = 4, min = 0, max = 1 )
	public PartyVatIdentifier partyVatIdentifier;
	@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", order = 5, min = 1, max = 1 )
	public PartyLegalEntity partyLegalEntity;
	@XmlElement(term = "cac:Contact", btRef = "BG-9", order = 6, min = 0, max = 1 )
	public BuyerContact buyerContact;

}
