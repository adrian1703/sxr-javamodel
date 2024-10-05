/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.core.model.codes;

public enum Uncl4461 {
	P_1("1", "Instrument not defined"),
	P_2("2", "Automated clearing house credit"),
	P_3("3", "Automated clearing house debit"),
	P_4("4", "ACH demand debit reversal"),
	P_5("5", "ACH demand credit reversal"),
	P_6("6", "ACH demand credit"),
	P_7("7", "ACH demand debit"),
	P_8("8", "Hold"),
	P_9("9", "National or regional clearing"),
	P_10("10", "In cash"),
	P_11("11", "ACH savings credit reversal"),
	P_12("12", "ACH savings debit reversal"),
	P_13("13", "ACH savings credit"),
	P_14("14", "ACH savings debit"),
	P_15("15", "Bookentry credit"),
	P_16("16", "Bookentry debit"),
	P_17("17", "ACH demand cash concentration/disbursement (CCD) credit"),
	P_18("18", "ACH demand cash concentration/disbursement (CCD) debit"),
	P_19("19", "ACH demand corporate trade payment (CTP) credit"),
	P_20("20", "Cheque"),
	P_21("21", "Banker's draft"),
	P_22("22", "Certified banker's draft"),
	P_23("23", "Bank cheque (issued by a banking or similar establishment)"),
	P_24("24", "Bill of exchange awaiting acceptance"),
	P_25("25", "Certified cheque"),
	P_26("26", "Local cheque"),
	P_27("27", "ACH demand corporate trade payment (CTP) debit"),
	P_28("28", "ACH demand corporate trade exchange (CTX) credit"),
	P_29("29", "ACH demand corporate trade exchange (CTX) debit"),
	P_30("30", "Credit transfer"),
	P_31("31", "Debit transfer"),
	P_32("32", "ACH demand cash concentration/disbursement plus (CCD+) credit"),
	P_33("33", "ACH demand cash concentration/disbursement plus (CCD+) debit"),
	P_34("34", "ACH prearranged payment and deposit (PPD)"),
	P_35("35", "ACH savings cash concentration/disbursement (CCD) credit"),
	P_36("36", "ACH savings cash concentration/disbursement (CCD) debit"),
	P_37("37", "ACH savings corporate trade payment (CTP) credit"),
	P_38("38", "ACH savings corporate trade payment (CTP) debit"),
	P_39("39", "ACH savings corporate trade exchange (CTX) credit"),
	P_40("40", "ACH savings corporate trade exchange (CTX) debit"),
	P_41("41", "ACH savings cash concentration/disbursement plus (CCD+) credit"),
	P_42("42", "Payment to bank account"),
	P_43("43", "ACH savings cash concentration/disbursement plus (CCD+) debit"),
	P_44("44", "Accepted bill of exchange"),
	P_45("45", "Referenced home-banking credit transfer"),
	P_46("46", "Interbank debit transfer"),
	P_47("47", "Home-banking debit transfer"),
	P_48("48", "Bank card"),
	P_49("49", "Direct debit"),
	P_50("50", "Payment by postgiro"),
	P_51("51", "FR, norme 6 97-Telereglement CFONB (French Organisation for"),
	P_52("52", "Urgent commercial payment"),
	P_53("53", "Urgent Treasury Payment"),
	P_54("54", "Credit card"),
	P_55("55", "Debit card"),
	P_56("56", "Bankgiro"),
	P_57("57", "Standing agreement"),
	P_58("58", "SEPA credit transfer"),
	P_59("59", "SEPA direct debit"),
	P_60("60", "Promissory note"),
	P_61("61", "Promissory note signed by the debtor"),
	P_62("62", "Promissory note signed by the debtor and endorsed by a bank"),
	P_63("63", "Promissory note signed by the debtor and endorsed by a third party"),
	P_64("64", "Promissory note signed by a bank"),
	P_65("65", "Promissory note signed by a bank and endorsed by another bank"),
	P_66("66", "Promissory note signed by a third party"),
	P_67("67", "Promissory note signed by a third party and endorsed by a bank"),
	P_68("68", "Online payment service"),
	P_70("70", "Bill drawn by the creditor on the debtor"),
	P_74("74", "Bill drawn by the creditor on a bank"),
	P_75("75", "Bill drawn by the creditor, endorsed by another bank"),
	P_76("76", "Bill drawn by the creditor on a bank and endorsed by a third party"),
	P_77("77", "Bill drawn by the creditor on a third party"),
	P_78("78", "Bill drawn by creditor on third party, accepted and endorsed by bank"),
	P_91("91", "Not transferable banker's draft"),
	P_92("92", "Not transferable local cheque"),
	P_93("93", "Reference giro"),
	P_94("94", "Urgent giro"),
	P_95("95", "Free format giro"),
	P_96("96", "Requested method for payment was not used"),
	P_97("97", "Clearing between partners"),
	P_98("98", "JP, Electronically Recorded Monetary Claims"),
	P_ZZZ("ZZZ", "Mutually defined");

	private final String code;
	private final String fullName;

	Uncl4461(String code, String fullName) {
		this.code = code;
		this.fullName = fullName;
	}

	public String getCode(){
		return code;
	}

	public String getFullName(){
		return fullName;
	}
}
