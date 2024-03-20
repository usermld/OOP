package FunctionOfJava;

public class Student implements Comparable<Student>{
    
    private int studentID;
    private String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID () {
        return studentID;
    }
    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", " +
                "StudentID: " + studentID;
    }
    @Override
    public int compareTo(Student o){
        if (studentID > o.getStudentID()){
            return 1;
        }
        else if (studentID < o.getStudentID()){
            return -1;
        }
        return 0;
    }
}
