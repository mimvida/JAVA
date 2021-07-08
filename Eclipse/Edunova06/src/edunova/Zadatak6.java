package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

//import org.graalvm.compiler.core.common.spi.JavaConstantFieldProvider_OptionDescriptors;

public class Zadatak6 {
	public static void main(String[] args) {
		
		// Program unosi 10 cijelih brojeva od korisnika
		// u jednodimenzionalni niz
		// Program ispisuje sve elemente niza
//Prva opcija, na siroko, losija opcija	
//		int [] niz = new int [10];
//		niz [0] = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
//		niz [1] = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
//		niz [2] = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci cijeli broj"));
//		niz [3] = Integer.parseInt(JOptionPane.showInputDialog("Unesi cetvrti cijeli broj"));
//		niz [4] = Integer.parseInt(JOptionPane.showInputDialog("Unesi peti cijeli broj"));
//		niz [5] = Integer.parseInt(JOptionPane.showInputDialog("Unesi sesti cijeli broj"));
//		niz [6] = Integer.parseInt(JOptionPane.showInputDialog("Unesi sedmi cijeli broj"));
//		niz [7] = Integer.parseInt(JOptionPane.showInputDialog("Unesi osmi cijeli broj"));
//		niz [8] = Integer.parseInt(JOptionPane.showInputDialog("Unesi deveti cijeli broj"));
//		niz [9] = Integer.parseInt(JOptionPane.showInputDialog("Unesi deseti cijeli broj"));
//		
//		System.out.println(Arrays.toString(niz));
		
//Druga opcija, predavanja
		int [] niz = new int [10];
		for(int i=0;i<10;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			}
		System.out.println(Arrays.toString(niz));
	}

	
}
