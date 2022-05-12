package.com.techvidan methodoverloading;

public class addition{
	int add(int a,int b){
		return (a+b);
	}
    int add(int a,int b,int c){
		return (a+b+c);
	}
    double add(double a,double b){
		return (a+b);
	}
}
public static void main(String args[]){
    addition ob = new addition();
    System.out.println("calling a method with 2 int parameters:" + ob.add(10,20));
    System.out.println("calling a method with 3 int parameters:" + ob.add(10,20,10));
    System.out.println("calling a method with 2 double parameters:" + ob.add(10.5,20.5));
    System.out.println("calling a method with 1 int and 1 double parameters:" + ob.add(10,20.5));
}