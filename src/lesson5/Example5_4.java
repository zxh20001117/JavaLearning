package lesson5;

class A4{
    protected double x=8.0,y=0.888888;
    public void speak(){
        System.out.println("我喜欢NBA");
    }
    public void cry(){
        y=x+y;
        System.out.printf("y=%f\n",y);
    }
}
class B4 extends A4{
    int y=100,z;
    public void speak(){
        z=2*y;
        System.out.println("I love This Game");
        System.out.printf("y=%d,z=%d",y,z);
    }
}
class Example5_4{
    public static void main(String args[ ]){
        B4 b=new B4();
        b.cry();
        b.speak();
    }
}
