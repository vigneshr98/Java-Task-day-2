package org.bank;

public class BankInfo extends AxisBank{
private void savings() {
	System.out.println("6%");
}
private void fixed() {
	System.out.println("7%");
}
public static void main(String[] args) {
	BankInfo a=new BankInfo();
	a.savings();
	a.fixed();
	a.deposit();
}

}
