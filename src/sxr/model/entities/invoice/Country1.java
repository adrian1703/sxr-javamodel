package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Country", btRef = "null", type = Country1.class, order = -1, min = 1, max = 1 )
public class Country1 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-55", type = Iso3166.class, order = 0, min = 1, max = 1 )
	public Iso3166 buyerCountryCode;

	/* =========== Complex Properties =========== */

}
