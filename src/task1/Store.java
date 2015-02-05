package task1;

import java.util.ArrayList;

public class Store {
    private int sid;
    private String sname;
    private ArrayList<Product> sproducts;

    public Store(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
        sproducts = new ArrayList<Product>();
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        if (sid > 0 && sid < Integer.MAX_VALUE) {
            this.sid = sid;
        }
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        if (sname == null)
            this.sname = sname;
        else
            System.out.println("name error!");
    }

    public void showProducts() {
        for (Product p : sproducts) {
            p.show();
        }
    }

    public boolean isProductPresent(Product inPr) {
        for (Product p : sproducts) {
            if (p.getId() == inPr.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean addProduct(Product p) {
        if (!isProductPresent(p)) {
            sproducts.add(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeProduct (Product p) {
        if (isProductPresent(p)) {
            sproducts.remove(p);
            return true;
        } else {
            return false;
        }
    }
}
