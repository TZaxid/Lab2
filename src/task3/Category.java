package task3;

import java.util.ArrayList;

public class Category {
    private ArrayList<Book> books;
    private int cid;
    private String cname;

    public Category(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
        this.books = new ArrayList<Book>();
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        if (cid > 0 && cid < Integer.MAX_VALUE) {
            this.cid = cid;
        }
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        if (cname != null) {
            this.cname = cname;
        }
    }

    public void showBooks() {
        for (Book b : books) {
            b.show();
        }
    }

    public boolean isBookPresent(Book inB) {
        for (Book b : books) {
            if (inB.getId() == b.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean addBook(Book b) {
        if (!isBookPresent(b)) {
            books.add(b);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeBook(Book b) {
        if (isBookPresent(b)) {
            books.remove(b);
            return true;
        } else {
            return false;
        }
    }
}
