import java.util.Scanner;
/Users/ruby/Desktop/College/oops/userArthi.java
class userArthi{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int n1,n2, add, sub, div, mod, mul;
		
		System.out.println("enter 2 numbers");
		

		n1= obj.nextInt();
		n2= obj.nextInt();

		add= n1+ n2;
		sub= n1- n2;
		div= n1/ n2;
		mod= n1% n2;
		mul= n1* n2;

		System.out.println("addition of numbers is: "+add);
		System.out.println("subtraction of numbers is: " + sub);
		System.out.println("division of numbers is: "+ div);
		System.out.println("addition of numbers is: "+ mod);
		System.out.println("addition of numbers is: "+ mul);
	}
}