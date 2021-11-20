package org.computer;

public class Computer extends Desktop {
private void computerModel() {
System.out.println("dell inspiron 30000 series");
}
public static void main(String[] args) {
	Computer b=new Computer();
	b.computerModel();
	b.desktopSize();
}


}
