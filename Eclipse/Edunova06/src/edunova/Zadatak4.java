package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	
	public static void main(String[] args) {
		
	// Program u�itava cijele brojeve od korisnika
	// sve dok se ne u�ita broj 0. Tada se program zavr�ava
//	Prvi nacin
//		int unos;
//		for(int i=1;i!=0;i=unos) {
//			unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi bilo koji broj, ako uneses broj 0, program se zavrsava"));
//			System.out.println(unos);			
//		}
		
//	Drugi nacin
		int unos;
		for(;;) {
			unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi bilo koji broj, ako uneses broj 0, program se zavrsava"));
			if (unos==0) {
				break;
			}
		}
	}
}


