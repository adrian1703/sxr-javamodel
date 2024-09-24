package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:CommodityClassification", btRef = "null", type = CommodityClassification.class, order = -1, min = 0, max = -1 )
public class CommodityClassification extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ItemClassificationCode", btRef = "BT-158", type = String.class, order = 0, min = 1, max = 1 )
	@XmlAttribute( term = "listID" )
	@XmlAttribute( term = "listVersionID" )
	public String itemClassificationIdentifier;

	/* =========== Complex Properties =========== */

}
