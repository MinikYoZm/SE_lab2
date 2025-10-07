package lab2;

/**
 * Клас, шо реалізує ігтерфейси 1,3 та методи з нього
 */
public class Class1 extends Class3 implements Interface1 {
    Class3 cl3;
    /**
     * Реалізація методу 1 з інт 1
     */
    @Override
    public void meth1() {
        System.out.println("lab2.Class1.meth1()");
    }
    /**
     * Реалізація методу 3 з інт 3
     */
    @Override
    public void meth3() {
        System.out.println("lab2.Class1.meth3()");
    }
}