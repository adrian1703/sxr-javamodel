/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlAttribute;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;

@XmlElement(term = "cac:CommodityClassification", btRef = "null", type = CommodityClassification.class, order = -1, min = 0, max = -1 )
public class CommodityClassification extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "listID", btRef = "null", type = String.class, parent = "itemClassificationIdentifier")
	public String itemClassificationIdentifier_listID;
	@XmlAttribute( term = "listVersionID", btRef = "null", type = String.class, parent = "itemClassificationIdentifier")
	public String itemClassificationIdentifier_listVersionID;
	@XmlElement(term = "cbc:ItemClassificationCode", btRef = "BT-158", type = String.class, order = 0, min = 1, max = 1 )
	public String itemClassificationIdentifier;

	/* =========== Complex Properties =========== */

}
