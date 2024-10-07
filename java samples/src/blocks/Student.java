package blocks;

public class Student {
    int sid;
    String sname;
    static int count = 0;

    // instance block gets executed everytime a instance is created
    {
        System.out.println("Instance block called");
        count++;
        System.out.println(count + " objects created");
    }

    // static block
    static {
        System.out.println("Static block called");

    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + "]";
    }

}
