package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:OriginCountry", btRef = "null", order = 5, min = 0, max = 1 )
public class OriginCountry {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-159", order = 0, min = 1, max = 1 )
	public Iso3166 itemCountryOfOrigin;

	/* =========== Complex Properties =========== */

}
