package FunctionOfJava;

import java.util.Comparator;

public class StreamCorporator implements Comparator<StudentGroup>{

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.compareTo(o2);
    }
    
}
