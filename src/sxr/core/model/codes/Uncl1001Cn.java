/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.core.model.codes;

public enum Uncl1001Cn {
	P_81("81", "Credit note related to goods or services"),
	P_83("83", "Credit note related to financial adjustments"),
	P_381("381", "Credit note"),
	P_396("396", "Factored credit note"),
	P_532("532", "Forwarder's credit note");

	private final String code;
	private final String fullName;

	Uncl1001Cn(String code, String fullName) {
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
