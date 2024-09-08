package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AccountingSupplierParty", btRef = "BG-4", order = 21, min = 1, max = 1 )
public class Seller {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Party", btRef = "null", order = 0, min = 1, max = 1 )
	public Party party;

}
