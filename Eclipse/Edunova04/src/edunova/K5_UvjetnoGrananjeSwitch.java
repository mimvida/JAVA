package edunova;

public class K5_UvjetnoGrananjeSwitch {
	
	public static void main(String[] args) {
		
		int operacija=1;
		
		if(operacija==1) {
			
		}else if(operacija==2) {
			
		}else if(operacija==3) {
			
		}else {
			
		}
		
		//switch radi s cijelim brojevima, char i string
		
		switch (operacija) {
		case 1: 
			System.out.println("zbrajanje");
			break;
		case 2:
			System.out.println("oduzimanje");
			break;
		case 3:
			System.out.println("mnozenje");
			break;
		case 4:
			System.out.println("dijeljenje");
			break;
		case 0:
		case 5:
			System.out.println("Bio si blizu, ali ne valja");
			break;
			default: 
				System.out.println("Greska");
		

		}
	}

}
