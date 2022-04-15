package educationalCenter;

import educationalCenter.group.Group;
import educationalCenter.studenеs.Student;
import educationalCenter.subject.Subject;
import educationalCenter.teacher.Teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static educationalCenter.Days.*;

public class main {
    public static void main(String[] args) {
        ArrayList subjectsOleg = new ArrayList<>();
        subjectsOleg.add("Math");
        subjectsOleg.add("Chemistry");
        subjectsOleg.add("Physic");

        Set<String> olegSubjects = new HashSet<>();
        olegSubjects.addAll(subjectsOleg);

        Set<String> subjects = new HashSet<>();
        subjects.addAll(subjectsOleg);
        subjects.add("Chemistry");

        Days workerDaysOleg[] = new Days[]{MONDAY, TUESDAY, THURSDAY};
        Days workerDaysNika[] = new Days[]{MONDAY, WEDNESDAY, FRIDAY};
        Days workout[] = new Days[]{THURSDAY, SUNDAY};

        Student oleg = new Student("Oleg", olegSubjects, workout);
        Student nika = new Student("Nika", subjects, workerDaysNika);
        Teacher mather = new Teacher("Artur", new Student[]{oleg});

        Group AQA = new Group("AQA Automation", mather, new Student[]{oleg, nika});

//        System.out.println(math);
        System.out.println(oleg);
        System.out.println(mather);
        System.out.println();
        System.out.println(AQA);
    }
}
