/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:Contact", btRef = "BG-6", type = SellerContact.class, order = -1, min = 0, max = 1 )
public class SellerContact extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-41", type = String.class, order = 0, min = 0, max = 1 )
	public String sellerContactPoint;
	@XmlElement(term = "cbc:Telephone", btRef = "BT-42", type = String.class, order = 1, min = 0, max = 1 )
	public String sellerContactTelephoneNumber;
	@XmlElement(term = "cbc:ElectronicMail", btRef = "BT-43", type = String.class, order = 2, min = 0, max = 1 )
	public String sellerContactEmailAddress;

	/* =========== Complex Properties =========== */

}
