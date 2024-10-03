/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.codes;

public enum Uncl5305 {
	P_AE("AE", "Vat Reverse Charge"),
	P_E("E", "Exempt from Tax"),
	P_S("S", "Standard rate"),
	P_Z("Z", "Zero rated goods"),
	P_G("G", "Free export item, VAT not charged"),
	P_O("O", "Services outside scope of tax"),
	P_K("K", "VAT exempt for EEA intra-community supply of goods and services"),
	P_L("L", "Canary Islands general indirect tax"),
	P_M("M", "Tax for production, services and importation in Ceuta and Melilla"),
	P_B("B", "Transferred (VAT), In Italy");

	private final String code;
	private final String fullName;

	Uncl5305(String code, String fullName) {
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
