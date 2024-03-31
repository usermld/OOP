package seminar5.service;

import java.util.ArrayList;
import java.util.List;

import seminar5.model.Student;
import seminar5.model.Teacher;
import seminar5.model.User;



public class LearnGroupService{


    public void create (Teacher teacherOfGroup, List<Student> students){
        List<User> studentGroup = new ArrayList<>();

        for (Student student : students) {
            studentGroup.add(student);
        }
        studentGroup.add(teacherOfGroup);
        
        System.out.println(studentGroup);
        
        
        
    }
    
}
