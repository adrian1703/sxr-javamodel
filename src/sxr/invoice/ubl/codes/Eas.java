/*********** GENERATED - DO NOT MODIFY ***********/
package sxr.invoice.ubl.codes;

public enum Eas {
	P_0002("0002", "System Information et Repertoire des Entreprise et des Etablissements: SIRENE"),
	P_0007("0007", "Organisationsnummer (Swedish legal entities)"),
	P_0009("0009", "SIRET-CODE"),
	P_0037("0037", "LY-tunnus"),
	P_0060("0060", "Data Universal Numbering System (D-U-N-S Number)"),
	P_0088("0088", "EAN Location Code"),
	P_0096("0096", "DANISH CHAMBER OF COMMERCE Scheme (EDIRA compliant)"),
	P_0097("0097", "FTI - Ediforum Italia, (EDIRA compliant)"),
	P_0106("0106", "Vereniging van Kamers van Koophandel en Fabrieken in Nederland (Association of Chambers of Commerce and Industry in the Netherlands), Scheme (EDIRA compliant)"),
	P_0130("0130", "Directorates of the European Commission"),
	P_0135("0135", "SIA Object Identifiers"),
	P_0142("0142", "SECETI Object Identifiers"),
	P_0151("0151", "Australian Business Number (ABN) Scheme"),
	P_0183("0183", "Numéro d'identification suisse des enterprises (IDE), Swiss Unique Business Identification Number (UIDB)"),
	P_0184("0184", "DIGSTORG"),
	P_0188("0188", "Corporate Number of The Social Security and Tax Number System"),
	P_0190("0190", "Dutch Originator's Identification Number"),
	P_0191("0191", "Centre of Registers and Information Systems of the Ministry of Justice"),
	P_0192("0192", "Enhetsregisteret ved Bronnoysundregisterne"),
	P_0193("0193", "UBL.BE party identifier"),
	P_0195("0195", "Singapore UEN identifier"),
	P_0196("0196", "Kennitala - Iceland legal id for individuals and legal entities"),
	P_0198("0198", "ERSTORG"),
	P_0199("0199", "Legal Entity Identifier (LEI)"),
	P_0200("0200", "Legal entity code (Lithuania)"),
	P_0201("0201", "Codice Univoco Unità Organizzativa iPA"),
	P_0202("0202", "Indirizzo di Posta Elettronica Certificata"),
	P_0204("0204", "Leitweg-ID"),
	P_0208("0208", "Numero d'entreprise / ondernemingsnummer / Unternehmensnummer"),
	P_0209("0209", "GS1 identification keys"),
	P_0210("0210", "CODICE FISCALE"),
	P_0211("0211", "PARTITA IVA"),
	P_0212("0212", "Finnish Organization Identifier"),
	P_0213("0213", "Finnish Organization Value Add Tax Identifier"),
	P_0215("0215", "Net service ID"),
	P_0216("0216", "OVTcode"),
	P_0218("0218", "Unified registration number (Latvia)"),
	P_0221("0221", "The registered number of the qualified invoice issuer (Japan)"),
	P_0230("0230", "National e-Invoicing Framework (Malaysia)"),
	P_9901("9901", "Danish Ministry of the Interior and Health"),
	P_9910("9910", "Hungary VAT number"),
	P_9913("9913", "Business Registers Network"),
	P_9914("9914", "Österreichische Umsatzsteuer-Identifikationsnummer"),
	P_9915("9915", "Österreichisches Verwaltungs bzw. Organisationskennzeichen"),
	P_9918("9918", "SOCIETY FOR WORLDWIDE INTERBANK FINANCIAL, TELECOMMUNICATION S.W.I.F.T"),
	P_9919("9919", "Kennziffer des Unternehmensregisters"),
	P_9920("9920", "Agencia Española de Administración Tributaria"),
	P_9922("9922", "Andorra VAT number"),
	P_9923("9923", "Albania VAT number"),
	P_9924("9924", "Bosnia and Herzegovina VAT number"),
	P_9925("9925", "Belgium VAT number"),
	P_9926("9926", "Bulgaria VAT number"),
	P_9927("9927", "Switzerland VAT number"),
	P_9928("9928", "Cyprus VAT number"),
	P_9929("9929", "Czech Republic VAT number"),
	P_9930("9930", "Germany VAT number"),
	P_9931("9931", "Estonia VAT number"),
	P_9932("9932", "United Kingdom VAT number"),
	P_9933("9933", "Greece VAT number"),
	P_9934("9934", "Croatia VAT number"),
	P_9935("9935", "Ireland VAT number"),
	P_9936("9936", "Liechtenstein VAT number"),
	P_9937("9937", "Lithuania VAT number"),
	P_9938("9938", "Luxemburg VAT number"),
	P_9939("9939", "Latvia VAT number"),
	P_9940("9940", "Monaco VAT number"),
	P_9941("9941", "Montenegro VAT number"),
	P_9942("9942", "Macedonia, the former Yugoslav Republic of VAT number"),
	P_9943("9943", "Malta VAT number"),
	P_9944("9944", "Netherlands VAT number"),
	P_9945("9945", "Poland VAT number"),
	P_9946("9946", "Portugal VAT number"),
	P_9947("9947", "Romania VAT number"),
	P_9948("9948", "Serbia VAT number"),
	P_9949("9949", "Slovenia VAT number"),
	P_9950("9950", "Slovakia VAT number"),
	P_9951("9951", "San Marino VAT number"),
	P_9952("9952", "Turkey VAT number"),
	P_9953("9953", "Holy See (Vatican City State) VAT number"),
	P_9957("9957", "French VAT number"),
	P_9959("9959", "Employer Identification Number (EIN, USA)");

	private final String code;
	private final String fullName;

	Eas(String code, String fullName) {
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
