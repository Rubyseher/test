import java.util.Scanner;

class userPali{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);

		System.out.println("Enter a number");
		int num1= obj.nextInt();
	
		int last ,ans=0,n=num1;
		while (num1>0){
			last = num1% 10;
			ans= ans*10 + last;
			num1=num1/10;
		}
		
		if (ans==n)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");	
	}
}