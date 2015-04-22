package com.hillel.com.hillel.Inheritance;

import com.hillel.com.hillel.oopBasics.ImprovedArray;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by VZhuchkovsky on 22.04.2015.
 */
public class InheritanceMain {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10,5);

        ArrayList<Colored> list = new ArrayList<Colored>();
        list.add(circle);
        list.add(rectangle);
    }

    public static void polymorphism() {
        Circle circle = new Circle(10);

        Rectangle rectangle = new Rectangle(10,5);

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(circle);
        list.add(rectangle);

        // printAreas(list);
        print(list);
    }

    private static void printAreas(ArrayList<Shape> list) {
        for(Shape shape : list){
            System.out.println("area is " + shape.getArea());
        }
    }
    private static void print(ArrayList<Shape> list) {
        for(Shape shape : list){
            System.out.println(shape); //shape.toString
        }
    }

    public static void overloadedMethods() {
        Person person = new Employee("Ivan", "it");

        register(person);
        //register(new Person("Petro"));
    }

    public static void generics() {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Employee("ivan", "IT"));
        list.add(new Person("Andrey"));

        Employee employee = (Employee) list.get(0);
    }


    public static void inconvinientWay() {
        Employee employee = new Employee("Ivan", "dsf");
        Person employeeAsPerson = employee;
        Object employeeAsObject = employeeAsPerson;

        register(employee);
        register(employeeAsPerson);

        ArrayList array = new ArrayList(); //from ImprovedArray
        array.add(employee);
        array.add(employeeAsPerson);
        array.add(employeeAsObject);

        employee = (Employee) array.get(0); //(Employee) to set object
        employeeAsPerson = (Person) array.get(1);
        employeeAsObject = array.get(2); //already object

        if (employeeAsPerson instanceof Employee) {
            employee = (Employee) employeeAsPerson;
        }
        if (employee instanceof Person) {
            System.out.println("really?");
        }
    }

    //overload methods
    public static void register(Employee employee) {
        System.out.println("registered " + employee.getName());
    }

    public static void register(Person person) {
        System.out.println("registered " + person.getName());
    }

    public static void constructors() {
        // Person person = new Person("Ivan");

        Employee employee = new Employee("Ivan", "IT");

        //employee = new Employee("Vasya"); //constructors have no inheritance
    }

    public static void SimpleExample() {
     /*   Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setName("Petro");
        employee.setDepartment("IT"); */
    }
}
