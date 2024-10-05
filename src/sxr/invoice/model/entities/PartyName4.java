/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:PartyName", btRef = "null", type = PartyName4.class, order = -1, min = 1, max = 1 )
public class PartyName4 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-70", type = String.class, order = 0, min = 1, max = 1 )
	public String deliverToPartyName;

	/* =========== Complex Properties =========== */

}
