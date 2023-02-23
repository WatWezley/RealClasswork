package chapterEight.Diary;

import java.time.LocalDateTime;

public class Entry {


    private String title;

    private String body;

    private int id;

    public String editedBody;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getEditedBody() {
        return editedBody;
    }

    public void setEditedBody(String editedBody) {
        this.editedBody = editedBody;
    }

    public Entry(int id , String title, String body) {
        LocalDateTime ugo = LocalDateTime.now();
        this.title = title;
        this.id = id;
        this.body=body;
    }





    @Override
    public String toString(){
        return String.format("""
                Date: %s
                Id Number: %s
                Title : %s
                Body: %s
                """,LocalDateTime.now().toLocalDate(), id, title, body);
    }

        }



