
class A{
    public void meth1(){
        System.out.println("i'm in class a");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("i'm in class b");
    }
    public void meth1(){
        System.out.println("i'm in class b");
    }

}


public class thisdd {
    public static void main(String[] args) {
A a=new A();
a.meth1();
B b=new B();
b.meth1();
    }
}
