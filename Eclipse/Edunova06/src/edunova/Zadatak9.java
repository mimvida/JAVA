package edunova;

import javax.swing.JOptionPane;

public class Zadatak9 {
	
	public static void main(String[] args) {
		
		//Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		//Program ispisuje zbroj svih unesenih brojeva
		
		int zbroj=0;
		int unos;
		unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		for(int i=1;i!=0;i=unos) {
			zbroj+=unos;
//			System.out.println(unos); //ispisuje uneseni broj
			unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		} 
		System.out.println(zbroj);
	}

	
	
}
