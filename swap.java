class swap{
	public static void main(String args[]){
		int num1=10;
		int num2=20;
		int temp=0;

		System.out.println("Before swapping num1 is "+ num1 + "and num 2 is " + num2);
		

		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping num1 is "+ num1 + "and num 2 is " + num2);
		
	}
}