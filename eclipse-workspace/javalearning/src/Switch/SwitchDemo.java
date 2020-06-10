package Switch;

public class SwitchDemo {

	public static void main(String[] args) {
		/*The "Switch statement is used to perform on different condition. 
		Use the "switch statement to select one of many coed blocks to be executed.
		
		This is how it works:

			The switch expression is evaluated once.
			The value of the expression is compared with the values of each case.
			If there is a match, the associated block of code is executed.
			If there is no match, the default code block is executed.
			
	what is difference between Nested and Switch ?  
		Nested - is compliacted for multiple selections and it uses an independent expression for each case. 
			Switch - is easy to understand for multiple selestctions and it use a sigle expression for all case but easch case must have a constant value of inteher type or charactertype. 
		
		*/
		
		
		int day=5;
		
		switch (day)
		{
		case 1:System.out.println("Sunday"); break;
		case 2:System.out.println("Monday"); break;
		case 3:System.out.println("Tuesday"); break;
		case 4:System.out.println("Wednesay"); break;
		case 5:System.out.println("Thuesday"); break;
		case 6:System.out.println("Friady"); break;
		case 7:System.out.println("Saturday"); break;
		
		default: System.out.println("invaild week number"); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
