package day4.assignment32;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Suyog";
        try {
            Class classObj = Class.forName("day4.assignment32.Employee");
            Method[] methods = classObj.getMethods();
            // Printing method names
            for (Method method:methods)
                System.out.println(method.getName());

            // Printing field names
            try {
                Field field = classObj.getDeclaredField("name");
                System.out.println(field.getName());

                // allows the object to access the field irrespective
                // of the access specifier used with the field
                field.setAccessible(true);

                // takes object and the new value to be assigned
                // to the field as arguments
                try {
                    field.set(emp, "JAVA");
                    System.out.println(emp.getName());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }


            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
