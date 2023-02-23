package chapterEight.Diary;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Diary {

    private ArrayList<Entry> entries = new ArrayList<>();

    private ArrayList<Integer> ids = new ArrayList<>();

    private String userName;
    private static String passWord = "9292";

    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    int newId = 0;

    public int generatePin() {
        if (ids.size() == 0) {
            ids.add(20230001);
        }
        for (int rice : ids) {
            int previous = ids.get(ids.size() - 1);
            newId = previous + 1;
            //break;
        }
        ids.add(newId);
        return newId;
    }

    public Entry createEntry(String title, String body) {
        newId = generatePin();
        LocalDate date = LocalDateTime.now().toLocalDate();
        Entry newEntry = new Entry(newId, title, body);
        entries.add(newEntry);
        display(newEntry.toString());
        return newEntry;
    }

    public Entry findEntry(int id) {
        Entry entry1 = null;
        for (var entry : entries) {
            if (Objects.equals(entry.getId(), id)) {
                entry1 = entry;
                display(entry1.toString());
            }
            else throw new IllegalArgumentException("Wrong ID");
            break;
            }

        return entry1;
    }

    public int countNumberOfEntries() {
        display(String.valueOf(entries.size()));
        return entries.size();
    }


    public void editEntry(int id, String editBody) {
        String result = null;

        for (var entry : entries) {
            //if ((entries.get(entries.size() - 1).getId()) != id)throw new IllegalArgumentException(("id doesnt exist"));
            if (Objects.equals(entry.getId(), id)) {
                entry.setEditedBody(editBody);
                result = entry.getBody() + " " + entry.getEditedBody();
                entry.setBody(result);
                display(entry.toString());}
                else throw new IllegalArgumentException("Wrong ID");
            break;
        }
    }


    public void deleteEntry(int id) {
        Entry entry1 = null;
        for (var entry : entries) {
            if (Objects.equals(entry.getId(), id)) {
                entry1 = entry;
                entries.remove(entry1);
                display("Entry deleted Successfully ");}
            }
        }


    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
}