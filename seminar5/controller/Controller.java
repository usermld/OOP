package seminar5.controller;

import java.util.ArrayList;
import java.util.List;


import seminar5.model.Student;
import seminar5.model.Teacher;
import seminar5.model.Type;
import seminar5.model.User;
import seminar5.service.DataService;
import seminar5.service.LearnGroupService;

import seminar5.view.StudentView;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final LearnGroupService learnGroupService = new LearnGroupService();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole(user);
        }
    }

    public void createLearnGroup(){
        List<User> userList = dataService.getAll();
        List<Student> ss = new ArrayList<>();
        

      for (User user : userList) {
        if(user instanceof Student){
            ss.add((Student) user);
        }
      }

      for (User user : userList) {
        if(user instanceof Teacher){
            learnGroupService.create((Teacher) user, ss);
        }
      }
        
    }
    
    
}
