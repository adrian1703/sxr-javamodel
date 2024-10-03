/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:Country", btRef = "null", type = Country2.class, order = -1, min = 1, max = 1 )
public class Country2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:IdentificationCode", btRef = "BT-69", type = Iso3166.class, order = 0, min = 1, max = 1 )
	public Iso3166 taxRepresentativeCountryCode;

	/* =========== Complex Properties =========== */

}
