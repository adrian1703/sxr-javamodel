/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.codes;

public enum Uncl2005 {
	P_3("3", "Invoice document issue date time"),
	P_35("35", "Delivery date/time, actual"),
	P_432("432", "Paid to date");

	private final String code;
	private final String fullName;

	Uncl2005(String code, String fullName) {
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
