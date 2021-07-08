package edunova;

import javax.swing.JOptionPane;

public class Zadatak9 {
	
	public static void main(String[] args) {
		
		//Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		//Program ispisuje zbroj svih unesenih brojeva
//Prvi nacin		
//		int zbroj=0;
//		int unos;
//		unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
//		for(int i=1;i!=0;i=unos) {
//			zbroj+=unos;
////			System.out.println(unos); //ispisuje uneseni broj
//			unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
//		} 
//		System.out.println(zbroj);
	
//Drugi nacin, predavanja
		int a;
		int sum=0;
		
		for(;;) {
			a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			if(a==0) {
				break;
			}
			sum=sum+a;
		}
		System.out.println(sum);
		
	}

	
	
}
