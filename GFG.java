package walletHub;

public class GFG {
static final int NO_OF_CHARS = 256; 
	
	/* Fills count array with frequency of characters */
	static void fillCharCounts(String str, int[] count) 
	{ 
	for (int i = 0; i < str.length(); i++) 
		count[str.charAt(i)]++; 
	} 
	
	/* Print duplicates present in the passed string */
	static void printDups(String str) 
	{ 
	// Create an array of size 256 and fill count of every character in it 
	int count[] = new int[NO_OF_CHARS]; 
	fillCharCounts(str, count); 
	
	for (int i = 0; i < NO_OF_CHARS; i++) 
		if(count[i] > 1) 
			System.out.printf("%c, count = %d \n", i, count[i]); 
	
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello"; 
		int cc[] = new int[256];
		fillCharCounts(str,cc);
		for(int i=0;i<cc.length;i++) {
			System.out.println(cc[i]>=1);
		}
		//printDups(str);

	}

}
