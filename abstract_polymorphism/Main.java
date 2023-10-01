package abstract_polymorphism;

//import access_modifier.ProtectedClass;
//import access_modifier.Test;
import access_modifier.*;

public class Main {
    public static void main(String[] args) {
        ProtectedClass test = new ProtectedClass();

        Test test1 = new Test();

        TestClass testClass = new TestClass();
        testClass.getProperty();

    }
}
