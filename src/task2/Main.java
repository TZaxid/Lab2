package task2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Taras", "Dubyk", "Step", "30.07.1993");
        s1.show();
        s1.setBirthday("29.08.1992");
        Group g1 = new Group(2, "I-4");
        g1.addStudent(s1);
        g1.showStudents();
        g1.removeStudent(s1);
        g1.showStudents();
    }
}
