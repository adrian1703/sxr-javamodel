package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:StandardItemIdentification", btRef = "null", order = 4, min = 0, max = 1 )
public class StandardItemIdentification {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-157", order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "schemeID" )
	public String itemStandardIdentifier;

	/* =========== Complex Properties =========== */

}
