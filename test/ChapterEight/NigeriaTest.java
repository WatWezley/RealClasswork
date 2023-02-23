package ChapterEight;

import chapterEight.EnumExample.Nigeria;
import chapterEight.EnumExample.Student;
import org.junit.jupiter.api.Test;

class NigeriaTest {

    @Test
    public void testForState() {
        Student student = new Student();
        student.setState("Sokoto");
        for (Nigeria zone : Nigeria.values()) {
            for (String state : zone.getState()) {
                if (student.getState().equalsIgnoreCase(state)) {
                    System.out.println("zone: "+zone.name()+" state: "+state);

                }
            }
        }
    }
}



