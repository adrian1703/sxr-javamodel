package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatTaxIdentifiers.class, order = -1, min = 0, max = 2 )
public class PartyVatTaxIdentifiers extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-31, BT-32", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerVatIdentifierSellerTaxRegistrationIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", type = TaxScheme.class, order = 1, min = 1, max = 1 )
	public TaxScheme taxScheme;

}
