package edunova;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Zadatak7 {
	public static void main(String[] args) {
		
		// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
		// i s broj 1.
		// Za uneseni broj x = 27353 ispi?ite da li je prim broj	
		

//		int x=27353;
/*		int x;
		int brojac=0;
		x=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj koji zelis provjeriti"));
		for (int i=2;i<=x;i++) {
			if(x%i==0) {
				brojac++;
				System.out.println(brojac);
			}
		}
		if (brojac<=1) {
			System.out.println("Broj je prime.");
		}else {
			System.out.println("Broj nije prime");
		}

			//		if (x%2==0||x%3==0)
*/
		
		int x=27353;
		boolean primBroj=true;
		for (int i=2;i<x;i++) {
//			System.out.println(i);
			if(x%i==0) {
				primBroj=false;
//				break;
				System.out.println(i);
			}
		}
		if(primBroj) {
			System.out.println("Broj je prim");
		}else {
			System.out.println("Broj nije prim");
		}
	}    
}   