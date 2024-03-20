package FunctionOfJava;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup>{

    private List<StudentGroup> stream;
    private int count = 0;

    public StreamIterator (Stream stream) {
        this.stream = stream.getStream();
    }
    @Override
    public boolean hasNext() {
        return count < stream.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()) {
            return null;
        }
        return stream.get(count++);
    }
    @Override
    public void remove() {
        stream.remove(count);
    }
    
}
