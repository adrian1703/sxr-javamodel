package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Contact", btRef = "BG-9", order = 6, min = 0, max = 1 )
public class BuyerContact extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-56", order = 0, min = 0, max = 1 )
	public String buyerContactPoint;
	@XmlElement(term = "cbc:Telephone", btRef = "BT-57", order = 1, min = 0, max = 1 )
	public String buyerContactTelephoneNumber;
	@XmlElement(term = "cbc:ElectronicMail", btRef = "BT-58", order = 2, min = 0, max = 1 )
	public String buyerContactEmailAddress;

	/* =========== Complex Properties =========== */

}
