package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:ContractDocumentReference", btRef = "null", order = 18, min = 0, max = 1 )
public class ContractReference {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-12", order = 0, min = 1, max = 1 )
	public String contractReference;

	/* =========== Complex Properties =========== */

}
