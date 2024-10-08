/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.core.model.codes;

public enum Uncl1001Inv {
	P_71("71", "Request for payment"),
	P_80("80", "Debit note related to goods or services"),
	P_82("82", "Metered services invoice"),
	P_84("84", "Debit note related to financial adjustments"),
	P_102("102", "Tax notification"),
	P_218("218", "Final payment request based on completion of work"),
	P_219("219", "Payment request for completed units"),
	P_331("331", "Commercial invoice which includes a packing list"),
	P_380("380", "Commercial invoice"),
	P_382("382", "Commission note"),
	P_383("383", "Debit note"),
	P_386("386", "Prepayment invoice"),
	P_388("388", "Tax invoice"),
	P_393("393", "Factored invoice"),
	P_395("395", "Consignment invoice"),
	P_553("553", "Forwarder's invoice discrepancy report"),
	P_575("575", "Insurer's invoice"),
	P_623("623", "Forwarder's invoice"),
	P_780("780", "Freight invoice"),
	P_817("817", "Claim notification"),
	P_870("870", "Consular invoice"),
	P_875("875", "Partial construction invoice"),
	P_876("876", "Partial final construction invoice"),
	P_877("877", "Final construction invoice");

	private final String code;
	private final String fullName;

	Uncl1001Inv(String code, String fullName) {
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
