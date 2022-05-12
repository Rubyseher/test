class student{
    int rn;
    String name;
void insertRecord(int r,String n){
    rn=r;
    name=n;
}
void displayinfo(){
    System.out.println("rollno is "+ rn + "name is " + name);
}

}
class TestStu{
    public static void main(String args[]){
        student s1 = new student();
        student s2 = new student();

        s1.insertRecord(1,"tim");
        s2.insertRecord(2,"tib");

        s1.displayinfo();
        s2.displayinfo();
    }
}
