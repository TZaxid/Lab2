package task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private final static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d.M.yyyy");
    private int id;
    private String name;
    private String surname;
    private String fname;
    private LocalDate birthday;


    public Student(int id, String name, String surname, String fname, String birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fname = fname;
        this.birthday = LocalDate.parse(birthday, DATE_FORMATTER);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id < Integer.MAX_VALUE) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null) {
            this.surname = surname;
        }
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        if (fname != null) {
            this.fname = fname;
        }
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday, DATE_FORMATTER);
    }

    public void show() {
        System.out.println("#" + id + " " + name + " " + surname + " " + fname + " " + birthday);
    }
}
