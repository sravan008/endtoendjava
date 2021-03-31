package ksk.ds.tree.priorityqueue;

import ksk.test.Student;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentPriorityQueue {






    public static void main(String[] args) {

        //Queue priorityQueue = new PriorityQueue(10,new StudentRankComparator());

        Queue priorityQueue = new PriorityQueue(10, Comparator.comparing(Student::getClassRank));

        Student kumar = new Student("Kumar", 31, 700, 6);
        Student sunil = new Student("Sunil", 11, 400, 2);
        Student prasad = new Student("Prasad", 21, 900, 4);
        Student krithi = new Student("Krithi", 1, 901, 1);
        Student akmalaar = new Student("Akmalaar", 13, 710, 5);
        Student reddy = new Student("Reddy", 21, 810, 3);
        priorityQueue.add(kumar);
        priorityQueue.add(sunil);
        priorityQueue.add(prasad);
        priorityQueue.add(krithi);
        priorityQueue.add(akmalaar);
        priorityQueue.add(reddy);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
//        System.out.println("-----------");
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.poll());

    }

}
