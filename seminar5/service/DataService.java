package seminar5.service;


import java.util.ArrayList;
import java.util.List;

import seminar5.model.Student;
import seminar5.model.Teacher;
import seminar5.model.User;
import seminar5.model.Type;


public class DataService {
    private List<User> userList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeID(type);
        if (type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, lastName,id));
        }
        if(type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, lastName,id));
        }
    }

    private int getFreeID(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastID = 1;

        for (User user : userList) {
            if(user instanceof Teacher && !itsStudent){
                lastID = ((Teacher) user).getTeacherID() + 1;
            }
            if(user instanceof Student && itsStudent){
                lastID = ((Student) user).getStudentID() + 1;
            }
            
        }
        return lastID;
    }

    public List<User> getAllStudent(){
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                 result.add(user);
            }
        }
        return result;
    }

    public List<User> getAll(){
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            result.add(user);
        }
        return result;
    }
}
