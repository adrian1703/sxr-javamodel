package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Contact", btRef = "BG-6", order = 6, min = 0, max = 1 )
public class SellerContact {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Name", btRef = "BT-41", order = 0, min = 0, max = 1 )
	public String sellerContactPoint;
	@XmlElement(term = "cbc:Telephone", btRef = "BT-42", order = 1, min = 0, max = 1 )
	public String sellerContactTelephoneNumber;
	@XmlElement(term = "cbc:ElectronicMail", btRef = "BT-43", order = 2, min = 0, max = 1 )
	public String sellerContactEmailAddress;

	/* =========== Complex Properties =========== */

}
