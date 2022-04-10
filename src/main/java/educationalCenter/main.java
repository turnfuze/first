package educationalCenter;

import educationalCenter.studenеs.Student;
import educationalCenter.subject.Subject;
import educationalCenter.teacher.Teacher;
import static educationalCenter.Days.*;

public class main {
    public static void main(String[] args) {
        Subject math = new Subject("Math", 24);
        Subject chemistry = new Subject("Chemistry",52);
        Subject physic = new Subject("Physic", 56);

        Days workerDaysOleg[] = new Days[]{MONDAY,TUESDAY,THURSDAY};
        Days workerDaysNika[] = new Days[]{MONDAY, WEDNESDAY, FRIDAY};

        Student oleg = new Student("Oleg",new Subject[]{math,physic,chemistry},workerDaysOleg);
        Student nika = new Student("Nika", new Subject[]{physic,chemistry}, workerDaysNika);
        Teacher mather = new Teacher("Artur", new Student[]{oleg});

        System.out.println(math);
        System.out.println(oleg);
        System.out.println(mather);
    }
}
