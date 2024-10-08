/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;

@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine2.class, order = -1, min = 0, max = 1 )
public class AddressLine2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Line", btRef = "BT-164", type = String.class, order = 0, min = 1, max = 1 )
	public String taxRepresentativeAddressLine3;

	/* =========== Complex Properties =========== */

}
