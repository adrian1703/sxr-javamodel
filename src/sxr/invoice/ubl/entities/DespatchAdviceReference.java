/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:DespatchDocumentReference", btRef = "null", type = DespatchAdviceReference.class, order = -1, min = 0, max = 1 )
public class DespatchAdviceReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-16", type = String.class, order = 0, min = 1, max = 1 )
	public String despatchAdviceReference;

	/* =========== Complex Properties =========== */

}
