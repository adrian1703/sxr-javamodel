/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:Contact", btRef = "BG-9", type = BuyerContact.class, order = -1, min = 0, max = 1 )
public class BuyerContact extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-56", type = String.class, order = 0, min = 0, max = 1 )
	public String buyerContactPoint;
	@XmlElement(term = "cbc:Telephone", btRef = "BT-57", type = String.class, order = 1, min = 0, max = 1 )
	public String buyerContactTelephoneNumber;
	@XmlElement(term = "cbc:ElectronicMail", btRef = "BT-58", type = String.class, order = 2, min = 0, max = 1 )
	public String buyerContactEmailAddress;

	/* =========== Complex Properties =========== */

}
