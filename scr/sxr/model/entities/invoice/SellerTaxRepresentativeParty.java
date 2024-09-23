package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxRepresentativeParty", btRef = "BG-11", type = SellerTaxRepresentativeParty.class, order = 24, min = 0, max = 1 )
public class SellerTaxRepresentativeParty extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName.class, order = 0, min = 1, max = 1 )
	public PartyName partyName;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-12", type = SellerTaxRepresentativePostalAddress.class, order = 1, min = 1, max = 1 )
	public SellerTaxRepresentativePostalAddress sellerTaxRepresentativePostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatIdentifier.class, order = 2, min = 1, max = 1 )
	public PartyVatIdentifier partyVatIdentifier;

}
