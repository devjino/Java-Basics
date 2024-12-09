class A
{
    public void show()
    {
        System.out.println("in A show");
    }
 class B extends A
 {
    public void show()
    {
        System.out.println("in A show");
    }
 }
 class C extends A
 {
    public void show()
    {
        System.out.println("in A show");
    }
 }         
}

public class poly {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
}
