package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Country", btRef = "null", type = Country.class, order = 6, min = 1, max = 1 )
public class Country extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-80", type = Iso3166.class, order = 0, min = 1, max = 1 )
	public Iso3166 deliverToCountryCode;

	/* =========== Complex Properties =========== */

}
