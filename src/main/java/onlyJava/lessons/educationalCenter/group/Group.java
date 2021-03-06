package onlyJava.lessons.educationalCenter.group;

import onlyJava.lessons.educationalCenter.studenеs.Student;
import onlyJava.lessons.educationalCenter.teacher.Teacher;

import java.util.Arrays;

public class Group {

    private String nameGroup;
    private Student[] students;
    private Teacher teacher;

    public Group(String nameGroup, Teacher teacher, Student[] students) {
        this.nameGroup = nameGroup;
        this.students = students;
        this.teacher = teacher;
    }

    public Group(String nameGroup, Student[] students) {
        this.nameGroup = nameGroup;
        this.students = students;
    }

    public Group(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Group: " + nameGroup  +
                "\n students: " + Arrays.toString(students) +
                "\n teacher: " + teacher;
    }
}
