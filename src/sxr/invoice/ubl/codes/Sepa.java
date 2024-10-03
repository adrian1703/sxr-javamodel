/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.codes;

public enum Sepa {
	P_SEPA("SEPA", "SEPA unique bank assigned creditor identifier");

	private final String code;
	private final String fullName;

	Sepa(String code, String fullName) {
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
