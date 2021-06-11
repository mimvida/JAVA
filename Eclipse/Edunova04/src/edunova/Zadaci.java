package edunova;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Zadaci {
	public static void main(String[] args) {
		
/*	
	int unos;
	unos=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

	if(unos%2 == 0 ) {
		System.out.println("Osijek");
	}else {
		System.out.println("Donji Miholjac");
	}

	//Zadatak 2
	//program unosi 2 cijela broja ispisuje se veci
	
	int unos1;
	int unos2;
	
	unos1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
	unos2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	if(unos1>unos2) {
		System.out.println(unos1);
	}else {
		System.out.println(unos2);
	}
	
		
	//Zadatak 3
	
	//unesi 3 cijela broja, ispis najmanjeg
	int u1;
	int u2;
	int u3;
	u1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
	u2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	u3=Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
	if(u1<u2 && u1<u3) {
		System.out.println(u1);
	}else if(u2<u3 && u2<u3) {
		System.out.println(u2);
	}else{
		System.out.println(u3);
	}
	
*/
	
		//Primitivni kalkulator
		//korisnik prvo unosi operaciju
		//1 - zbrajanje
		//2 - oduzimanje
		//3 - mnozenje
		//4 - dijeljenje
		//za sve ostale unose program ispisuje GRESKA i zavrsava se
		//korisnik unosi dva decimalan broja
		//u odnosu na odabra operaciju, program ispisuje rezultat
		//ako je rezultat cijeli broj, ispisuje se bez .0
		//***rjesenje je sa modulom
		
		float broj1;
		float broj2;
		int operacija;
		float zbrajanje;
		float oduzimanje;
		float mnozenje;
		float dijeljenje;
		operacija=Integer.parseInt(JOptionPane.showInputDialog("Unesi operaciju"));
		broj1=Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi broj"));
		broj2=Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi broj"));
		zbrajanje=broj1+broj2;
		oduzimanje=broj1-broj2;
		mnozenje=broj1*broj2;
		dijeljenje=broj1/broj2;
		if(operacija<1 || operacija>4) {
			System.out.println("GRESKA");
		}else{		
		    if(operacija==1) {
                if (zbrajanje==(int)zbrajanje) {
		            System.out.println((int)zbrajanje);
		        }else {
		            System.out.println(zbrajanje);
		        }
		    }else if(operacija==2) {
                if (4==(int)oduzimanje) {
			        System.out.println((int)oduzimanje);
                }else{
			        System.out.println(oduzimanje);
                }
		    }else if(operacija==3) {
                if (mnozenje==(int)mnozenje) {
		    	    System.out.println((int)mnozenje);
                }else{
	    		    System.out.println(mnozenje);
                }
		    }else if(operacija==4) {
                if (dijeljenje==(int)dijeljenje){
			        System.out.println(dijeljenje);
                }else{
		    	    System.out.println(dijeljenje);	
                }
            }
        }
	
/*
		//Zadatak 5
		int unos1;
		int unos2;
		int a;
		unos1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		unos2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		a=unos1+unos2;
		if(a>10 && unos1==unos2) {
			System.out.println("Osijek");
		}else {
			System.out.println("Donji Miholjac");
		}
*/		
	}
}
