package ifelse;

public class IfElseTime {

	private static String Greeting;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int time =24;
		if (time  > 10) {
			System.out.println("Greeting Good Morning");
			
		} else if (time > 11) {
			System.out.println("Greeting Good Day");
		}else {
			System.out.println("Greeting Good Evening");
		}
		
	}

}
