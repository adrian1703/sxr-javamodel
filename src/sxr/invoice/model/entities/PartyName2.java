/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.*;
import sxr.core.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName2.class, order = -1, min = 1, max = 1 )
public class PartyName2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-59", type = String.class, order = 0, min = 1, max = 1 )
	public String payeeName;

	/* =========== Complex Properties =========== */

}
