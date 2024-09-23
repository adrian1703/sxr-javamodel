package sxr.model.entities.invoice;
import sxr.model.entities.SxrObject;
import sxr.model.interfaces.*;
import sxr.model.codes.*;
import java.util.List;

@XmlElement(term = "cac:Item", btRef = "BG-31", type = ItemInformation.class, order = 9, min = 1, max = 1 )
public class ItemInformation extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:Description", btRef = "BT-154", type = String.class, order = 0, min = 0, max = 1 )
	public String itemDescription;
	@XmlElement(term = "cbc:Name", btRef = "BT-153", type = String.class, order = 1, min = 1, max = 1 )
	public String itemName;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:BuyersItemIdentification", btRef = "null", type = BuyersItemIdentification.class, order = 2, min = 0, max = 1 )
	public BuyersItemIdentification buyersItemIdentification;
	@XmlElement(term = "cac:SellersItemIdentification", btRef = "null", type = SellersItemIdentification.class, order = 3, min = 0, max = 1 )
	public SellersItemIdentification sellersItemIdentification;
	@XmlElement(term = "cac:StandardItemIdentification", btRef = "null", type = StandardItemIdentification.class, order = 4, min = 0, max = 1 )
	public StandardItemIdentification standardItemIdentification;
	@XmlElement(term = "cac:OriginCountry", btRef = "null", type = OriginCountry.class, order = 5, min = 0, max = 1 )
	public OriginCountry originCountry;
	@XmlElement(term = "cac:CommodityClassification", btRef = "null", type = CommodityClassification.class, order = 6, min = 0, max = -1 )
	public List<CommodityClassification> commodityClassification;
	@XmlElement(term = "cac:ClassifiedTaxCategory", btRef = "BG-30", type = LineVatInformation.class, order = 7, min = 1, max = 1 )
	public LineVatInformation lineVatInformation;
	@XmlElement(term = "cac:AdditionalItemProperty", btRef = "BG-32", type = ItemAttributes.class, order = 8, min = 0, max = -1 )
	public List<ItemAttributes> itemAttributes;

}
