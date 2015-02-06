package task3;

import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publisher;
    private int pubYear;

    public Book(int id, String title, String authors, String publisher, int pubYear) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.pubYear = pubYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id < Integer.MAX_VALUE) {
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        if (authors != null) {
            this.authors = authors;
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher != null) {
            this.publisher = publisher;
        }
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        if (pubYear > 0 && pubYear <= LocalDate.now().getYear()) {
            this.pubYear = pubYear;
        }
    }

    public void show() {
        System.out.println("#" + id + " " + title + " " + authors + " " + pubYear);
    }
}
