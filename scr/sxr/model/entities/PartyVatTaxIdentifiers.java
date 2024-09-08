package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", order = 4, min = 0, max = 2 )
public class PartyVatTaxIdentifiers {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-31, BT-32", order = 0, min = 1, max = 1 )
	public String sellerVatIdentifierSellerTaxRegistrationIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", order = 1, min = 1, max = 1 )
	public TaxScheme taxScheme;

}
