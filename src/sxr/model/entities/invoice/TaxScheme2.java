package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:TaxScheme", btRef = "null", type = TaxScheme2.class, order = -1, min = 1, max = 1 )
public class TaxScheme2 extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "null", type = String.class, order = 0, min = 1, max = 1 )
	public String ID2;

	/* =========== Complex Properties =========== */

}
