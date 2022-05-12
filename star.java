import java.util.Scanner;

class star{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("rows");
		int row = obj.nextInt();
		
		for(int i=1;i<=row;++i){
			
			for (int j=row;j>i;--j){
				System.out.print(" ");
			}

			for (int s=1;s<=(2*i-1);++s)
				System.out.print("*");
			
			System.out.println();
		}
	}
}