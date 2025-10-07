package lab2;

public class Class2 implements Interface2 {
    Interface3 if3;

    @Override
    public void meth2() {
        System.out.println("lab2.Class2.meth2()");
    }

    public void meth1() {
        System.out.println("lab2.Class2.meth1()");
    }

    public void meth3() {
        System.out.println("lab2.Class2.meth3()");
    }
}
