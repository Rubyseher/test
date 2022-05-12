class Box{
	double width, height,depth;

Box(){
	System.out.println("Constructing Box");
	width=10;
	height=10;
}
double volume(){
	return width*height*depth;
}
void setDim(double w, double h, double d){
	width=w;
	height=h;
	depth=d;
}
}
class boxes{
	public static void main(String args[]){
	
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		double vol;
		mybox1.setDim(10,20,15);
		mybox2.setDim(3,6,9);

		vol=mybox1.volume();
		System.out.println("Volume is"+vol);
		vol=mybox2.volume();
		System.out.println("Volume is"+vol);
	}
}