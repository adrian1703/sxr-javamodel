package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:PartyName", btRef = "null", order = 0, min = 1, max = 1 )
public class PartyName {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-70", order = 0, min = 1, max = 1 )
	public String deliverToPartyName;

	/* =========== Complex Properties =========== */

}
