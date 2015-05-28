package com.hillel.com.hillel.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VZhuchkovsky on 25.05.2015.
 */
public class JavaGroupMain {
    public static void main(String[] args) throws UnknownStudentException {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Dima");
        list.add("Taras");

        JavaGroup group = new JavaGroup(list);


        addGrade("Ivan", 5, group);
        addGrade("Dima", 5, group);
        addGrade("Nikita", 5, group);
        addGrade("Ivan", 2, group);

        addGrade(null, 2, group);

        group.addGrade("Dima", 5);

        System.out.println("end");

    }

    private static void addGrade(String name, Integer grade, JavaGroup group) throws UnknownStudentException {
        try {
            group.addGrade(name, grade);
        } catch (UnknownStudentException | GradeAlreadyExistException e) {
            e.printStackTrace(System.out);
        }catch (RuntimeException e){
            e.printStackTrace(System.out);
        }
    }
}
