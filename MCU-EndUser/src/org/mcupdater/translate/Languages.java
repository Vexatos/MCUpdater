package org.mcupdater.translate;

public enum Languages {
	en_US(new USEnglish()),
	en_GB(en_US.getProxy()),
	en_CA(en_US.getProxy()),
	en_AU(en_US.getProxy()),
	fr_FR(new FRFrench()),
	fr_CA(fr_FR.getProxy()),
	fr_BE(fr_FR.getProxy()),
	fr_LU(fr_FR.getProxy()),
	;
	
	private TranslateProxy proxy;

	Languages(TranslateProxy proxy){
		this.proxy = proxy;
	}
	
	public TranslateProxy getProxy() {
		return this.proxy;
	}
	
	public static String getLocale() {
		return System.getProperty("user.language") + "_" + System.getProperty("user.country");
	}
}
