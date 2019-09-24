//Prime no identification

public class prime {

	public static void main(String[] args) {
		int a=91, b, f=0;
		for (b=2; b<a; b++)
		{
			if(a%b==0)
			{
				f=1;
			}
		}   
		if(f==1)
		{System.out.println( a+ ""
				+ " is not prime");		}
		else
		{System.out.println( a+ " is prime");		}	
		
	}
	
}