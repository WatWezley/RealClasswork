package ChapterEight.Diary;

import chapterEight.Diary.Diary;
import chapterEight.Diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary wez;

    @BeforeEach
    public void setUp() {
        wez = new Diary("WatWezley", "0000");
        wez.createEntry("My Java Story", "And it began here");
    }

    @Test
    public void idCanBeCreatedTest() {
        int ids = (wez.generatePin());
        assertEquals(20230003, ids);
    }

    @Test
    public void entryCanBeViewAfterCreationTest() {
        Entry entry1 = wez.createEntry("Python Experience", "Another story begin");
        Entry entry2 = wez.createEntry("Database Journey", "The story continues");
        String expected = """
                Date: 2023-01-29
                Id Number: 20230002
                Title : My Java Story
                Body: And it began here
                """;
        assertEquals(expected, wez.findEntry(20230002).toString());
    }

    @Test
    public void inCorrectIdDoesNotWorkTest(){
        assertThrows(IllegalArgumentException.class,()-> wez.findEntry(20230004));
    }

    @Test
    public void noOfEntryTest() {
        assertEquals(1, wez.countNumberOfEntries());
    }

    @Test
    public void editDiaryTest() {
        wez.editEntry(20230002, "and so this is how it started");
        String addedEdited = "And it began here and so this is how it started";
        assertEquals(addedEdited, wez.findEntry(20230002).getBody());
    }

    @Test
    public void deleteEntryTest(){
        Entry entry1 = wez.createEntry("Python Experience", "Another story begin");
        Entry entry2 = wez.createEntry("Database Journey", "The story continues");
        wez.deleteEntry(20230003);
        assertEquals(2,wez.countNumberOfEntries());
    }
}

