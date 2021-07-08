package edunova;

import javax.swing.JOptionPane;

public class Zadatak11 {
	public static void main(String[] args) {
		
		// Za dva dana broja ispišite decimalni dio rezultata
		// djeljenja
//Prva opcija		
//		float a,b,c;
//		int d,e,f;
//		a=Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));
//		b=Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));
//		c=a/b;
//		d=(int)a;
//		e=(int)b;
//		f=d/e;
//		System.out.println(c-f);
		
//Druga opcija, predavanja
		double a=3, b=2;
		double rez=a/b;
		int r = (int)rez;
//		System.out.println(rez);
		System.out.println(rez-r);
	}


}
