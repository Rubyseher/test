class swapWithout{
	public static void main(String args[]){
		int x=10;
		int y=20;
		
		System.out.println("before swapping numbers: "+x +" "+ y);
		
		x=x+y;
		y=x-y;
		x=x-y;
	 	
		System.out.println("after swapping numbers: "+x +" "+ y);
	}
}