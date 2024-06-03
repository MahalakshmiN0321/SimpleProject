package io.maha;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws Exception {

        Class c = Class.forName("io.maha.Employee");
        System.out.println("Class Name:" + c.getName());
        System.out.println("Super Class:" + c.getSuperclass().getName());
        System.out.print("Interfaces: ");
        Class[] cls = c.getInterfaces();
        for (Class cl : cls) {
            System.out.print(cl.getName() + "   ");
        }
        System.out.println();
        System.out.print("Variables: ");
        Field[] f = c.getDeclaredFields();
        for (Field fs : f) {
            System.out.print(fs.getName() + "  ");
        }
        System.out.println();
        System.out.print("Constructors: ");
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.print(con.getName() + "   ");
        }
        System.out.println();
        System.out.print("" +
                "Methods:");
        Method[] md = c.getDeclaredMethods();
        for (Method d : md) {
            System.out.print(d.getName() + " ");
        }
    }
}
//        Class c1=Class.forName("io.maha.Employee");
//        System.out.println(c1.getName());
//
//        Employee e=new Employee();
//        Class c2=e.getClass();
//        System.out.println(c2.getName());
//
//        Class c3=Employee.class;
//        System.out.println(c3.getName());