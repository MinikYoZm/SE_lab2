package lab2;

/**
 * Клас, шо реалізує ігтерфейси 2,1,3 та методи з нього
 */
public class Class2 implements Interface2 {
    /**
     * Агрегований інтерфейс 3
     */
    Interface3 if3;
    /**
     * Реалізація методу 2 з інт 2
     */
    @Override
    public void meth2() {
        System.out.println("lab2.Class2.meth2()");
    }
    /**
     * Реалізація методу 1 з інт 1
     */
    @Override
    public void meth1() {
        System.out.println("lab2.Class2.meth1()");
    }
    /**
     * Реалізація методу 3 з інт 3
     */
    @Override
    public void meth3() {
        System.out.println("lab2.Class2.meth3()");
    }
}
