package inheritence.simple;

public class Driver {
    public static void main(String[] args) {
        Child c = new Child(); // has got access to all non private parent fields and methods
        c.childVar = "test child"; // child variable with child instance
        c.parentVar = "test parent";// parent variable with child instance

        c.childMethod(); // child method with child instance
        c.parentMethod(); // parent method with child instance
        c.eat();
        c.occupation();

        Parent p = new Parent();
        p.eat();
        p.occupation();

    }
}
