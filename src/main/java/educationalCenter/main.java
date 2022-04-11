package educationalCenter;

import educationalCenter.group.Group;
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
        Days workout[] = new Days[]{THURSDAY,SUNDAY};

        Student oleg = new Student("Oleg",new Subject[]{math,physic,chemistry}, workout);
        Student nika = new Student("Nika", new Subject[]{physic,chemistry}, workerDaysNika);
        Teacher mather = new Teacher("Artur", new Student[]{oleg});

        Group AQA = new Group("AQA Automation",mather,new Student[]{oleg,nika});

        System.out.println(math);
        System.out.println(oleg);
        System.out.println(mather);
        System.out.println();
        System.out.println(AQA);
    }
}
