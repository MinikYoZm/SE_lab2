package lab2;

/**
 * Клас, шо реалізує ігтерфейс 3 та методи з нього
 */
public class Class3 implements Interface3 {
    /**
     * Агрегований інтерфейс 2
     */
    Interface2 if2;

    /**
     * Реалізація методу 3 з інт 3
     */
    @Override
    public void meth3() {
        System.out.println("lab2.Class3.meth3()");
    }
}