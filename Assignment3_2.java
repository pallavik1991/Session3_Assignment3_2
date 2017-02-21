import java.util.Scanner;
class Assignment3_2
{
	public static void main(String args[])
	{
		String S1,S2;
		boolean same;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for S1:");
		S1=sc.next();
		System.out.println("Enter value for S2:");
		S2=sc.next();
	
		if(S1.equals(S2))
		{
			same=true;
		}
		else
		{
			same=false;
		}
		
		System.out.println(same);
	}
}