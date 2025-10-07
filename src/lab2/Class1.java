package lab2;

public class Class1 extends Class3 implements Interface1 {
    Class3 cl3;

    @Override
    public void meth1() {
        System.out.println("lab2.Class1.meth1()");
    }

    public void meth3() {
        System.out.println("lab2.Class1.meth3()");
    }
}