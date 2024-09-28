package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Party", btRef = "null", type = Party.class, order = -1, min = 1, max = 1 )
public class Party extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "schemeID", btRef = "null", type = Object.class, parent = "sellerElectronicAddress")
	public Object sellerElectronicAddress_schemeID;
	@XmlElement(term = "cbc:EndpointID", btRef = "BT-34", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerElectronicAddress;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyIdentification", btRef = "null", type = PartyIdentification.class, order = 1, min = 0, max = -1 )
	public List<PartyIdentification> partyIdentification;
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName.class, order = 2, min = 0, max = 1 )
	public PartyName partyName;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-5", type = SellerPostalAddress.class, order = 3, min = 1, max = 1 )
	public SellerPostalAddress sellerPostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatTaxIdentifiers.class, order = 4, min = 0, max = 2 )
	public PartyVatTaxIdentifiers partyVatTaxIdentifiers;
	@XmlElement(term = "cac:PartyLegalEntity", btRef = "null", type = PartyLegalEntity.class, order = 5, min = 1, max = 1 )
	public PartyLegalEntity partyLegalEntity;
	@XmlElement(term = "cac:Contact", btRef = "BG-6", type = SellerContact.class, order = 6, min = 0, max = 1 )
	public SellerContact sellerContact;

}
