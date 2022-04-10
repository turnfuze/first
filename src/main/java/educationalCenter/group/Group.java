package educationalCenter.group;

import educationalCenter.studenеs.Student;
import educationalCenter.teacher.Teacher;

import java.util.Arrays;

public abstract class Group {

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
        return "Group{" +
                "nameGroup='" + nameGroup + '\'' +
                ", students=" + Arrays.toString(students) +
                ", teacher=" + teacher +
                '}';
    }
}
