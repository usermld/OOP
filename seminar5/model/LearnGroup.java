package seminar5.model;

import java.util.ArrayList;
import java.util.List;

public class LearnGroup {
    private List<Student> studentGroup = new ArrayList<>();
    private Teacher teacherOfGroup;

    public LearnGroup (Teacher teacherOfGroup, List<Student> studentGroup){
        this.teacherOfGroup = teacherOfGroup;
        this.studentGroup = studentGroup;
    }

    public Teacher getTeacherOfGroup() {
        return teacherOfGroup;
    }
    public void setTeacherOfGroup(Teacher teacherOfGroup){
        this.teacherOfGroup = teacherOfGroup;
    }
    public List<Student> getStudentGroup(){
        return studentGroup;
    }
    public void setStudentGroup(List<Student> studentGroup){
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "Teacher of group: " + teacherOfGroup + ", " +
                "students: " + studentGroup;
    }

}
