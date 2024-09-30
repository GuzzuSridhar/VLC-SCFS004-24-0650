package classesandobjects.customfields;

public class Driver {
    public static void main(String[] args) {
        // creating a department
        Department d1 = new Department("Sales", 100);
        Department d2 = new Department("IT", 101);

        // Employee creation
        Employee e1 = new Employee("Alex", 1000, d1);
        Employee e2 = new Employee("David", 1001, d2);

        // display the details of e1
        System.out.println(e1.ename);
        System.out.println(e1.empno);
        System.out.println(e1.department.dname);

        // display the details of e1
        System.out.println(e2.ename);
        System.out.println(e2.empno);
        System.out.println(e2.department.dname);
    }
}
