package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine.class, order = -1, min = 0, max = 1 )
public class AddressLine extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Line", btRef = "BT-162", type = String.class, order = 0, min = 1, max = 1 )
	public String sellerAddressLine3;

	/* =========== Complex Properties =========== */

}
