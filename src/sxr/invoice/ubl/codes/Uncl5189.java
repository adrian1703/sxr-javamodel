/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.codes;

public enum Uncl5189 {
	P_41("41", "Bonus for works ahead of schedule"),
	P_42("42", "Other bonus"),
	P_60("60", "Manufacturer’s consumer discount"),
	P_62("62", "Due to military status"),
	P_63("63", "Due to work accident"),
	P_64("64", "Special agreement"),
	P_65("65", "Production error discount"),
	P_66("66", "New outlet discount"),
	P_67("67", "Sample discount"),
	P_68("68", "End-of-range discount"),
	P_70("70", "Incoterm discount"),
	P_71("71", "Point of sales threshold allowance"),
	P_88("88", "Material surcharge/deduction"),
	P_95("95", "Discount"),
	P_100("100", "Special rebate"),
	P_102("102", "Fixed long term"),
	P_103("103", "Temporary"),
	P_104("104", "Standard"),
	P_105("105", "Yearly turnover");

	private final String code;
	private final String fullName;

	Uncl5189(String code, String fullName) {
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
