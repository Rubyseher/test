import java.util.Scanner;

class userFact{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int n1,ans=1;
		
		System.out.println("Enter number");
		n1 = obj.nextInt();
		
		for(int i=n1;i>=1;--i)
			ans*=i;
		System.out.println("Factorial of " + n1 + "is :"+ ans);

	}
}