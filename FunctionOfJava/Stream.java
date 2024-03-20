package FunctionOfJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    
    private List<StudentGroup> stream;

    public Stream (List<StudentGroup> stream) {
        this.stream = stream;
    }
    public Stream () {
        stream = new ArrayList<>();
    }
    public void addStudentGroup (StudentGroup studentGroup) {
        stream.add(studentGroup);
    }
    public List<StudentGroup> getStream() {
        return stream;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }
    @Override
    public String toString() {
        return "Stream: " + stream;
    }
    
}
