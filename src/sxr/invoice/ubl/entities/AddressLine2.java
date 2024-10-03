/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine2.class, order = -1, min = 0, max = 1 )
public class AddressLine2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Line", btRef = "BT-164", type = String.class, order = 0, min = 1, max = 1 )
	public String taxRepresentativeAddressLine3;

	/* =========== Complex Properties =========== */

}
