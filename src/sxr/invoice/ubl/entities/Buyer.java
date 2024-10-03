/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.entities;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "cac:AccountingCustomerParty", btRef = "BG-7", type = Buyer.class, order = -1, min = 1, max = 1 )
public class Buyer extends SxrObject {
	/* =========== Basic Properties   =========== */

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:Party", btRef = "null", type = Party1.class, order = 0, min = 1, max = 1 )
	public Party1 party1;

}
