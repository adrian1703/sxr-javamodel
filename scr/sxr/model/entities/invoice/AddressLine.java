package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AddressLine", btRef = "null", type = AddressLine.class, order = 5, min = 0, max = 1 )
public class AddressLine extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Line", btRef = "BT-165", type = String.class, order = 0, min = 1, max = 1 )
	public String deliverToAddressLine3;

	/* =========== Complex Properties =========== */

}
