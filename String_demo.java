package walletHub;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("HELLO"); 
		String s2 = new String("HELLO");
		
		if(s1==s2) {
			System.out.println("FALSE");
			
		}
			String personalLoan = new String("cheap personal loans");
			String homeLoan = new String("cheap personal loans");
			      
			//since two strings are different object result should be false
			boolean result = personalLoan == homeLoan;
			boolean result2 = s1==s2;
			System.out.println(result);
			System.out.println(result2);

			
		}
	}


