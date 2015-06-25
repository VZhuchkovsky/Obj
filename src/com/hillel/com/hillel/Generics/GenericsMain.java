package com.hillel.com.hillel.Generics;

import com.hillel.com.hillel.Inheritance.Employee;
import com.hillel.com.hillel.Inheritance.Manager;
import com.hillel.com.hillel.Inheritance.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by VZhuchkovsky on 25.06.2015.
 */
public class GenericsMain {
    public static void main(String[] args) {
        Person person = new Person("Ed");
        Employee employee = new Employee("Ted", "IT");
        Manager manager = new Manager("Tom", "Management");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(manager);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager);

       // printDepartment(persons);
        printDepartment(employees);
        printDepartment(managers);

        printDepartment(employee);
        printDepartment(manager);

        addEmployee(employees);
        addEmployee(persons);
    }
    public static void addEmployee(List<? super Employee> employees){
        employees.add(new Employee("Ivan","Staff"));
    }
    public static void printDepartment(Employee employee){
            System.out.println(employee.getDepartment());
    }

    public static void printDepartment(List<? extends Employee> employees){ //? - any type that extends from Employee
        for(Employee employee : employees){
            System.out.println(employee.getDepartment());
        }
    }

    private static void pairUsage() {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        Integer first = pair.getFirst();

        String second = pair.getSecond();
    }

    private static void inheritanceAndGenerics() {
        List<Integer> listIntegers = new ArrayList<>();

        listIntegers.add(1);
        listIntegers.add(2);
        // listIntegers.add("3");

        for (Object o : listIntegers) {
            Integer i = (Integer) o;
            System.out.println(o);
        }

        Person person = new Person("Ed");
        Employee employee = new Employee("Ted", "IT");
        Manager manager = new Manager("Tom", "Management");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(manager);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);

        List<Manager> managers = new ArrayList<>();
        managers.add(manager);

        //employee = manager;

        //employees = managers;

        employees.add(manager);
        employees.add(employee);
        Manager manager1 = managers.get(0);
        Manager manager2 = managers.get(1);
        Manager manager3 = managers.get(2);

        Collection<Employee> employeeCollection = employees;
    }
}
