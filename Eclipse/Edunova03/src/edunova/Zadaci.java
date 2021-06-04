package edunova;

import javax.swing.JOptionPane;

public class Zadaci {
	public static void main(String[] args) {
/*		//deklarirajte varijablu za pohranu 
		//tjelesne temperature covjeka kao int i dodijelite
		//vrijednost 36
	    int tjelesnaTemperatura; 
		tjelesnaTemperatura=36;
		System.out.println(tjelesnaTemperatura);
		System.out.println("Tjelesna temperatura je " + tjelesnaTemperatura);

		//deklarirajte varijablu za pohranu 
		//tjelesne temperature covjeka kao decimalni broj i dodijelite
		//vrijednost 36		
	    double tjelesnaTemperatura2; 
		tjelesnaTemperatura2=36.0;
		System.out.println(tjelesnaTemperatura2);
		System.out.println("Tjelesna temperatura je " + tjelesnaTemperatura2);		

		//deklariraj varijablu za temperaturu
		//mjesta kao int i dodijelite 
		//vrijednost -9. Ispisite deklariranu vrijednost
		
	    int temperaturaMjesta; 
		temperaturaMjesta=-9;
		System.out.println("Temperatura mjesta je " + temperaturaMjesta);
	
		//Korisnik ucitava dva cijela broja i program ispisuje njihov zbroj
		//My way
		int i1;
	    int i2;
	
		String unioKorisnik1=JOptionPane.
				showInputDialog("Unesi prvi cijeli broj");
		String unioKorisnik2=JOptionPane.
				showInputDialog("Unesi drugi cijeli broj");

		i1=Integer.parseInt(unioKorisnik1);	
    	i2=Integer.parseInt(unioKorisnik2);
    	
		System.out.println(i1+i2);

		//Tomislav's way
		int prviBroj, drugiBroj;
		prviBroj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		drugiBroj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		System.out.println(prviBroj+drugiBroj);
		
		//Program od korisnika ucitava tri broja
		//program ispisuje zbroj prvog i treceg
		//podijeljen s drugim unesenim brojem
		
		int br1, br2, br3;
		br1=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi br1")
				);
		br2=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi br2")
				);
		br3=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi br3")
				);	
		int br4=br1+br3;
		System.out.println(br4);
		float br5=(float)br4/br2;
		System.out.println(br5);
		
		//drugi nacin
		System.out.println(br1+br3);
		System.out.println((br1+br3)/(float)br2);
*/
		// Korisnik unosi dvoznamenkasti broj 
		// Program ispisuje prvu znamenku
		int dvoznamenkastiBroj;
		int prvaZnamenka;
		prvaZnamenka=1;
		dvoznamenkastiBroj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenkasti broj")
				);
		System.out.println((""+dvoznamenkastiBroj).substring(0, prvaZnamenka));
		
		//drugi nacin
		System.out.println(dvoznamenkastiBroj/10);
	}

}
