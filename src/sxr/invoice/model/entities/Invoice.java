/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.model.entities;
import sxr.core.model.entities.SxrObject;
import sxr.core.model.interfaces.XmlElement;
import sxr.invoice.ubl.codes.*;
import java.util.List;

@XmlElement(term = "null", btRef = "null", type = Invoice.class, order = -1, min = 1, max = 1 )
public class Invoice extends SxrObject {
	/* =========== Basic Properties   =========== */
	@XmlElement(term = "cbc:CustomizationID", btRef = "BT-24", type = String.class, order = 0, min = 1, max = 1 )
	public String specificationIdentifier;
	@XmlElement(term = "cbc:ProfileID", btRef = "BT-23", type = String.class, order = 1, min = 1, max = 1 )
	public String businessProcessType;
	@XmlElement(term = "cbc:ID", btRef = "BT-1", type = String.class, order = 2, min = 1, max = 1 )
	public String invoiceNumber;
	@XmlElement(term = "cbc:IssueDate", btRef = "BT-2", type = java.util.Date.class, order = 3, min = 1, max = 1 )
	public java.util.Date invoiceIssueDate;
	@XmlElement(term = "cbc:DueDate", btRef = "BT-9", type = java.util.Date.class, order = 4, min = 0, max = 1 )
	public java.util.Date paymentDueDate;
	@XmlElement(term = "cbc:InvoiceTypeCode", btRef = "BT-3", type = Uncl1001Inv.class, order = 5, min = 1, max = 1 )
	public Uncl1001Inv invoiceTypeCode;
	@XmlElement(term = "cbc:Note", btRef = "BT-22", type = String.class, order = 6, min = 0, max = 1 )
	public String invoiceNote;
	@XmlElement(term = "cbc:TaxPointDate", btRef = "BT-7", type = java.util.Date.class, order = 7, min = 0, max = 1 )
	public java.util.Date valueAddedTaxPointDate;
	@XmlElement(term = "cbc:DocumentCurrencyCode", btRef = "BT-5", type = Iso4217.class, order = 8, min = 1, max = 1 )
	public Iso4217 invoiceCurrencyCode;
	@XmlElement(term = "cbc:TaxCurrencyCode", btRef = "BT-6", type = Iso4217.class, order = 9, min = 0, max = 1 )
	public Iso4217 vatAccountingCurrencyCode;
	@XmlElement(term = "cbc:AccountingCost", btRef = "BT-19", type = String.class, order = 10, min = 0, max = 1 )
	public String buyerAccountingReference;
	@XmlElement(term = "cbc:BuyerReference", btRef = "BT-10", type = String.class, order = 11, min = 0, max = 1 )
	public String buyerReference;

	/* =========== Complex Properties =========== */
	@XmlElement(term = "cac:InvoicePeriod", btRef = "BG-14", type = DeliveryOrInvoicePeriod.class, order = 12, min = 0, max = 1 )
	public DeliveryOrInvoicePeriod deliveryOrInvoicePeriod;
	@XmlElement(term = "cac:OrderReference", btRef = "null", type = OrderAndSalesOrderReference.class, order = 13, min = 0, max = 1 )
	public OrderAndSalesOrderReference orderAndSalesOrderReference;
	@XmlElement(term = "cac:BillingReference", btRef = "BG-3", type = PrecedingInvoiceReference.class, order = 14, min = 0, max = -1 )
	public List<PrecedingInvoiceReference> precedingInvoiceReference;
	@XmlElement(term = "cac:DespatchDocumentReference", btRef = "null", type = DespatchAdviceReference.class, order = 15, min = 0, max = 1 )
	public DespatchAdviceReference despatchAdviceReference;
	@XmlElement(term = "cac:ReceiptDocumentReference", btRef = "null", type = ReceiptAdviceReference.class, order = 16, min = 0, max = 1 )
	public ReceiptAdviceReference receiptAdviceReference;
	@XmlElement(term = "cac:OriginatorDocumentReference", btRef = "null", type = TenderOrLotReference.class, order = 17, min = 0, max = 1 )
	public TenderOrLotReference tenderOrLotReference;
	@XmlElement(term = "cac:ContractDocumentReference", btRef = "null", type = ContractReference.class, order = 18, min = 0, max = 1 )
	public ContractReference contractReference;
	@XmlElement(term = "cac:AdditionalDocumentReference", btRef = "BG-24", type = AdditionalSupportingDocuments.class, order = 19, min = 0, max = -1 )
	public List<AdditionalSupportingDocuments> additionalSupportingDocuments;
	@XmlElement(term = "cac:ProjectReference", btRef = "null", type = ProjectReference.class, order = 20, min = 0, max = 1 )
	public ProjectReference projectReference;
	@XmlElement(term = "cac:AccountingSupplierParty", btRef = "BG-4", type = Seller.class, order = 21, min = 1, max = 1 )
	public Seller seller;
	@XmlElement(term = "cac:AccountingCustomerParty", btRef = "BG-7", type = Buyer.class, order = 22, min = 1, max = 1 )
	public Buyer buyer;
	@XmlElement(term = "cac:PayeeParty", btRef = "BG-10", type = Payee.class, order = 23, min = 0, max = 1 )
	public Payee payee;
	@XmlElement(term = "cac:TaxRepresentativeParty", btRef = "BG-11", type = SellerTaxRepresentativeParty.class, order = 24, min = 0, max = 1 )
	public SellerTaxRepresentativeParty sellerTaxRepresentativeParty;
	@XmlElement(term = "cac:Delivery", btRef = "BG-13", type = DeliveryInformation.class, order = 25, min = 0, max = 1 )
	public DeliveryInformation deliveryInformation;
	@XmlElement(term = "cac:PaymentMeans", btRef = "BG-16", type = PaymentInstructions.class, order = 26, min = 0, max = -1 )
	public List<PaymentInstructions> paymentInstructions;
	@XmlElement(term = "cac:PaymentTerms", btRef = "null", type = PaymentTerms.class, order = 27, min = 0, max = 1 )
	public PaymentTerms paymentTerms;
	@XmlElement(term = "cac:AllowanceCharge", btRef = "BG-20, BG-21", type = DocumentLevelAllowancesAndCharges.class, order = 28, min = 0, max = -1 )
	public List<DocumentLevelAllowancesAndCharges> documentLevelAllowancesAndCharges;
	@XmlElement(term = "cac:TaxTotal", btRef = "null", type = TaxTotal.class, order = 29, min = 1, max = 2 )
	public TaxTotal taxTotal;
	@XmlElement(term = "cac:LegalMonetaryTotal", btRef = "BG-22", type = DocumentTotals.class, order = 30, min = 1, max = 1 )
	public DocumentTotals documentTotals;
	@XmlElement(term = "cac:InvoiceLine", btRef = "BG-25", type = InvoiceLine.class, order = 31, min = 1, max = -1 )
	public List<InvoiceLine> invoiceLine;

}
