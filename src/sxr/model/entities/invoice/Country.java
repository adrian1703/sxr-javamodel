package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Country", btRef = "null", type = Country.class, order = -1, min = 1, max = 1 )
public class Country extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-40", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerCountryCode;

	/* =========== Complex Properties =========== */

}
