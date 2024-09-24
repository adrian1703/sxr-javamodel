package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:OriginCountry", btRef = "null", type = OriginCountry.class, order = -1, min = 0, max = 1 )
public class OriginCountry extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-159", type = Iso3166.class, order = 0, min = 1, max = 1 )
	public Iso3166 itemCountryOfOrigin;

	/* =========== Complex Properties =========== */

}
