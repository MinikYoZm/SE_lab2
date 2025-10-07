package lab2;
/**
 * Клас, шо запускає наше чудо
 */
public class Main {
    /**
     * Точка входу
     * @param args параметри
     */
    public static void main(String[] args) {

        Class1 cl1 = new Class1(); cl1.meth1(); cl1.meth3();
        Class2 cl2 = new Class2(); cl2.meth2(); cl2.meth1(); cl2.meth3();
        Class3 cl3 = new Class3(); cl3.meth3();
    }
}
