package FunctionOfJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "aaa");
        Student student2 = new Student(2, "BBB");
        Student student3 = new Student(3, "AAA");
        Student student4 = new Student(4, "CCC");
        Student student5 = new Student(5, "DDD");

        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup1.addStudent(student2);
        studentGroup1.addStudent(student3);
        studentGroup1.addStudent(student1);

        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup2.addStudent(student4);

        StudentGroup studentGroup3 = new StudentGroup();
        studentGroup3.addStudent(student5);

        Stream stream1 = new Stream();
        stream1.addStudentGroup(studentGroup2);
        
        Stream stream2 = new Stream();
        stream2.addStudentGroup(studentGroup3);
        stream2.addStudentGroup(studentGroup1);

        for (Student student : studentGroup1) {
            System.out.println(student);
        }
        
        System.out.println();

        for (Student student : getSortedStudentGroup(studentGroup1)) {
            System.out.println(student);
        }
        
        System.out.println();
        
        for (Student student : getSortedStudentGroupByName(studentGroup1)) {
            System.out.println(student);
        }

        System.out.println();

        for (StudentGroup studentGroup : getSortedStudentGroup(stream1)) {
            System.out.println(studentGroup);
        }

        System.out.println();

        for (StudentGroup studentGroup : getSortedStudentGroup(stream2)) {
            System.out.println(studentGroup);
        }

    }
    public static List<Student> getSortedStudentGroup(StudentGroup s) {
        List<Student> studentList = new ArrayList<>(s.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }
    public static List<Student> getSortedStudentGroupByName(StudentGroup studentGroup){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComporator());
        return studentList;
    }
    public static List<StudentGroup> getSortedStudentGroup (Stream stream) {
        List<StudentGroup> streamList = new ArrayList<>(stream.getStream());
        streamList.sort(new StreamCorporator());
        return streamList;
    }
}
