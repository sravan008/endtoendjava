package ksk.test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentComparsion {


    static void printStundetsListBasedOnRank(List<Student> students) {

        // System.out.println(integerList.stream().sorted(Comparator.naturalOrder()));
        students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getStudentName)
                .thenComparing(Student::getClassRank)).forEach(System.out::println);


    }

    public static List<Student> getStudentData(){

        List<Student> students = new LinkedList<>();
        Student kumar = new Student("Kumar", 31, 700, 6);
        Student sunil = new Student("Sunil", 11, 400, 2);
        Student prasad = new Student("Prasad", 21, 900, 4);
        Student krithi = new Student("Krithi", 1, 901, 1);
        Student akmalaar = new Student("Akmalaar", 13, 710, 5);
        Student reddy = new Student("Reddy", 21, 810, 3);
        students.add(kumar);
        students.add(sunil);
        students.add(prasad);
        students.add(krithi);
        students.add(akmalaar);
        students.add(reddy);
        return students;
    }



    public static void main(String[] args) {


        printStundetsListBasedOnRank(StudentComparsion.getStudentData());

    }

}
