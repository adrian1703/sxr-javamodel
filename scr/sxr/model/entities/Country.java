package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Country", btRef = "null", order = 6, min = 1, max = 1 )
public class Country {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-80", order = 0, min = 1, max = 1 )
	public Iso3166 deliverToCountryCode;

	/* =========== Complex Properties =========== */

}
