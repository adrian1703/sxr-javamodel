package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:AdditionalItemProperty", btRef = "BG-32", type = ItemAttributes.class, order = 8, min = 0, max = -1 )
public class ItemAttributes extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-160", type = String.class, order = 0, min = 1, max = 1 )
	public String itemAttributeName;
	@XmlElement(term = "cbc:Value", btRef = "BT-161", type = String.class, order = 1, min = 1, max = 1 )
	public String itemAttributeValue;

	/* =========== Complex Properties =========== */

}
