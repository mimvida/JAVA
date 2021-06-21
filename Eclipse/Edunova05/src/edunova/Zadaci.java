package edunova;

import javax.swing.JOptionPane;

public class Zadaci {
	public static void main(String[] args) {
		

	//Program uèitava 5 decimalnih brojeva u niz
	//Program ispisuje prvi i posljednji element niza
	
		/*
		float[] niz = new float[5];
		niz[0] = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi decimalni broj"));
		niz[1] = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi decimalni broj"));
		niz[2] = Float.parseFloat(JOptionPane.showInputDialog("Unesi treci decimalni broj"));
		niz[3] = Float.parseFloat(JOptionPane.showInputDialog("Unesi cetvrti decimalni broj"));
		niz[4] = Float.parseFloat(JOptionPane.showInputDialog("Unesi peti decimalni broj"));

	    System.out.println("Prvi broj je " +niz[0] +", zadnji broj je " +niz[4]);
	    */
	    /*2. primjer
	    double[] b= {
	    		Double.parseDouble(JOptionPane.showInputDialog("B1")),
	    		Double.parseDouble(JOptionPane.showInputDialog("B2")),
	    		Double.parseDouble(JOptionPane.showInputDialog("B3")),
	    		Double.parseDouble(JOptionPane.showInputDialog("B4")),
	    		Double.parseDouble(JOptionPane.showInputDialog("B5"))
	    };
	    System.out.println(b[0]+ " - "b[4]);
	    */
	//Program preko args parametara prima dva cijela broja
	//Program ispisuje zbroj primljenih brojeva
		System.out.println(
				Integer.parseInt(args[0]) + Integer.parseInt(args[1])
				);
	
	//Korisnik unosi cijeli broj
	//Program ispisuje broj 7 jedno ispod drugog
	//onoliko puta koliko je korisnik unio
/*		int unos1;
		unos1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		for(int i=0;i<unos1;i=i+1) {
			System.out.println("7");
		}
*/	
	// program ispisuje sve parne brojeve od 1 do 55
	// U petlji obavezno koristiti vrijednosti 1 i 55
/*	System.out.println();
	for(int i=1;i<55;i++) {
//		if i%2==1{
			
		}
//		System.out.println(i);
	}
*/	
	/*
	//loše rješenje
	public static void main(String[] args) {
		for(int i=2;i<=54;i+=2) {
			System.out.println(i);
		}
	}
	*/
	
	
	//Program unosi 5 cijelih brojeva u niz
	//Program ispisuje najveæi uneseni broj
		
		
		//DZ
		int a=1;
		int b=2;
		int c;
		++a;
		System.out.println(a);
		c=a+5-b;
		System.out.println(c);
		
	}
}
