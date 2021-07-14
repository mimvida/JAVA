package mvida;

import java.util.Arrays;

import javax.swing.JOptionPane;

import java.util.Scanner;

import mvida.Kalkulator;

public class Kalkulator {
	
	public static void main(String[] args) {

		//unos prvog imena
		Scanner a1 = new Scanner(System.in);
		System.out.println("Unesi prvo ime");
		String ime1 = a1.nextLine();
		
		//unos drugog imena
		Scanner a2 = new Scanner(System.in);
		System.out.println("Unesi drugo ime");
		String ime2 = a2.nextLine();
	
		//string za manipulaciju
		String obaImena=ime1+ime2;
		System.out.println("Unio si imena: " +ime1 +" i " +ime2);
		String imena = obaImena.toLowerCase();
	
		//brojanje slova
        int zbroj = 0;
        char slovo;
        for (int i = 0; i < imena.length(); i++) {

            slovo = imena.charAt(i);
            if (slovo == 'i')
                zbroj++;
        }

        System.out.println("i se pojavljuje " + zbroj + " u unesenim imenima");

        
//        String someString = "elephant";
//        char someChar = 'e';
//        int count = 0;
//         
//        for (int i = 0; i < someString.length(); i++) {
//            if (someString.charAt(i) == someChar) {
//                count++;
//            }
//        }
// System.out.println(count);
	
//	public Kalkulator() {
//		
//		char [] ime1 = new char [10];
//		for(int i=0;i<10;i++) {
//			ime1[i] = Character.toLowerCase(JOptionPane.showInputDialog("Unesi ime"));
//			}
//		System.out.println(Arrays.toString(ime1));
//		
//		//zbrajanje prvih 100 brojeva
//		int zbroj =0;
//		for(int i=0;i<=100;i++) {
//			zbroj+=i;
//		}
//		System.out.println(zbroj);
//		System.out.println("1");
//		System.out.println(suma(100));
//		System.out.println("2");
//	}
//	
//	private int suma(int broj) {
//		// kljucna stvar rekurzije: Uvjet izlaska iz rekurzije
//		// izlazi se kada vise ne zoves samog sebe
//		if(broj==0) {
//			return 0;
//		}
//		//funkcija zove samu sebe - REKURZIJA
//		return broj + suma(broj-1);
//	}
//	// 100 + 99 + .... + 1 + 0;
//	
//	public static void main(String[] args) {
//		new Kalkulator();
//	}
	}
}