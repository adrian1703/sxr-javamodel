package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AdditionalItemProperty", btRef = "BG-32", order = 8, min = 0, max = -1 )
public class ItemAttributes extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-160", order = 0, min = 1, max = 1 )
	public String itemAttributeName;
	@XmlElement(term = "cbc:Value", btRef = "BT-161", order = 1, min = 1, max = 1 )
	public String itemAttributeValue;

	/* =========== Complex Properties =========== */

}
