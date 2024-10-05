/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.*;
import sxr.core.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxRepresentativeParty", btRef = "BG-11", type = SellerTaxRepresentativeParty.class, order = -1, min = 0, max = 1 )
public class SellerTaxRepresentativeParty extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName3.class, order = 0, min = 1, max = 1 )
	public PartyName3 partyName3;
	@XmlElement(term = "cac:PostalAddress", btRef = "BG-12", type = SellerTaxRepresentativePostalAddress.class, order = 1, min = 1, max = 1 )
	public SellerTaxRepresentativePostalAddress sellerTaxRepresentativePostalAddress;
	@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatIdentifier1.class, order = 2, min = 1, max = 1 )
	public PartyVatIdentifier1 partyVatIdentifier1;

}
