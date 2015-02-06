import task1.Product;
import task1.Store;
import task2.Student;
import task2.Group;
import task3.Book;
import task3.Category;
import task4.Artist;
import task4.Genres;

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

        Artist ar = new Artist(41, "vv", true, "10.5.2001");
        Artist ar1 = new Artist(42, "lababa", false, "5.11.1991");
//        ar.show();
        Genres gn1 = new Genres(52, "Pop");
        gn1.addArtist(ar);
        gn1.addArtist(ar1);
        gn1.showArtists();
        gn1.addArtist(ar);
        System.out.println(gn1.removeArtist(ar1));
        System.out.println(gn1.isArtistPresent(ar1));


    }
}
