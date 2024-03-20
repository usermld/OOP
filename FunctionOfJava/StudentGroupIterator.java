package FunctionOfJava;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{
    private List<Student> studentList;
    private int count = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
    }
    @Override
    public boolean hasNext() {
        return count < studentList.size();
    }
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentList.get(count++);
    }
    @Override
    public void remove() {
        studentList.remove(count);
    }

}
