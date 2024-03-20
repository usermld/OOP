package FunctionOfJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    
    private List<Student> studentList;
    private String nameGroup;

    public StudentGroup(List<Student> studentList, String nameGroup) {
        this.studentList = studentList;
        this.nameGroup = nameGroup;
    }
    public StudentGroup() {
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public String nameGroup () {
        return nameGroup;
    }
    
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    @Override
    public int compareTo(StudentGroup o) {
        if (studentList.size() > o.studentList.size()) {
            return 1;
        }
        else if (studentList.size() < o.studentList.size()) {
            return -1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Student group: " + studentList;
    }
}
