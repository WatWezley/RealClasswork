package ChapterEight.PhoneBook;

import chapterEight.PhoneBook.Contact;
import chapterEight.PhoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.DuplicateFormatFlagsException;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    public void startWith() {
        phoneBook = new PhoneBook();
        phoneBook.createContact("Renike", "Aliyah", "08100935776", "", "");
    }

    @Test
    public void contactCanBeCreatedTest() {
        assertEquals(1, phoneBook.getTotalNumberOfContacts());
    }

    @Test
    public void duplicateCopyTest(){
        assertThrows(DuplicateFormatFlagsException.class,()->phoneBook.createContact("Renike", "Aliyah", "08100935776", "", ""));
    }

    @Test
    public void contactCanBeViewedAfterCreation() {
        String expected = """
                ***************************************************
                        CONTACT DETAILS
                ***************************************************
                NAME: Renike Aliyah
                PHONE NUMBER: 08100935776
                MOBILE NUMBER: 
                EMAIL: 
                ***************************************************
                """;
        assertEquals(expected, phoneBook.viewContactWith("Renike Aliyah").toString());
    }

    @Test
    public void checkForErrorMessageIfWrongNameIsPut(){
        assertThrows(InputMismatchException.class,()->phoneBook.validateId("karl Aliyah"));
    }

    @Test
    public void editContactInformation(){
        phoneBook.editContact("Renike Aliyah","ugo karl","0807698967657","8789786875","moren@gmail.com");
        String expected = """
                ***************************************************
                        CONTACT DETAILS
                ***************************************************
                NAME: ugo karl
                PHONE NUMBER: 0807698967657
                MOBILE NUMBER:8789786875
                EMAIL:moren@gmail.com
                ***************************************************
                """;

        assertEquals(expected, phoneBook.viewContactWith("ugo karl").toString());
    }

    @Test
    public void deleteContactTest(){
        phoneBook.deleteContact("Renike Aliyah");
        assertEquals(0,phoneBook.getTotalNumberOfContacts());

    }

    }



