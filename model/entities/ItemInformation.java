package sxr.model.entities;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Item", btRef = "BG-31", order = 9, min = 1, max = 1 )
public class ItemInformation {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Description", btRef = "BT-154", order = 0, min = 0, max = 1 )
	public String itemDescription;
	@XmlElement(term = "cbc:Name", btRef = "BT-153", order = 1, min = 1, max = 1 )
	public String itemName;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:BuyersItemIdentification", btRef = "null", order = 2, min = 0, max = 1 )
	public BuyersItemIdentification buyersItemIdentification;
	@XmlElement(term = "cac:SellersItemIdentification", btRef = "null", order = 3, min = 0, max = 1 )
	public SellersItemIdentification sellersItemIdentification;
	@XmlElement(term = "cac:StandardItemIdentification", btRef = "null", order = 4, min = 0, max = 1 )
	public StandardItemIdentification standardItemIdentification;
	@XmlElement(term = "cac:OriginCountry", btRef = "null", order = 5, min = 0, max = 1 )
	public OriginCountry originCountry;
	@XmlElement(term = "cac:CommodityClassification", btRef = "null", order = 6, min = 0, max = -1 )
	public List<CommodityClassification> commodityClassification;
	@XmlElement(term = "cac:ClassifiedTaxCategory", btRef = "BG-30", order = 7, min = 1, max = 1 )
	public LineVatInformation lineVatInformation;
	@XmlElement(term = "cac:AdditionalItemProperty", btRef = "BG-32", order = 8, min = 0, max = -1 )
	public List<ItemAttributes> itemAttributes;

}
