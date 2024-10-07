package abstraction.project;

public class FinalOne extends ClassThree {
    public void callMethods() {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
    }

    public static void main(String[] args) {
        FinalOne finalOne = new FinalOne();
        finalOne.callMethods();
    }
}
