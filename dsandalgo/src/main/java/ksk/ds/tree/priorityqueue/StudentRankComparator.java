package ksk.ds.tree.priorityqueue;

import ksk.test.Student;

import java.util.Comparator;

public class StudentRankComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getClassRank() == o2.getClassRank()) {
            return 0;
        } else if (o1.getClassRank() > o2.getClassRank()) {
            return -1;
        } else return 1;
    }
}
