package edunova;

import javax.swing.JOptionPane;

public class K03_Omotaci {
	public static void main(String[] args) {
		int i=Integer.parseInt("7");
		
		System.out.println(i);
		
		String unioKorisnik=JOptionPane.
				showInputDialog("Daj cijeli broj");
		//razlika izmedju primitivnih tipova i objekata
		
		i=Integer.parseInt(unioKorisnik);
		
		System.out.println(i+10);
		
		i=Integer.parseInt(
				JOptionPane.showInputDialog("Broj")
				);
		//minimalni integer broj
		System.out.println(Integer.MIN_VALUE);

		//maxsimalni integer broj
		System.out.println(Integer.MAX_VALUE);

		boolean aktivan=Boolean.parseBoolean("true");
		
		byte brojDo127=Byte.parseByte("23");
		
		short veciBroj=Short.parseShort("12");
		
		int broj=27363;
		
		long velikiBroj=Long.parseLong("2345677987");
		
		float decimalniManji=Float.parseFloat("3.14");
		
		double decimalniVeliki=Double.parseDouble("3.14");
		
		char znak=Character.forDigit(46, 10);
		
		System.out.println(znak);
	
	}


}
