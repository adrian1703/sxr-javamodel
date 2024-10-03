package sxr.model.codes;

public enum Mimecode {
	P_text_csv("text/csv", "text/csv"),
	P_application_pdf("application/pdf", "application/pdf"),
	P_image_png("image/png", "image/png"),
	P_image_jpeg("image/jpeg", "image/jpeg"),
	P_application_vnd_openxmlformats_officedocument_spreadsheetml_sheet("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
	P_application_vnd_oasis_opendocument_spreadsheet("application/vnd.oasis.opendocument.spreadsheet", "application/vnd.oasis.opendocument.spreadsheet");

	private final String code;
	private final String fullName;

	Mimecode(String code, String fullName) {
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
