package onlyJava.lessons.educationalCenter;

import onlyJava.lessons.educationalCenter.group.Group;
import onlyJava.lessons.educationalCenter.studenеs.Student;
import onlyJava.lessons.educationalCenter.subject.Subject;
import onlyJava.lessons.educationalCenter.teacher.Teacher;

import java.util.HashSet;
import java.util.Set;

import static onlyJava.lessons.educationalCenter.Days.*;

public class main {
    public static void main(String[] args) {
//        ArrayList subjectsOleg = new ArrayList<>();
//        subjectsOleg.add("Math");
//        subjectsOleg.add("Chemistry");
//        subjectsOleg.add("Physic");

        Subject math = new Subject("Math", 24);
        Subject chemistry = new Subject("Chemistry",52);
        Subject physic = new Subject("Physic", 56);
        Subject draw = new Subject("Draw", 2);

        Set<Subject> olegSubjects = new HashSet<>();
        olegSubjects.add(math);
        olegSubjects.add(chemistry);
        olegSubjects.add(physic);

        Set<Subject> nikaSubjects = new HashSet<>();
        nikaSubjects.addAll(olegSubjects);
        nikaSubjects.add(draw);

        Days workerDaysOleg[] = new Days[]{MONDAY, TUESDAY, THURSDAY};
        Days workerDaysNika[] = new Days[]{MONDAY, WEDNESDAY, FRIDAY};
        Days workout[] = new Days[]{THURSDAY, SUNDAY};

        Student oleg = new Student("Oleg", olegSubjects, workout);
        Student nika = new Student("Nika", nikaSubjects, workerDaysNika);
        Teacher mather = new Teacher("Artur", new Student[]{oleg});

        Group AQA = new Group("AQA Automation", mather, new Student[]{oleg, nika});

        System.out.println(math);
        System.out.println(oleg);
        System.out.println(mather);
        System.out.println();
        System.out.println(AQA);
    }
}
