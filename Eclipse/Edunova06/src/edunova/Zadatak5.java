package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
	
		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj
// Prva opcija, jedna provjera
//		int a;
//		int b;
//		a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi parni broj"));
//		b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi parni broj"));
//			if((a%2==0 & a!=0) & (b%2==0 & b!=0)) {
//				System.out.println("Zbroj parnih projeva je "+ (a+b));
//			}else {
//				
//			System.out.println("Nisi unio dva parna broja");
//		}
		
//Druga opcija, konstantna provjera
		int a,b;
		for(;;) {
			a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi parni broj"));
			if (a%2==0 & a!=0) {
				break;
			}
			JOptionPane.showMessageDialog(null, "Nisi unio parni broj!");
		}
		for(;;) {
			b=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi parni broj"));
			if (b%2==0 & b!=0) {
				break;
			}
			JOptionPane.showMessageDialog(null, "Nisi unio parni broj!");
		}
		int sum=a+b;
		System.out.println(sum);
	}
}


