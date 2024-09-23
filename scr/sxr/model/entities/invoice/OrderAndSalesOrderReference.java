package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:OrderReference", btRef = "null", type = OrderAndSalesOrderReference.class, order = 13, min = 0, max = 1 )
public class OrderAndSalesOrderReference extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:ID", btRef = "BT-13", type = String.class, order = 0, min = 1, max = 1 )
	public String purchaseOrderReference;
	@XmlElement(term = "cbc:SalesOrderID", btRef = "BT-14", type = String.class, order = 1, min = 0, max = 1 )
	public String salesOrderReference;

	/* =========== Complex Properties =========== */

}
