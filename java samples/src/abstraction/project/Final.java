package abstraction.project;

public class Final extends ClassThree {
    public void callMethods() {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
    }

    public static void main(String[] args) {
        Final finalOne = new Final();
        finalOne.callMethods();
    }
}
