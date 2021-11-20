package org.lang;

public class LanguageInfo extends StateDetails{
private void tamilLanguage() {
	System.out.println("first language");
}
private void englishLanguage() {
	System.out.println("second language");
}
private void hindiLanguage() {
	System.out.println("hird language");
}
public static void main(String[] args) {
	LanguageInfo c=new LanguageInfo();
	c.englishLanguage();
	c.hindiLanguage();
	c.northIndia();
	c.southIndia();
	c.tamilLanguage();
}

}
