package edunova;

public class K2_IfOperatori {
	public static void main(String[] args) {
		
		int t=2, j=3;
		
		// operatori usporedjivanja i logicki
		if(t>=2 & j==3) {
			System.out.println("OK 1");
		}
		
		//& provjerava oba uvjeta
		
		
		//&& ce u slucaju da prvi uvjet nije zadovoljen
		//drugi se nece provjeravati
		if(t>2 && j==3) {
			System.out.println("OK 2");
		}
		
		
		// | provjerava oba uvjeta
		if(t>2 | j==3) {
			System.out.println("OK 3");
		}
		
		// || u slucaju da je zadovoljen prvi uvjet ne provjerava se drugi
		if(t==2 || j<0) {
			System.out.println("OK 4");
		}
		
		//logicni NOT
		if(!(t==2 || j==3)) {
			System.out.println("OK 5");
		}
		
		//ovo nije potrebno
		if(!(t==3)) {
			System.out.println("OK 6");
		}
		//pise se
		if(t!=3) {
			System.out.println("OK 7");
		}
		
		
	}

}
