package day2.assignment20.package2;

import day2.assignment20.package1.Base;

public class Child2 extends Base {
    public void getValues() {
        // Base base = new Base(); // Can't access. change access specifier to public to access.
        // No access is needed as Child2 class already has access to all attributes and methods of Base class
        System.out.println(variable3);
        // System.out.println(base.variable3); // error (check assignment20 page page for more info)
        System.out.println(variable4);
        System.out.println(this.getVariable1());
        System.out.println(this.getVariable2());
    }

    public static void main(String[] args) {
       Child2 ch2 = new Child2();
       ch2.getValues();
    }
}
