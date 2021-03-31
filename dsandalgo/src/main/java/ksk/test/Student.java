package ksk.test;

public class Student {

    private String studentName;
    private int rollNumber;
    private double marks;
    private int classRank;


    public String getStudentName() {
        return studentName;
    }

    public Student(String studentName, int rollNumber, double marks, int classRank) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.classRank = classRank;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getClassRank() {
        return classRank;
    }

    public void setClassRank(int classRank) {
        this.classRank = classRank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                ", classRank=" + classRank +
                '}';
    }
}
