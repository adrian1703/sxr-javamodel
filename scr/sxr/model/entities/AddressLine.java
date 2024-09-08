package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AddressLine", btRef = "null", order = 5, min = 0, max = 1 )
public class AddressLine {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Line", btRef = "BT-165", order = 0, min = 1, max = 1 )
	public String deliverToAddressLine3;

	/* =========== Complex Properties =========== */

}
