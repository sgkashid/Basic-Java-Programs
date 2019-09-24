//Character pattern Programming
public class CharPattern {
	
	public static void main(String[] args) {
		
		String s="ABACABACACAB ABACAFADAGHAB";
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if('A'==s.charAt(i) && 'B'==s.charAt(i+1)){
				count++;
			}
		}
		
		System.out.println("Number of AB pattern repeated in String " + count);
	}

}
