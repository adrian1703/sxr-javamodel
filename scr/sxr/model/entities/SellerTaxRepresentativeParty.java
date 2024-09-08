package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxRepresentativeParty", btRef = "BG-11", order = 24, min = 0, max = 1 )
public class SellerTaxRepresentativeParty {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyName", btRef = "null", order = 0, min = 1, max = 1 )
	public PartyName partyName;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-12", order = 1, min = 1, max = 1 )
	public SellerTaxRepresentativePostalAddress sellerTaxRepresentativePostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", order = 2, min = 1, max = 1 )
	public PartyVatIdentifier partyVatIdentifier;

}
