package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxScheme", btRef = "null", order = 2, min = 1, max = 1 )
public class TaxScheme {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "null", order = 0, min = 1, max = 1 )
	public String ID;

	/* =========== Complex Properties =========== */

}
