package br.com.tlndev.imersaojavaapi.constants;

public enum LogoUtil {
	JAVA("https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png"),
	PYTHON("https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png"),
	PHP("https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png"),
	C_SHARP("https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/csharp/csharp_256x256.png");
	
	private String logo;
	
	LogoUtil(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}
}
