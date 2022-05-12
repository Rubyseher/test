import java.util.Scanner;

class largest{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int num = myObj.nextInt();

		int[] arr= new int[num];
		for (int i=0;i<num;++i ){
			arr[i]=myObj.nextInt();
		}

		int large=arr[0];

		for (int i=1;i<num;++i){
			if(arr[i]>large)
				large=arr[i];
		}
	
		System.out.println("The largest number is :"+large);
		
	}
}