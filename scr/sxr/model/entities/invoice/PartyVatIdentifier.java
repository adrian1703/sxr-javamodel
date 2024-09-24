package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyTaxScheme", btRef = "null", type = PartyVatIdentifier.class, order = -1, min = 0, max = 1 )
public class PartyVatIdentifier extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:CompanyID", btRef = "BT-48", type = String.class, order = 0, min = 1, max = 1 )
	public String buyerVatIdentifier;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:TaxScheme", btRef = "null", type = TaxScheme1.class, order = 1, min = 1, max = 1 )
	public TaxScheme1 taxScheme1;

}
