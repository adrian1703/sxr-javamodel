package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:CommodityClassification", btRef = "null", type = CommodityClassification.class, order = -1, min = 0, max = -1 )
public class CommodityClassification extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlAttribute( term = "listID", btRef = "null", type = Object.class, parent = "itemClassificationIdentifier")
	public Object itemClassificationIdentifier_listID;
	@XmlAttribute( term = "listVersionID", btRef = "null", type = Object.class, parent = "itemClassificationIdentifier")
	public Object itemClassificationIdentifier_listVersionID;
	@XmlElement(term = "cbc:ItemClassificationCode", btRef = "BT-158", type = String.class, order = 0, min = 1, max = 1 )
	public String itemClassificationIdentifier;

	/* =========== Complex Properties =========== */

}
